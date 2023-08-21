package testeGit;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerNotas01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Double> lista = new ArrayList<>();
		double soma = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a nota do aluno " + (i+1));
			lista.add(input.nextDouble());
			soma =+ lista.get(i);
		}
		System.out.println("A soma das notas dos alunos é " + soma);
		double media = soma/lista.size();
		System.out.println("A media das notas informadas é: " + media);
		input.close();

	}

}
