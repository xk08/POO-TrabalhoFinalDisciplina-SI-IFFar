package br.edu.iffarroupilha.si16.modelo.dao;

import java.util.List;

import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;
import br.edu.iffarroupilha.si16.modelo.IEntidade;

/**
 * <p>
 * Especifica os comportamento de persistência comum a todas
 * as entidades
 * </p>
 *
 * @author Prof. Fernando
 * @since 04/10/2017 21:29:34
 */
public interface IDAO {
	/**
	 * <p>
	 * Grava ou atualiza uma entidade
	 * </p>
	 * 
	 * @param cc
	 *            - objeto a ser gravar/atualizado
	 */
	public void gravar(IEntidade cc);

	/**
	 * <p>
	 * Remove uma entidade
	 * </p>
	 * 
	 * @param cc
	 */
	public void remover(IEntidade cc);

	/**
	 * <p>
	 * Busca todas os registros de determinada
	 * entidade
	 * </p>
	 * 
	 * @return
	 */
	public List buscaTodos();

	/**
	 * <p>
	 * Busca uma entidade a partir de seu campo identificador
	 * </p>
	 * 
	 * @param id
	 *            valor que identifica a entidade buscado
	 * @return objeto carregado, ou nulo caso não enconte nenhuma informação
	 */
	public IEntidade buscaPorID(long id);
}
