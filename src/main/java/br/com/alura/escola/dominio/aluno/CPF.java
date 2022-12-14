package br.com.alura.escola.dominio.aluno;

public class CPF {
	
	private String numero;

	public CPF(String numero) {
		if (numero == null || 
				!numero.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			throw new IllegalArgumentException("CPF Inválido!");
		}
		this.numero = numero;			
	}

	public String getNumero() {
		return numero;
	}
	
	
}
