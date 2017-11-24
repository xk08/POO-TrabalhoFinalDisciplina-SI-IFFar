package br.edu.iffarroupilha.si16.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * <p>
 * Entidade associativa entre curso e aluno, um aluno pode frequentar ou cursar
 * vários cursos. Um curso é composto por vários alunos. Neste caso refere-se
 * uma relacionamento N x N (muitos para muitos)
 * </p>
 *
 * @author Prof. Fernando
 * @since 06/09/2017 22:10:12
 */
@Entity
public class AlunoCurso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAlunoCurso;
	@ManyToOne
	@JoinColumn(nullable=false, name="idAluno")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(nullable=false, name="idCurso")
	private Curso curso;

	public long getIdAlunoCurso() {
		return idAlunoCurso;
	}

	public void setIdAlunoCurso(long idAlunoCurso) {
		this.idAlunoCurso = idAlunoCurso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
