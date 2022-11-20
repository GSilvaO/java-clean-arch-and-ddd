package br.com.gsilvao.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.gsilvao.escola.dominio.Evento;
import br.com.gsilvao.escola.dominio.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte {

	@Override
	protected void reageAo(Evento evento) {
		String momentoFormatado = evento.momento()
				.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println(
				String.format(
						"Aluno com CPF %s matriculado em: %s", 
						((AlunoMatriculado) evento).getCpfDoAluno(),
						momentoFormatado));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}
}