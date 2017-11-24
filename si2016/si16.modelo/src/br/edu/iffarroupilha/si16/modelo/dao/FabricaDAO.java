package br.edu.iffarroupilha.si16.modelo.dao;

/**
 * 
 * @author Marcos
 * <p>
 * Classe utilizada para definir o motoro de persistência, ou seja o mecanismo de persistência 
 * adotado pela aplicação
 * </p>
 *
 */
public class FabricaDAO {
	
	private static IFabricaDAO fabrica ;
	
	/**
	 * Define a fábrica de DAO, ou seja, aponta para o objeto que sabe como construir objetos do tipo DAO
	 * @param _fabrica
	 */
	public static void defineFabrica (IFabricaDAO _fabrica){
		fabrica = _fabrica ; 
	}
	
	public static IFabricaDAO getFabrica(){
		if(fabrica == null){
			throw new RuntimeException(" Fabrica de DAO não definida!Chame o Metodo FabricaDAO.defineFabrica");
			
		}
		return fabrica ;
	}

}
