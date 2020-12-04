package david.augusto.luan.entidades;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MetodosQueRecebemFuncoesLambdaComoParametro {

	public static void main(String[] args) {

		System.out.println("Cria a lista com os elementos que serão realizadas operações\n");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		System.out.println("---------------------------------------------" + "\n");
		System.out.println("Imprime todos os números:");
		System.out.println("---------------------------------------------");
		avaliaExprecao(list, (n) -> true);
		System.out.println("---------------------------------------------" + "\n");

		System.out.println("Não imprime nenhum número:");
		System.out.println("---------------------------------------------");
		avaliaExprecao(list, (n) -> false);
		System.out.println("---------------------------------------------" + "\n");

		System.out.println("Imprime todos os números pares:");
		System.out.println("---------------------------------------------");
		avaliaExprecao(list, (n) -> n % 2 == 0);
		System.out.println("---------------------------------------------" + "\n");

		System.out.println("Imprime todos os números impares:");
		System.out.println("---------------------------------------------");
		avaliaExprecao(list, (n) -> n % 2 != 0);
		System.out.println("---------------------------------------------" + "\n");

		System.out.println("Imprime todos os números maiores que 5 e menores que 10:");
		System.out.println("---------------------------------------------");
		avaliaExprecao(list, (n) -> n > 5 && n < 10);
		System.out.println("---------------------------------------------" + "\n");
	}

	public static void avaliaExprecao(List<Integer> list, Predicate<Integer> predicate) {
		list.forEach(n -> {
			if (predicate.test(n)) {
				System.out.println(n + "");
			}
		});
	}
}