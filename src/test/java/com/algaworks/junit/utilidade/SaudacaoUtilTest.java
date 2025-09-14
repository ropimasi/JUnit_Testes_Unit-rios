package com.algaworks.junit.utilidade;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;




class SaudacaoUtilTest {

	@Test
	void saudarHoraValida() {
		String saudacao = SaudacaoUtil.saudar(0);
		assertEquals("Bom dia", saudacao, "Saudação incorreta para o período da manhã.");

		saudacao = SaudacaoUtil.saudar(11);
		assertEquals("Bom dia", saudacao, "Saudação incorreta para o período da manhã.");

		saudacao = SaudacaoUtil.saudar(12);
		assertEquals("Boa tarde", saudacao, "Saudação incorreta para o período da tarde.");

		saudacao = SaudacaoUtil.saudar(17);
		assertEquals("Boa tarde", saudacao, "Saudação incorreta para o período da tarde.");

		saudacao = SaudacaoUtil.saudar(18);
		assertEquals("Boa noite", saudacao, "Saudação incorreta para o período da noite.");

		saudacao = SaudacaoUtil.saudar(23);
		assertEquals("Boa noite", saudacao, "Saudação incorreta para o período da noite.");

	}



	@Test
	public void saudarHoraInvalida() {
		try {
			SaudacaoUtil.saudar(-1);
		} catch (IllegalArgumentException e) {
			assertEquals("Hora inválida", e.getMessage());
		}

		try {
			SaudacaoUtil.saudar(24);
		} catch (IllegalArgumentException e) {
			assertEquals("Hora inválida", e.getMessage());
		}
	}



	@Test
	public void lancarExceptionHoraInvalida() {
		IllegalArgumentException exception;

		exception = assertThrows(IllegalArgumentException.class, () -> SaudacaoUtil.saudar(-1));
		assertEquals("Hora inválida", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> SaudacaoUtil.saudar(24));
		assertEquals("Hora inválida", exception.getMessage());
	}



	@Test
	public void naoLancarExceptionHoraValida() {
		assertDoesNotThrow(() -> SaudacaoUtil.saudar(0));
		assertDoesNotThrow(() -> SaudacaoUtil.saudar(23));
	}

}
