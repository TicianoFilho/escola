// Entidades possuem uma identidade única, enquanto VOs são considerados iguais, se todos os seus 
//atributos tiverem valores iguais.

package escola;

public class Email {

	// VALUE OBJECT CLASS (VO)
	
	private String endereco;

	protected Email(String endereco) {
		if (endereco == null || !endereco.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i")) {
			throw new IllegalArgumentException("Email inválido!");
		}
		this.endereco = endereco;			
	}

	public String getEndereco() {
		return endereco;
	}
	
}
