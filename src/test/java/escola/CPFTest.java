package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void DeveLancarExcecaoCPFInvalido() {
		assertThrows( IllegalArgumentException.class, () -> new CPF("11122233344"));
	}

}
