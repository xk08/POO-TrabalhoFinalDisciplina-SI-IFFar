package br.edu.iffarroupilha.si16.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Entidade que representa a categoria de um curso.
 * </p>
 *
 * @author Prof. Fernando
 * @since 06/09/2017 21:45:54
 */
@Entity
public class CategoriaCurso implements IEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategoriaCurso;
	@Column(length = 50, nullable = false)
	private String descricao;

	public long getIdCategoriaCurso() {
		return idCategoriaCurso;
	}

	public void setIdCategoriaCurso(long idCategoriaCurso) {
		this.idCategoriaCurso = idCategoriaCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
