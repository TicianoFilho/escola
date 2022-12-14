package escola;

public class Email {

	// VALUE OBJECT CLASS
	
	private String endereco;

	protected Email(String endereco) {
		if (endereco == null || !endereco.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i")) {
			this.endereco = endereco;			
		}
	}

	public String getEndereco() {
		return endereco;
	}
	
}
