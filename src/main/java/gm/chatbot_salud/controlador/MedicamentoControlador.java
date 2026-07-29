package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Medicamento;
import gm.chatbot_salud.servicio.MedicamentoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")

public class MedicamentoControlador {

    private final MedicamentoServicio medicamentoServicio;

    public MedicamentoControlador(MedicamentoServicio medicamentoServicio){
        this.medicamentoServicio = medicamentoServicio;
    }

    @GetMapping
    public List<Medicamento> listarMedicamentos(){
        return medicamentoServicio.listarMedicamentos();
    }

    @GetMapping("/{id}")
    public Medicamento buscarPorId(@PathVariable String id){
        return medicamentoServicio.buscarPorId(id);
    }

    @PostMapping
    public Medicamento crearMedicamento(@RequestBody Medicamento medicamento){
        return medicamentoServicio.guardar(medicamento);
    }

    @PutMapping("/{id}")
    public Medicamento actualizarMedicamento
            (@PathVariable String id, @RequestBody Medicamento detalleMedicamento) {

        detalleMedicamento.setIdMedicamento(id);
     return medicamentoServicio.actualizar(detalleMedicamento);
    }

    @DeleteMapping("/{id}")
    public String eliminarMedicamento(@PathVariable String id){
        medicamentoServicio.eliminar(id);
        return "Medicamento eliminado extosamente";
    }
}
