package testeGit;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerNotas01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		int contador = 0;
		double soma = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a nota do aluno " + (i+1));
			lista.add(input.nextDouble());
			double notas = lista.get(i);
			if(notas < 6) {
				contador++;
			}
			soma += notas;
		}
		System.out.println("A soma das notas dos alunos é " + soma);
		double media = soma/lista.size();
		System.out.println("A media das notas informadas é: " + media);
		System.out.println("A quantidade de notas menores que 6 foi: " + contador);
		input.close();

	}

}
