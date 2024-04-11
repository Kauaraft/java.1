package aula2;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				final int qntdTimes = 5;

			       final int qntdJogadores = 11;

			       

			       int i, j;

			       

			       int idade;

			       double altura, peso;

			       

			       float medIda = 0, medAlt = 0;

			       int contMediaIda = 0, contMediaAlt = 0;

			       

			       int qntdMenor18 = 0, qntdAcima80Kg = 0;

			       

			       Scanner sc = new Scanner(System.in);

			       

			       for (i = 1; i <= qntdTimes; i++) {

			           for (j = 1; j <= qntdJogadores; j++) {

			               System.out.println("idade do jogador: ");

			               idade = sc.nextInt();

			               System.out.println("altura do jogador: ");

			               altura = sc.nextDouble();

			               System.out.println("peso do jogador: ");

			               peso = sc.nextDouble();

			               

			               if (idade < 18) {

			                   qntdMenor18++;

			               }

			               if (peso > 80) {

			                   qntdAcima80Kg++;

			               }

			               

			               medIda += idade;

			               contMediaIda++;

			               medAlt += altura;

			               contMediaAlt++;

			           }

			           System.out.printf("A média de idade do time %d é %f\n", i, medIda/contMediaIda);

			           System.out.printf("A altura média do time %d é %f\n", i, medAlt/contMediaAlt);

			           

			           medIda = 0;

			           contMediaIda = 0;

			           medAlt = 0;

			           contMediaAlt = 0;

			}

			System.out.printf("O jogo apresenta %d jogadores menores que 18 anos\n", qntdMenor18);

			System.out.printf("O jogo apresenta %d jogadores acima de 80 Kg\n", qntdAcima80Kg);



			sc.close();

			}

			   

		}
