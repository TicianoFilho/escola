package escola;

import java.util.List;

public class Aluno {

	// ENTITY CLASS - BECAUSE THERE'S A UNIQUE KEY TO DISTINGUISH ALUNO = CPF
	
	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public CPF getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Email getEmail() {
		return email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	
}
