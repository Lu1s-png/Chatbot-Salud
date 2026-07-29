package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.servicio.IntegranteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/integrantes")
public class IntegranteControlador {

    private final IntegranteServicio integranteServicio;

    public IntegranteControlador(IntegranteServicio integranteServicio){
        this.integranteServicio = integranteServicio;
    }
    @GetMapping
    public List<Integrante> obtenerIntegrante(){
        return integranteServicio.listarIntegrantes();
    }

    @GetMapping("/{id}")
    public Integrante buscarPorId(@PathVariable String id){
        return integranteServicio.buscarPorId(id);
    }

    @PostMapping
    public Integrante crearIntegrante (@RequestBody Integrante integrante){
        return integranteServicio.guardar(integrante);
    }

    @PutMapping("/{id}")
    public Integrante actualizarIntegrante
            (@PathVariable String id, @RequestBody Integrante integrante){

        integrante.setIdIntegrante(id);

        return integranteServicio.actualizar(integrante);
    }

    @DeleteMapping("/{id}")
    public String eliminarIntegrante(@PathVariable String id){
        integranteServicio.eliminar(id);
        return "Integrante eliminado correctamente";
    }
}
