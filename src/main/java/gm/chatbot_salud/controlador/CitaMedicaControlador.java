package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.CitaMedica;
import gm.chatbot_salud.servicio.CitaMedicaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaMedicaControlador {

    private final CitaMedicaServicio citaMedicaServicio;

    public CitaMedicaControlador(CitaMedicaServicio citaMedicaServicio){
        this.citaMedicaServicio = citaMedicaServicio;
    }

    @GetMapping
    public List<CitaMedica> obtenerCitaMedica(){
        return citaMedicaServicio.listarCitas();
    }

    @GetMapping("/{id}")
    public CitaMedica obtenerPorId(@PathVariable String id){
        return citaMedicaServicio.buscarPorId(id);
    }

    @PostMapping
    public CitaMedica crearCitaMedica(@RequestBody CitaMedica citaMedica){
        return citaMedicaServicio.guardar(citaMedica);
    }

    @PutMapping("/{id}")
    public CitaMedica actualizarCitaMedica
            (@PathVariable String id, @RequestBody CitaMedica detalleCitaMedica){

        detalleCitaMedica.setIdCitaMedica(id);
        return citaMedicaServicio.actualizar(detalleCitaMedica);
    }

    @DeleteMapping("/{id}")
    public String eliminarCitaMedica(@PathVariable String id){
        citaMedicaServicio.eliminar(id);
        return "Cita medica eliminada correctamente" + id;
    }
}
