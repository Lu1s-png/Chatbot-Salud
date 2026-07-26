package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Familia;
import gm.chatbot_salud.repositorio.FamiliaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/familias")

public class FamiliaControlador {
    @Autowired
    private FamiliaRepositorio familiaRepositorio;

    @GetMapping
    public List<Familia> obtenerFamilia(){
        return familiaRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Familia obtenerPorId(@PathVariable String id){
        return familiaRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Familia no encontrada"));
    }

    @PostMapping
    public Familia crearFamilia (@RequestBody Familia familia){
        return familiaRepositorio.save(familia);
    }
}
