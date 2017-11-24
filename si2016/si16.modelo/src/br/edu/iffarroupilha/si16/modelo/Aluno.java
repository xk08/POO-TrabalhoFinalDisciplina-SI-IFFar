package br.edu.iffarroupilha.si16.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Representa um estudante dentro da aplicação. Cada aluno pode cursar 'n'
 * cursos
 * </p>
 *
 * @author Prof. Fernando
 * @since 06/09/2017 22:06:16
 */
@Entity
public class Aluno extends Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAluno;
	@Column(nullable=false, length=60)
	private String nome;
	

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
