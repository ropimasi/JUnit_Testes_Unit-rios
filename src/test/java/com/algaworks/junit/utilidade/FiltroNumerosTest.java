package com.algaworks.junit.utilidade;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;




class FiltroNumerosTest {

	@Test
	void retornarNumerosPares() {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> numerosParesEsperados = Arrays.asList(2, 4, 6);

		List<Integer> numerosObtidos = FiltroNumeros.numerosPares(numeros);

		assertIterableEquals(numerosParesEsperados, numerosObtidos);
		/* Verifica se duas listas são iguais: tanto em termos de elementos quanto de ordem.
		 * Se as listas forem iguais, o teste passa; caso contrário, falha.
		 */
	}

}
