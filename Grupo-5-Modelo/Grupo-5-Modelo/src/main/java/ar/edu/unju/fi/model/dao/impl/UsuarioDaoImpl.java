package ar.edu.unju.fi.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.fi.unju.model.domian.Usuario;
import ar.edu.unju.fi.modelo.dao.UsuarioDao;

@Repository
@Transactional
public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Integer> implements UsuarioDao {

	public List<Usuario> listarUsuarios() {
		return listar();
	}

	public int  guardarUsuario(Usuario c) {
		return guardar(c);
	}

	public void eliminarUsuario(Usuario c) {
		eliminar(c);
	}

	public void actualizarUsuario(Usuario c) {
		actualizar(c);
	}

	public Usuario buscarUsuario(int id) {
		return buscar(id);
	}
	
	 public Usuario  validarUsuario(String usuario, String clave){
		 Criteria criteria = getSession().createCriteria(domainClass)
				 .add( Restrictions.eq("usuario", usuario))
				 .add( Restrictions.eq("clave", clave));
		return (Usuario) criteria.uniqueResult();
		 
	 }
	    
	   public  boolean usuarioDisponible(String usuario){
	    	return getSession().createCriteria(domainClass)
	    			.add(Restrictions.eq("usuario", usuario))
	    			.list().isEmpty();    	
	    }


}
