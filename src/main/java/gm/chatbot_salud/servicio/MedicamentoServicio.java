package gm.chatbot_salud.servicio;

import gm.chatbot_salud.Excepciones.RecursoNoEncontradoExcepcion;
import gm.chatbot_salud.modelo.Medicamento;
import gm.chatbot_salud.repositorio.MedicamentoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServicio {

    private final MedicamentoRepositorio medicamentoRepositorio;

    public MedicamentoServicio(MedicamentoRepositorio medicamentoRepositorio) {
        this.medicamentoRepositorio = medicamentoRepositorio;
    }

    public List<Medicamento> listarMedicamentos() {
        return medicamentoRepositorio.findAll();
    }

    public Medicamento buscarPorId(String id) {
        return medicamentoRepositorio.findById(id).
                orElseThrow(() -> new RecursoNoEncontradoExcepcion
                        ("Medicamento no encontrado"));
    }

    public Medicamento guardar(Medicamento medicamento) {
        return medicamentoRepositorio.save(medicamento);
    }

    public Medicamento actualizar(Medicamento medicamento){
        return medicamentoRepositorio.save(medicamento);
    }

    public void eliminar(String id) {
        medicamentoRepositorio.deleteById(id);
    }

}
