package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.repositorio.IntegranteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/integrantes")
public class IntegranteControlador {
    @Autowired
    private IntegranteRepositorio integranteRepositorio;

    @GetMapping
    public List<Integrante> obtenerIntegrante(){
        return integranteRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Integrante obtenerPorId(@PathVariable String id){
        return integranteRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Integrante no encontrado"));
    }

    @PostMapping
    public Integrante crearIntegrante (@RequestBody Integrante integrante){
        return integranteRepositorio.save(integrante);
    }

    @PutMapping("/{id}")
    public Integrante actualizarIntegrante
            (@PathVariable String id, @RequestBody Integrante detalleIntegrante){
        Integrante integrante = integranteRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Integrante no encontrado"));

        integrante.setNombre(detalleIntegrante.getNombre());

        return integranteRepositorio.save(integrante);
    }

    @DeleteMapping("/{id}")
    public String eliminarIntegrante(@PathVariable String id){
        integranteRepositorio.deleteById(id);
        return "Integrante eliminado correctamente" + id;
    }
}
