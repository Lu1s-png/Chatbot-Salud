package gm.chatbot_salud.controlador;

import gm.chatbot_salud.modelo.Medicamento;
import gm.chatbot_salud.repositorio.MedicamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicamentos")

public class MedicamentoControlador {
    @Autowired
    public MedicamentoRepositorio medicamentoRepositorio;

    @GetMapping
    public List<Medicamento> obtenerMedicamento(){
        return medicamentoRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Medicamento obtenerPorId(@PathVariable String id){
        return medicamentoRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Medicamento no encontrado"));
    }

    @PostMapping
    public Medicamento crearMedicamento(@RequestBody Medicamento medicamento){
        return medicamentoRepositorio.save(medicamento);
    }

    @PutMapping
    public Medicamento actualizarMedicamento
            (@PathVariable String id, @RequestBody Medicamento detalleMedicamento) {
     Medicamento medicamento = medicamentoRepositorio.findById(id).
             orElseThrow(()-> new RuntimeException("medicamento no encontrado"));

     medicamento.setNombreMedicamento(detalleMedicamento.getNombreMedicamento());
     medicamento.setFrecuencia(detalleMedicamento.getFrecuencia());
     medicamento.setHorario(detalleMedicamento.getHorario());

     return medicamentoRepositorio.save(medicamento);
    }

    @DeleteMapping
    public String eliminarMedicamento(@PathVariable String id){
        medicamentoRepositorio.deleteById(id);
        return "Medicamento eliminado extosamente";
    }
}
