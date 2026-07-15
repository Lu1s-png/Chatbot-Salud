package gm.chatbot_salud.servicio;

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

    public Medicamento buscarPorId(Integer id) {
        return medicamentoRepositorio.findById(id).orElse(null);
    }

    public Medicamento guardar(Medicamento medicamento) {
        return medicamentoRepositorio.save(medicamento);
    }

    public void eliminar(Integer id) {
        medicamentoRepositorio.deleteById(id);
    }
}
