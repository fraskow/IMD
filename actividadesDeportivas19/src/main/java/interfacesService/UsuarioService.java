/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesService;

import beans.Usuario2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author nators
 */
@Local
public interface UsuarioService {
      public List<Usuario2> listarUsuario2();

    public Usuario2 findUsuario2ByNombre(Usuario2 usuario2);

    public Usuario2 findUsuario2ByID(Usuario2 usuario2);

    public Usuario2 findUsuario2ByID(int id);

    public void addUsuario2(Usuario2 usuario2);

    public void updateUsuario2(Usuario2 usuario2);

    public void refreshUsuario2(Usuario2 usuario2);

    public void removeUsuario2(Usuario2 usuario2);
}
