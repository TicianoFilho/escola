package escola;

import java.util.List;

public class Aluno {

	// ENTITY CLASS - BECAUSE THERE'S A UNIQUE KEY TO DISTINGUISH ALUNO = CPF
	
	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones;
}
