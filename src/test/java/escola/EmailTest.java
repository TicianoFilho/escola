package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void deveLancarExceptionQuandoEmaileInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido.com"));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido@"));
	}

}
