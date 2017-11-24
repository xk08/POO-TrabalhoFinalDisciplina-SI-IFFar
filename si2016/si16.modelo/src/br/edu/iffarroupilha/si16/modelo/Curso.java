package br.edu.iffarroupilha.si16.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * <p>
 * Entidade que representa um curso dentro do sistema. Sempre é vinculado a um
 * instrutor e pertence a uma categoria especifica
 * </p>
 *
 * @author Prof. Fernando
 * @since 06/09/2017 21:56:41
 */
@Entity
public class Curso implements IEntidade {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCurso;
	@Column(length=100, nullable=false)
	private String descricao;
	@Column(nullable=false)
	private int cargaHoraria;
	@ManyToOne
	@JoinColumn(name="idInstrutor", nullable=false)
	private Instrutor instrutor;
	@ManyToOne
	@JoinColumn(name="idCategoria", nullable=false)
	private CategoriaCurso categoriaCurso;

	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	public CategoriaCurso getCategoriaCurso() {
		return categoriaCurso;
	}

	public void setCategoriaCurso(CategoriaCurso categoriaCurso) {
		this.categoriaCurso = categoriaCurso;
	}

}
