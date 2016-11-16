package ar.edu.unju.fi.model.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.fi.unju.model.domian.Cliente;
import ar.edu.unju.fi.modelo.dao.ClienteDao;

@Repository
@Transactional
public class ClienteDaoImpl extends GenericDaoImpl<Cliente, Long> implements ClienteDao{

	public List<Cliente> listarClientes() {
		return listar();
	}

	public long guardarCliente(Cliente c) {
		return guardar(c);
	}

	public void eliminarCliente(Cliente c) {
		eliminar(c);
	}

	public void actualizarCliente(Cliente c) {
		actualizar(c);
	}

	public Cliente buscarCliente(long id) {
		return buscar(id);
	}



}
