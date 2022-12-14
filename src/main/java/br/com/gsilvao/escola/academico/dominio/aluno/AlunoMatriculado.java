package br.com.gsilvao.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.gsilvao.escola.shared.dominio.CPF;
import br.com.gsilvao.escola.shared.dominio.evento.Evento;
import br.com.gsilvao.escola.shared.dominio.evento.TipoDeEvento;

public class AlunoMatriculado implements Evento {

	private final CPF cpfDoAluno;
	private final LocalDateTime momento;
	
	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return momento;
	}
	
	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}
	
	@Override
	public Map<String, Object> informacoes() {
		return Map.of("cpf", cpfDoAluno);
	}
	
	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}
}
