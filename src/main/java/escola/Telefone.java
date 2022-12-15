package escola;

public class Telefone {

	private String ddd;
	private String numero;
	
	protected Telefone(String ddd, String numero) {
		
		if (ddd == null || !ddd.matches("^\\((\\d{2})\\)")) {
			throw new IllegalArgumentException("DDD inválido");
		}
		
		if (numero == null || !numero.matches("^(?:[2-8]|9[1-9])[0-9]{4}\\-[0-9]{4}$")) {
			throw new IllegalArgumentException("Número inválido");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}	
	
	
	
}
