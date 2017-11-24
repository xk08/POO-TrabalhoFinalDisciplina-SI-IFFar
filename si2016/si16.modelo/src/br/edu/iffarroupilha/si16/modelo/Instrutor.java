package br.edu.iffarroupilha.si16.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Entidade que representa uma instrutor. O instrutor é o professor do curso
 * </p>
 *
 * @author Prof. Fernando
 * @since 06/09/2017 21:52:33
 */
@Entity
public class Instrutor extends Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idInstrutor;
	@Column(length=60, nullable=false)
	private String nome;
	@Column(length=100)
	private String formacao;
	

	public long getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(long idInstrutor) {
		this.idInstrutor = idInstrutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

}
