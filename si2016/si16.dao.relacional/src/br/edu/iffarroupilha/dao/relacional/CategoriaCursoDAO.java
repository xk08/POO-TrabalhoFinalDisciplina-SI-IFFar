package br.edu.iffarroupilha.dao.relacional;

import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;
import br.edu.iffarroupilha.si16.modelo.IEntidade;
import br.edu.iffarroupilha.si16.modelo.dao.ICategoriaCursoDAO;

/**
 * 
 * @author Marcos
 * <p>
Implementa��o especifica para a manipula��o da tabela CategoriaCurso
</p>
 *
 */

public class CategoriaCursoDAO extends HibernateDAO implements ICategoriaCursoDAO{

	public CategoriaCursoDAO() {
		super(CategoriaCurso.class);

	}
	// Fazer nas outras classes a mesma coisa que essa

	
}
