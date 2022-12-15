// Entidades possuem uma identidade única, enquanto VOs são considerados iguais, se todos os seus 
//atributos tiverem valores iguais.

package br.com.alura.escola.dominio.aluno;

public class Email {

	// VALUE OBJECT CLASS (VO)
	
	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
			throw new IllegalArgumentException("Email inválido!");
		}
		
		this.endereco = endereco;			
	}

	public String getEndereco() {
		return endereco;
	}
	
}
