package gm.chatbot_salud.servicio;

import gm.chatbot_salud.modelo.Familia;
import gm.chatbot_salud.repositorio.FamiliaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamiliaServicio {

    private final FamiliaRepositorio familiaRepositorio;

    public FamiliaServicio(FamiliaRepositorio familiaRepositorio) {
        this.familiaRepositorio = familiaRepositorio;
    }

    public List<Familia> listarFamilias() {
        return familiaRepositorio.findAll();
    }

    // buscar
    public Familia buscarPorId(String id) {
        return familiaRepositorio.findById(id).orElse(null);
    }

    // guardar
    public Familia guardar(Familia familia) {
        return familiaRepositorio.save(familia);
    }

    // eliminar
    public void eliminar(String id) {
        familiaRepositorio.deleteById(id);
    }

}