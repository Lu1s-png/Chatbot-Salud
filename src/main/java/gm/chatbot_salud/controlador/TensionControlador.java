package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Tension;
import gm.chatbot_salud.repositorio.TensionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tensiones")
public class TensionControlador {
    @Autowired
    private TensionRepositorio tensionRepositorio;

    @GetMapping
    public List<Tension> obtenerTension() {
        return tensionRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Tension obtenerPorId(@PathVariable String id){
        return tensionRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Tension no encontrado"));
    }

    @PostMapping
    public Tension crearTencion(@RequestBody Tension tension){
        return tensionRepositorio.save(tension);
    }

    @PutMapping("/{id}")
    public Tension actualizarTension(@PathVariable String id,
                                     @RequestBody Tension detalleTension){
        Tension tension = tensionRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("tension no encontrado"));

        tension.setSistolica(detalleTension.getSistolica());
        tension.setDiastolica(detalleTension.getDiastolica());
        tension.setFecha(detalleTension.getFecha());
        tension.setHora(detalleTension.getHora());

        return tensionRepositorio.save(tension);
    }

    @DeleteMapping
    public String eliminarTension(@PathVariable String id){
        tensionRepositorio.deleteById(id);

        return "La tension a sido elimana exitosamente";
    }
}
