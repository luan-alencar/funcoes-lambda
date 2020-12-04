package david.augusto.luan.entidades;

import java.util.Arrays;
import java.util.List;

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

	}
}
