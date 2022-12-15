package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface AlunoRepositorio {

	void criarAluno(Aluno aluno);
	Aluno buscarPorCpf(CPF cpf);
	List<Aluno> listarTodosAlunosMatriculados();
	// ...
}
