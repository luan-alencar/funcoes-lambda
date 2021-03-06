package david.augusto.luan.entidades;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FuncoesLambdaComCollection {

	public static void main(String[] args) {

		System.out.println("Imprimir todos elementos da lista!" + "\n");
		System.out.println("Integer");
		System.out.println("---------------------------------------------" + "\n");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// recebe como parametro uma função lambda
		list.forEach(i -> {
			// que retorna todos numeros pares da iteração
			if (i % 2 == 0) {
				System.out.println(i);
			}
		});

		System.out.println("---------------------------------------------" + "\n");
		System.out.println("String");
		System.out.println("---------------------------------------------" + "\n");
		List<String> list2 = Arrays.asList("Fulano 1", "Fulano 2", "Fulano 3", "Fulano 4", "Fulano 5");
		list2.forEach(i2 -> System.out.println(i2));
		System.out.println("---------------------------------------------" + "\n");

		System.out.println("---------------------------------------------" + "\n");
		System.out.println("Integer");
		System.out.println("---------------------------------------------" + "\n");
		System.out.println("Imprime o quadrado de todos os elementos da lista!");
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list3.forEach(n -> System.out.println(n * n));
		System.out.println("---------------------------------------------" + "\n");

		System.out.println("---------------------------------------------" + "\n");
		System.out.println("Ordenação");
		System.out.println("---------------------------------------------" + "\n");
		System.out.println("Ordenando pessoas pelo nome:");
		List<Pessoa> list4 = Arrays.asList(new Pessoa("Luan", 24), new Pessoa("Beltrano", 83),
				new Pessoa("Welinton", 78), new Pessoa("Amanda", 92), new Pessoa("Bruna", 23),
				new Pessoa("Gabriela", 1));
		// Ordenando a lista com a interface Comparator
		Collections.sort(list4, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()));
		// Imprimindo a função lambda ordenada em ordem Alfabética!
		list4.forEach(n -> System.out.println(n.getNome()));

		System.out.println("\nOrdenando pessoas pela idade:");
		// Ordenando a lista com a interface Comparator
		Collections.sort(list4, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getIdade().compareTo(pessoa2.getIdade()));
		// Imprimindo a função lambda ordenada em ordem de idade em ASC!
		list4.forEach(n -> System.out.println(n.getNome()));

		System.out.println("\nOrdenando pessoas com mais de 30 anos de idade:");
		// Filtrando elementos com funções lambda criando um stream() de dados
		List<Pessoa> pessoasComMaisDe30 = list4.stream().filter(n -> n.getIdade() > 30).collect(Collectors.toList());
		pessoasComMaisDe30.forEach(n -> System.out.println(n.getNome()));
		
		System.out.println("\nOrdenando pessoas que iniciam com L:");
		// Filtrando elementos com funções lambda para pessoas que comecem com L
		List<Pessoa> pessoasQueComecamComL = list4
				.stream()
				.filter(n -> n.getNome().startsWith("L"))
				.collect(Collectors.toList());
		pessoasQueComecamComL.forEach(n -> System.out.println(n.getNome()));
		System.out.println("---------------------------------------------" + "\n");
	}
}
