/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesDAO;

import beans.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nators
 */
@Local
public interface UsuarioDao {
      public List<Usuario> listarUsuario();

    public Usuario findUsuarioByNombre(Usuario usuario);

    public Usuario findUsuarioByID(Usuario usuario);

    public Usuario findUsuarioByID(int id);

    public void addUsuario(Usuario usuario);

    public void updateUsuario(Usuario usuario);

    public void refreshUsuario(Usuario usuario);

    public void removeUsuario(Usuario usuario);
}
