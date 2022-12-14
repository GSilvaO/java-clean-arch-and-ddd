package br.com.gsilvao.escola.academico.dominio.aluno;

import br.com.gsilvao.escola.shared.dominio.CPF;

public class AlunoBuilder {

	private Aluno aluno;
	
	public AlunoBuilder comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public AlunoBuilder comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
}
