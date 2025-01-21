
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/publicaciones")
class PublicacionController {

    private final Map<Integer, Publicacion> publicaciones = new HashMap<>();
    private int idCounter = 1;

    @GetMapping
    public List<Publicacion> obtenerPublicaciones() {
        return new ArrayList<>(publicaciones.values());
    }

    @PostMapping
    public Publicacion crearPublicacion(@RequestBody Publicacion nuevaPublicacion) {
        nuevaPublicacion.setId(idCounter++);
        publicaciones.put(nuevaPublicacion.getId(), nuevaPublicacion);
        return nuevaPublicacion;
    }

    @GetMapping("/{id}")
    public Publicacion obtenerPublicacion(@PathVariable int id) {
        return publicaciones.getOrDefault(id, null);
    }

    @DeleteMapping("/{id}")
    public String eliminarPublicacion(@PathVariable int id) {
        if (publicaciones.remove(id) != null) {
            return "Publicación eliminada";
        } else {
            return "Publicación no encontrada";
        }
    }
}
