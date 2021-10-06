/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.UsuarioDAOImpl;
import beans.Usuario;
import interfacesDAO.UsuarioDao;
import interfacesService.UsuarioService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author nators
 */
@Stateless
public class UsuarioServiceImpl implements UsuarioService{
        @Inject
      private UsuarioDao usudao;
              
      @Override
      public List<Usuario> listarUsuario() {
            return usudao.listarUsuario();
      }

      @Override
      public Usuario findUsuarioByNombre(Usuario usuario) {
            return usudao.findUsuarioByNombre(usuario);
      }

      @Override
      public Usuario findUsuarioByID(Usuario usuario) {
            return usudao.findUsuarioByID(usuario);
      }

      @Override
      public Usuario findUsuarioByID(int id) {
            return usudao.findUsuarioByID(id);
      }

      @Override
      public void addUsuario(Usuario usuario) {
            usudao.addUsuario(usuario);
      }

      @Override
      public void updateUsuario(Usuario usuario) {
            usudao.updateUsuario(usuario);
    
      }

      @Override
      public void refreshUsuario(Usuario usuario) {
            usudao.refreshUsuario(usuario);
      }

      @Override
      public void removeUsuario(Usuario usuario) {
            usudao.removeUsuario(usuario);
      }
      
}
