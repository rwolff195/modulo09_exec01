package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadoTerceiro;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Uma empresa possui funcionários próprios e terceirizados.
		Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
		Funcionários terceirizado possuem ainda uma despesa adicional.
		O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os
		funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
		Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista.
		Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
		*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Entre com o numero de Empregados: ");
		int n = sc.nextInt();
		
		for (int i =1; i<=n; i++) {
			
			System.out.println("Dados do Empredago # "+ i +":");
			System.out.println("Terceiro (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Entre com o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Entre com as horas: ");
			int horas = sc.nextInt();
			System.out.print("Entre com o valor por horas R$: ");
			double valorHora = sc.nextDouble();
			if(ch == 's') {
				System.out.print("Entre com o custo adicional R$: ");
				double custoAdicional = sc.nextDouble();
				list.add(new EmpregadoTerceiro(nome, horas, valorHora, custoAdicional));
			}
			else {
				/*
				Empregado empregado = new Empregado(nome, horas, valorHora);
				list.add(empregado);
				Estas linhas acima, tem o mesmo resultado da linha abaixo.
				*/
				list.add(new Empregado(nome, horas, valorHora));
			}//fim if
			
		}//fim for
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - R$ "+ String.format("%.2f", emp.pagamento()));
		}
		
		
		sc.close();
	}

}
