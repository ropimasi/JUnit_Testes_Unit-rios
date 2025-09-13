package com.algaworks.junit.utilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;




class SaudacaoUtilTest {

	@Test
	void test() {
		String saudacao = SaudacaoUtil.saudar(10);
		// assertTrue(saudacao.equals("Bom dia"));
		assertEquals("Bom dia", saudacao, "Saudação incorreta para o período da manhã.");

	}

}
