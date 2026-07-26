package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Enfermedad;
import gm.chatbot_salud.repositorio.EnfermedadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfermedades")
public class EnfermedadControlador {
    @Autowired
    private EnfermedadRepositorio enfermedadRepositorio;

    @GetMapping
    public List<Enfermedad>obtenerEnfermedad(){
        return enfermedadRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Enfermedad obtenerPorId(@PathVariable String id){
        return enfermedadRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Enfermedad no encontrada"));
    }

    @PostMapping
    public Enfermedad crearEnfermedad(@RequestBody Enfermedad enfermedad){
        return enfermedadRepositorio.save(enfermedad);
    }

    @PutMapping("/{id}")
    public Enfermedad actualizarEnfermedad
            (@PathVariable String id, @RequestBody Enfermedad detalleEnfermedad){
        Enfermedad enfermedad = enfermedadRepositorio.findById(id).orElseThrow
                (() -> new RuntimeException("Enfermedad no encontrada para actualizar"));

        enfermedad.setNombreEnfermedad(detalleEnfermedad.getNombreEnfermedad());
        enfermedad.setObservaciones(detalleEnfermedad.getObservaciones());
        enfermedad.setFechaEnfermedad(detalleEnfermedad.getFechaEnfermedad());
        enfermedad.setIntegrante(detalleEnfermedad.getIntegrante());

        return enfermedadRepositorio.save(enfermedad);
    }

    @DeleteMapping("/{id}")
    public String elimarFamilia (@PathVariable String id){
        enfermedadRepositorio.deleteById(id);
        return "Enfermedad eliminada correctamente" + id;
    }
}
