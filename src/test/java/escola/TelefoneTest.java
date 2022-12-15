package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void DeveTerDDDInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("(81", "99988-5522")); 
		assertThrows(IllegalArgumentException.class, () -> new Telefone("81", "99988-5522")); 
		assertThrows(IllegalArgumentException.class, () -> new Telefone("8", "99988-5522"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "99988-5522")); 
	}
	
	@Test
	void DeveTerDDDValidoENumeroInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("(81)", "9988-5522")); 
		assertThrows(IllegalArgumentException.class, () -> new Telefone("(81)", "99885522"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("(81)", "999885522"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("(81)", null));
	}
	
	@Test
	void DeveTerDDDValidoENumeroValido() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("(81)", "99988-5522"));  
	}

}
