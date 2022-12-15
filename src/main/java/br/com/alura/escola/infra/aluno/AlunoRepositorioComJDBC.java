package br.com.alura.escola.infra.aluno;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoRepositorio;
import br.com.alura.escola.dominio.aluno.CPF;

public class AlunoRepositorioComJDBC implements AlunoRepositorio {

	@Override
	public void criarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Aluno buscarPorCpf(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
