package br.com.alura.escola.infra.aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoRepositorio;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Telefone;

public class AlunoRepositorioComJDBC implements AlunoRepositorio {

	private Connection connection;
	
	public AlunoRepositorioComJDBC(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void criarAluno(Aluno aluno) {
		try {
			String sql = "insert into aluno values(?, ?, ?)";
			PreparedStatement statement;
			statement = connection.prepareStatement(sql);
			statement.setNString(1, aluno.getCpf());
			statement.setNString(2, aluno.getNome());
			statement.setNString(3, aluno.getEmail());
			statement.execute();
			
			sql = "insert into telefone values(?, ?)";
			statement = connection.prepareStatement(sql);
			for (Telefone telefone : aluno.getTelefones()) {
				statement.setString(1, telefone.getDdd());
				statement.setString(2, telefone.getNumero());
				statement.execute();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
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
