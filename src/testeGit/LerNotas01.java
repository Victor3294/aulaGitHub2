package testeGit;


import java.util.Scanner;

public class LerNotas01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notas = new double[5];
		double soma = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a nota do aluno " + (i+1));
			notas[i] = input.nextDouble();
			soma =+ notas[i];
		}
		System.out.println("A soma das notas dos alunos é " + soma);
		System.out.println("Mudança foda");
		input.close();

	}

}
