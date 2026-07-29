package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Familia;
import gm.chatbot_salud.servicio.FamiliaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/familias")

public class FamiliaControlador {

    private final FamiliaServicio familiaServicio;

    public FamiliaControlador(FamiliaServicio familiaServicio){
        this.familiaServicio = familiaServicio;
    }

    @GetMapping
    public List<Familia> listarFamilias(){
        return familiaServicio.listarFamilias();
    }

    @GetMapping("/{id}")
    public Familia buscarPorId(@PathVariable String id){
        return familiaServicio.buscarPorId(id);
    }

    @PostMapping
    public Familia crearFamilia (@RequestBody Familia familia){
        return familiaServicio.guardar(familia);
    }

    @DeleteMapping("/{id}")
    public String eliminarFamilia(@PathVariable String id){
        familiaServicio.eliminar(id);

        return "Familia eliminada correctamente";
    }
}
