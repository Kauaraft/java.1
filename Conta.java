package aula2;



import java.util.Scanner;



public class Conta {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		float n1, n2, n3, n4;

		float a, a1;

		

		

		Scanner sc =new Scanner(System.in);

		

		System.out.println("informe o total de aulas: ");

		a = sc.nextFloat();

		

		System.out.println("informe quantas aulas compareceu: ");

		a1 = sc.nextFloat();

		

		System.out.println("informe a 1 nota: ");

		n1 = sc.nextFloat();

		

		System.out.println("informe a 2 nota: ");

		n2 = sc.nextFloat();

		

		System.out.println("informe a 3 nota: ");

		n3 = sc.nextFloat();

		

		System.out.println("informe a 4 nota: ");

		n4 = sc.nextFloat();

		

		float presenca = (a1/a)*100;

		String resultado;

		

		float media = (n1+n2+n3+n4)/4;

		

		

		if((media >=6.0)&& (presenca >= 75)) {

			resultado = "aprovado";

		}else {

			resultado="reprovado";

		}

		

		System.out.printf("\n O aluno teve %.1f de media e %.1f%% de frequencia e esta %s",media, presenca, resultado);

		

		sc.close();



	}



}
