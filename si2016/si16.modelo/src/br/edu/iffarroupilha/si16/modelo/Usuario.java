package br.edu.iffarroupilha.si16.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Classe abstrata que representa as informações de um utilizador
 * (especializações tais como aluno e instrutor) do sistema
 * </p>
 *
 * @author Prof. Fernando
 * @since 06/09/2017 22:16:52
 */
@Entity
public abstract class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;
	@Column(length = 70, nullable = false)
	private String email;
	@Column(length = 20, nullable = false)
	private String senha;

	public String getEmail() {
		return email;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
