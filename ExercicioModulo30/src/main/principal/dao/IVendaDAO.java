/**
 * 
 */
package main.principal.dao;

import main.principal.dao.generic.IGenericDAO;
import main.principal.domain.Venda;
import main.principal.exceptions.DAOException;
import main.principal.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
