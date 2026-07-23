package gm.chatbot_salud.servicio;

import gm.chatbot_salud.modelo.Tension;
import gm.chatbot_salud.repositorio.TensionRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TensionServicio {
    private final TensionRepositorio tensionRepositorio;

    public TensionServicio (TensionRepositorio tensionRepositorio){
        this.tensionRepositorio = tensionRepositorio;
    }

    public List<Tension> listarTensiones() {
        return tensionRepositorio.findAll();
    }

    public Tension buscarPorId(String id) {
        return tensionRepositorio.findById(id).orElse(null);
    }

    public Tension guardar(Tension tension) {
        return tensionRepositorio.save(tension);
    }

    public void eliminar(String id) {
        tensionRepositorio.deleteById(id);
    }

}
