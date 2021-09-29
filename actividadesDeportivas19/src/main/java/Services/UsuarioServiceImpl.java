/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAO.UsuarioDAOImpl;
import beans.Usuario2;
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
      public List<Usuario2> listarUsuario2() {
            return usudao.listarUsuario2();
      }

      @Override
      public Usuario2 findUsuario2ByNombre(Usuario2 usuario2) {
            return usudao.findUsuario2ByNombre(usuario2);
      }

      @Override
      public Usuario2 findUsuario2ByID(Usuario2 usuario2) {
            return usudao.findUsuario2ByID(usuario2);
      }

      @Override
      public Usuario2 findUsuario2ByID(int id) {
            return usudao.findUsuario2ByID(id);
      }

      @Override
      public void addUsuario2(Usuario2 usuario2) {
            usudao.addUsuario2(usuario2);
      }

      @Override
      public void updateUsuario2(Usuario2 usuario2) {
            usudao.updateUsuario2(usuario2);
    
      }

      @Override
      public void refreshUsuario2(Usuario2 usuario2) {
            usudao.refreshUsuario2(usuario2);
      }

      @Override
      public void removeUsuario2(Usuario2 usuario2) {
            usudao.removeUsuario2(usuario2);
      }
      
}
