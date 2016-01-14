package br.com.caelum.fj91.banco.persistencia;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class Dao<T> {

	/**
	 * Erro1 - throws SQLException: não é sempre que vai usar JDBC (JPA por exemplo)
	 * Erro2 - a classe de negócio não precisa saber que deve usar a Exception
	 * Erro3 - vaza detalhe da implementação (JDBC)
	 * 
	 * Correção: criar uma PersistenciaException 
	 * 1 - (extends Exception) -- checked exception.
	 *    obs: todos métodos que usam o adiciona, precisam do throw PersistenciaException
	 * 2 - extends Runtime Exception -- unchecked exception
	 *     ninguém precisa exibir a exception. A melhor forma de exibir seria através de um filter
	 * 
	 * @param t
	 * @throws SQLException
	 */
	public void adiciona(T t) throws SQLException {
		// imagine um banco de dados aqui
		System.out.println("Adicionando novo objeto " + t.getClass().getName());
	}

	public void remove(T t) throws SQLException {
		// imagine um banco de dados aqui
		System.out.println("Removendo objeto " + t.getClass().getName());
	}

	public void atualiza(T t) throws SQLException {
		// imagine um banco de dados aqui
		System.out.println("Atualizando objeto " + t.getClass().getName());
	}

	public List<T> listaTodos() throws SQLException {
		// imagine um banco de dados aqui
		System.out.println("Listando tudo");
		return Collections.emptyList();
	}
}