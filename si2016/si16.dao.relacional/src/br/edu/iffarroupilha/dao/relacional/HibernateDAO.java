package br.edu.iffarroupilha.dao.relacional;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.iffarroupilha.si16.modelo.IEntidade;
import br.edu.iffarroupilha.si16.modelo.dao.IDAO;
import br.edu.iffarroupilha.si16.modelo.dao.IFabricaDAO;

/**
 * @author Marcos
 *         <p>
 *         Implementação dos comportamentos, comuns a todas as entidades
 *         </p>
 */

public abstract class HibernateDAO implements IDAO{
	
	private Class classeEntidade ; 
	
	// Criando construtor para passar uma Entidade para o Criteria
	public HibernateDAO(Class <? extends IEntidade> classe) { // Tipando o este class pra receber por parametro apenas desse tipo no caso IEntidade, assim evita falhas como passar uma String ou Integer

		this.classeEntidade = classe ; 
		
	}

	public void gravar(IEntidade entidade) {
		// Abrindo a sessão
		Session s = HibernateConnection.getFactory().openSession();

		// cria uma transação
		s.beginTransaction();

		// Insere ou atualiza
		s.saveOrUpdate(entidade);

		// comitta a transação
		s.getTransaction().commit();
		// s.getTransaction().rollback() ; desfaz tudo que foi feito
		// anteriormente
	}

	public void remover(IEntidade entidade) {
		// Abrindo a sessão
		Session s = HibernateConnection.getFactory().openSession();

		// cria uma transação
		s.beginTransaction();

		// REMOVE OS DADOS
		s.remove(entidade);

		// comitta a transação
		s.getTransaction().commit();

	}

	public List buscaTodos() {
		Session s = HibernateConnection.getFactory().openSession() ; 
		
		Criteria c = s.createCriteria(classeEntidade) ; 
		List dados = c.list() ; 
		
		s.close();
		return dados ; 
	}

	public IEntidade buscaPorID(long id) {

		return null;
	}
	
}
