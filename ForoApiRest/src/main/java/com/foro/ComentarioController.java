
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/comentarios")
class ComentarioController {

    private final Map<Integer, Comentario> comentarios = new HashMap<>();
    private int idCounter = 1;

    @GetMapping
    public List<Comentario> obtenerComentarios() {
        return new ArrayList<>(comentarios.values());
    }

    @PostMapping
    public Comentario crearComentario(@RequestBody Comentario nuevoComentario) {
        nuevoComentario.setId(idCounter++);
        comentarios.put(nuevoComentario.getId(), nuevoComentario);
        return nuevoComentario;
    }

    @GetMapping("/{id}")
    public Comentario obtenerComentario(@PathVariable int id) {
        return comentarios.getOrDefault(id, null);
    }

    @DeleteMapping("/{id}")
    public String eliminarComentario(@PathVariable int id) {
        if (comentarios.remove(id) != null) {
            return "Comentario eliminado";
        } else {
            return "Comentario no encontrado";
        }
    }
}
