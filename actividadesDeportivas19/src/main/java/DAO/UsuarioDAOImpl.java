/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import beans.Usuario2;
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
    public List<Usuario2> listarUsuario2() {
        return em.createNamedQuery("Usuario2.findAll").getResultList();
    }

    @Override
    public Usuario2 findUsuario2ByNombre(Usuario2 usuario2) {
        String jpql = "select u from Usuario2 u where u.nick= :nick AND u.password= :password";
        
        Query query = em.createQuery(jpql);
        query.setParameter("nick", usuario2.getNick());
        query.setParameter("password", usuario2.getPassword());
        return (Usuario2) query.getSingleResult();
    }

    @Override
    public Usuario2 findUsuario2ByID(Usuario2 usuario2) {
        return em.find(Usuario2.class, usuario2.getIdUsuario2());
    }

    @Override
    public Usuario2 findUsuario2ByID(int id) {
        return em.find(Usuario2.class, id);
    }

    @Override
    public void addUsuario2(Usuario2 usuario2) {
        em.persist(usuario2);
    }

    @Override
    public void updateUsuario2(Usuario2 usuario2) {
        em.merge(usuario2);
    }

    @Override
    public void refreshUsuario2(Usuario2 usuario2) {
        em.refresh(em.merge(usuario2));
    }

    @Override
    public void removeUsuario2(Usuario2 usuario2) {
        em.remove(em.merge(usuario2));
    }

}
