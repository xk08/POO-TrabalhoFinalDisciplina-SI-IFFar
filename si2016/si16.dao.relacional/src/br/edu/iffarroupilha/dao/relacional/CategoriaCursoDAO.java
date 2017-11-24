package br.edu.iffarroupilha.dao.relacional;

import br.edu.iffarroupilha.si16.modelo.CategoriaCurso;
import br.edu.iffarroupilha.si16.modelo.IEntidade;
import br.edu.iffarroupilha.si16.modelo.dao.ICategoriaCursoDAO;

/**
 * 
 * @author Marcos
 * <p>
Implementação especifica para a manipulação da tabela CategoriaCurso
</p>
 *
 */

public class CategoriaCursoDAO extends HibernateDAO implements ICategoriaCursoDAO{

	public CategoriaCursoDAO() {
		super(CategoriaCurso.class);

	}
	// Fazer nas outras classes a mesma coisa que essa

	
}
