package co.edu.ucentral.EatInWeek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import co.edu.ucentral.EatInWeek.model.Administrador;
import co.edu.ucentral.EatInWeek.model.Cliente;
import co.edu.ucentral.EatInWeek.model.Usuario;
import co.edu.ucentral.EatInWeek.repository.UsuarioRepository;

@Service
@Primary
public class UsuarioServiceJpa implements UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	@Override
	public Usuario inciarSesion(Usuario usuario) {
		List<Usuario> optional = repo.findAll();
		for (Usuario us : optional) {
			if (us.getCelular() == usuario.getCelular() ||
					us.getCorreo().equals(usuario.getCorreo())) {
				if (us.getClave().equals(usuario.getClave())) {
					if (us.getTipo() == 1) {
						Administrador admin=new Administrador();
						admin.setCelular(us.getCelular());
						admin.setCorreo(us.getCorreo());
						admin.setNombre(us.getNombre());
						admin.setClave(us.getClave());
						admin.setTipo(us.getTipo());
						return admin;
					} else {
						
						Cliente cliente=new Cliente();
						cliente.setCelular(us.getCelular());
						cliente.setCorreo(us.getCorreo());
						cliente.setNombre(us.getNombre());
						cliente.setClave(us.getClave());
						cliente.setTipo(us.getTipo());						
						return cliente;
					}
				} else {
					return null;
				}
			}
		}
return null;
	}
}

