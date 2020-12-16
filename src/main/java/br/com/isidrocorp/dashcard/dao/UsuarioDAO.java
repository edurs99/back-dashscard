package br.com.isidrocorp.dashcard.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.dashcard.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	/* este método segue a  estratégia QueryByMethodName, ou seja, se seguirmos o padrão do JPA, ele irá 
	 * decodificar este método da seguinte maneira:
	 *   findBy          => select
	 *   Email and Senha => where email = ? and senha = ?
	 */
	public Usuario findByEmailAndSenha(String email, String senha);
	
	public Usuario findByEmailOrRacf(String email, String racf);

}
