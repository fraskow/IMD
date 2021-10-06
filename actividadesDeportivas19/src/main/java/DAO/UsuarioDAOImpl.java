/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Usuario;
import interfacesDAO.UsuarioDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nators
 */
@Stateless
public class UsuarioDAOImpl implements UsuarioDao {

    @PersistenceContext(unitName = "imdJpa")
    private EntityManager em;

    @Override
    public List<Usuario> listarUsuario() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioByNombre(Usuario usuario) {
        String jpql = "select u from Usuario u where u.nick= :nick AND u.password= :password";
        try {
            Query query = em.createQuery(jpql);
            query.setParameter("nick", usuario.getNick());
            query.setParameter("password", usuario.getPassword());
            Usuario usuariobueno=  (Usuario) query.getSingleResult();
            return usuariobueno;
        } catch (Exception e) {
            Usuario usuariomalo=new Usuario();
            return usuariomalo;
        }
    }

    @Override
    public Usuario findUsuarioByID(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public Usuario findUsuarioByID(int id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public void addUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void refreshUsuario(Usuario usuario) {
        em.refresh(em.merge(usuario));
    }

    @Override
    public void removeUsuario(Usuario usuario) {
        em.remove(em.merge(usuario));
    }

}
