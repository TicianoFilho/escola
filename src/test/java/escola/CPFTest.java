package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void DeveNaoLancarExcecao() {
		assertDoesNotThrow(() -> new CPF("11122233344"));
		assertDoesNotThrow(() -> new CPF("111.222.333-44"));
	}
	
	@Test
	void DeveLancarExcecao() {
		assertThrows(IllegalArgumentException.class, () -> new CPF("111122233344")); // Um dígito a mais
		assertThrows(IllegalArgumentException.class, () -> new CPF("1122233344")); // Um dígito a menos
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
	}

}
