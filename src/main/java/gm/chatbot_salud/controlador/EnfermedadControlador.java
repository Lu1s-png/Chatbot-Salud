package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Enfermedad;
import gm.chatbot_salud.servicio.EnfermedadServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfermedades")
public class EnfermedadControlador {


    private final EnfermedadServicio enfermedadServicio;

    public EnfermedadControlador(EnfermedadServicio enfermedadServicio){
        this.enfermedadServicio = enfermedadServicio;
    }

    @GetMapping
    public List<Enfermedad>obtenerEnfermedad(){
        return enfermedadServicio.listarEnfermedades();
    }

    @GetMapping("/{id}")
    public Enfermedad obtenerPorId(@PathVariable String id){
        return enfermedadServicio.buscarPorId(id);
    }

    @PostMapping
    public Enfermedad crearEnfermedad(@RequestBody Enfermedad enfermedad){
        return enfermedadServicio.guardar(enfermedad);
    }

    @PutMapping("/{id}")
    public Enfermedad actualizarEnfermedad
            (@PathVariable String id, @RequestBody Enfermedad detalleEnfermedad){

        detalleEnfermedad.setIdEnfermedad(id);
        return enfermedadServicio.actualizar(detalleEnfermedad);
    }

    @DeleteMapping("/{id}")
    public String elimarEnfermedad (@PathVariable String id){
        enfermedadServicio.eliminar(id);
        return "Enfermedad eliminada correctamente" + id;
    }
}
