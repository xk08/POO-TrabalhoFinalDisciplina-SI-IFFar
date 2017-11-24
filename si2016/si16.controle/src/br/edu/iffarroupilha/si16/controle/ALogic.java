package br.edu.iffarroupilha.si16.controle;

import java.util.List;

import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;
import br.edu.iffarroupilha.si16.modelo.IEntidade;
import br.edu.iffarroupilha.si16.modelo.dao.FabricaDAO;
import br.edu.iffarroupilha.si16.modelo.dao.IDAO;

/**
 * <p>
 * Generalização das ações de lógica comun as entidades
 * </p>
 *
 * @author Prof. Fernando
 * @since 21/09/2017 19:58:23
 */
public abstract class ALogic {

	private IDAO dao;

	public ALogic(Class <? extends IEntidade> classe) {
		
		this.dao = FabricaDAO.getFabrica().criaDAO(classe) ; 
	
		
	}

	/**
	 * <p>
	 * Ação utilizada para gravar e atualizar uma entidade no banco de dados.
	 * </p>
	 * 
	 * @param entidade
	 *            - objeto a ser gravado/atualizado
	 */
	public void gravar(IEntidade entidade) {
		// ainda nao sei
		// depende do modelo de persistencia
		// persistencia é um problema a ser resolvido
		this.dao.gravar(entidade);

	}

	/**
	 * <p>
	 * Remove um objeto do banco de dados de forma definitiva
	 * </p>
	 * 
	 * @param entidade
	 *            - Objeto a ser excluido
	 */
	public void excluir(IEntidade entidade) {
		this.dao.remover(entidade);
	}

	/**
	 * <p>
	 * Retorna uma listagem com todas as ocorrencias
	 * associadas a entidade do DAO
	 * </p>
	 * 
	 * @return listagem com todas as categorias
	 */
	public List listarTodos() {
		return this.dao.buscaTodos();
	}

	/**
	 * <p>
	 * Busca uma entidade a partir de seu campo chave
	 * </p>
	 * 
	 * @param id
	 *            - chave identificadora
	 * @return - entidade associada a chave
	 */
	public IEntidade buscaPorID(long id) {
		return this.dao.buscaPorID(id);
	}
}
