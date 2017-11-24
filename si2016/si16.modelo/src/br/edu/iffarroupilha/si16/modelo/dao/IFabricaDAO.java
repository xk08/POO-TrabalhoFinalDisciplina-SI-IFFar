package br.edu.iffarroupilha.si16.modelo.dao;

import br.edu.iffarroupilha.si16.modelo.IEntidade;

/**
 * 
 * @author Marcos
 * 
 * <p>
 * Especifica o comportamento para a cria��o de objetos do tipo DAO (padr�o)
 * </p>
 *
 */

public interface IFabricaDAO {
	
	/**
	 * Cria um novo dao a partir de uma classe de entidade
	 * @param 
	 * @return
	 */
	
	public IDAO criaDAO(Class <? extends IEntidade> classe) ; 


}
