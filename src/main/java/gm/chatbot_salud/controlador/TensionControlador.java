package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Tension;
import gm.chatbot_salud.servicio.TensionServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tensiones")
public class TensionControlador {

    private final TensionServicio tensionServicio;

    public TensionControlador(TensionServicio tensionServicio){
        this.tensionServicio = tensionServicio;
    }

    @GetMapping
    public List<Tension> listarTension() {
        return tensionServicio.listarTensiones();
    }

    @GetMapping("/{id}")
    public Tension buscaPorId(@PathVariable String id){
        return tensionServicio.buscarPorId(id);
    }

    @PostMapping
    public Tension crearTencion(@RequestBody Tension tension){
        return tensionServicio.guardar(tension);
    }

    @PutMapping("/{id}")
    public Tension actualizarTension(@PathVariable String id,
                                     @RequestBody Tension detalleTension){

        detalleTension.setIdTension(id);
        return tensionServicio.actualizar(detalleTension);
    }

    @DeleteMapping("/{id}")
    public String eliminarTension(@PathVariable String id){
        tensionServicio.eliminar(id);

        return "La tension a sido elimana exitosamente";
    }
}
