package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.CitaMedica;
import gm.chatbot_salud.repositorio.CitaMedicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chatbot-salud")
public class CitaMedicaControlador {

    @Autowired
    private CitaMedicaRepositorio citaMedicaRepositorio;

    @GetMapping
    public List<CitaMedica> obtenerCitaMedica(){
        return citaMedicaRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public CitaMedica obtenerPorId(@PathVariable String id){
        return citaMedicaRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @PostMapping
    public CitaMedica crearCitaMedica(@RequestBody CitaMedica citaMedica){
        return citaMedicaRepositorio.save(citaMedica);
    }

    @PutMapping("/{}id")
    public CitaMedica actualizarCitaMedica
            (@PathVariable String id, @RequestBody CitaMedica detalleCita){
        CitaMedica citaMedica = citaMedicaRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Cita medica no encontrada"));

        citaMedica.setTipoCita(detalleCita.getTipoCita());
        citaMedica.setLugarCita(detalleCita.getLugarCita());
        citaMedica.setFecha(detalleCita.getFecha());
        citaMedica.setHora(detalleCita.getHora());
        citaMedica.setEstado(detalleCita.getEstado());
        citaMedica.setIntegrante(detalleCita.getIntegrante());

        return citaMedicaRepositorio.save(citaMedica);
    }

    @DeleteMapping("{/id}")
    public String eliminarCitaMedica(@PathVariable String id){
        citaMedicaRepositorio.deleteById(id);
        return "Cita medica eliminada correctamente" + id;
    }
}
