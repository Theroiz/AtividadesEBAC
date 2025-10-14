/**
 * 
 */
package main.principal.services;

import main.principal.domain.Cliente;
import main.principal.exceptions.DAOException;
import main.principal.exceptions.TipoChaveNaoEncontradaException;
import main.principal.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
