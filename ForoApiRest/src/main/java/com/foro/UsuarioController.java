
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/usuarios")
class UsuarioController {

    private final Map<Integer, Usuario> usuarios = new HashMap<>();
    private int idCounter = 1;

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario) {
        nuevoUsuario.setId(idCounter++);
        usuarios.put(nuevoUsuario.getId(), nuevoUsuario);
        return nuevoUsuario;
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable int id) {
        return usuarios.getOrDefault(id, null);
    }

    @DeleteMapping("/{id}")
    public String eliminarUsuario(@PathVariable int id) {
        if (usuarios.remove(id) != null) {
            return "Usuario eliminado";
        } else {
            return "Usuario no encontrado";
        }
    }
}
