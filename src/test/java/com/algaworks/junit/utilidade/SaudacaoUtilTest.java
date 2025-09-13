package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;




class SaudacaoUtilTest {

	@Test
	void test() {
		String saudacao = SaudacaoUtil.saudar(10);
		Assertions.assertTrue(saudacao.equals("Bom dia"));
		Assertions.assertEquals(saudacao, "Bom dia");
	}

}
