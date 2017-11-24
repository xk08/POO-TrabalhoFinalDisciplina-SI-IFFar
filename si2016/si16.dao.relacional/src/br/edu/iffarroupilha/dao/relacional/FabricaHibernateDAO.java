package br.edu.iffarroupilha.dao.relacional;

import br.edu.iffarroupilha.si16.modelo.IEntidade;
import br.edu.iffarroupilha.si16.modelo.dao.IDAO;
import br.edu.iffarroupilha.si16.modelo.dao.IFabricaDAO;

/**
 * Classe para criar DAO's para o modelo de pessistência com o Hibernate
 * @author Marcos
 *
 */
public class FabricaHibernateDAO implements IFabricaDAO {
	
	 public IDAO criaDAO(Class<? extends IEntidade> classe) {
			
		 try{
		 // Concatenar as String de forma correta
		 StringBuffer sb =  new StringBuffer() ; 
		 
		 // Definindo o pacote do DAO
		 sb.append("br.edu.iffarroupilha.dao.relacional") ;
		 sb.append(".").append( classe.getSimpleName() ) ; 
		 sb.append("DAO") ; 
		 
		 Class classeDAO = Class.forName(sb.toString()) ; 
		 
		 
		return (IDAO) classeDAO.newInstance(); // Isntanciando o DAO
		
	}catch(Exception ex){
		//Para a execução
		throw new RuntimeException("Falha ao construir o DAO") ; 
	}
  }

}
