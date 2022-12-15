package escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void deveLancarExceptionQuandoEmaileInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido.com"));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido@"));
	}

	@Test
	void devePermitirEmailValidoNaoLancaExcecao() {
		assertDoesNotThrow(() -> new Email("ticiano.filho@mv.com.br"));
		assertDoesNotThrow(() -> new Email("ticiano.filho@mv.com"));
	}
}
