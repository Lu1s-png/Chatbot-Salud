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

    // Listar
    public List<Familia> listarFamilias(){
        return familiaRepositorio.findAll();
    }

    // Buscar por id
    public Familia buscarPorId (Integer id){
        return familiaRepositorio.findById(id).orElse(null);
    }

    // Guardar
    public Familia guardar (Familia familia){
        return familiaRepositorio.save(familia);
    }

    // Eliminar
    public void eliminar (Integer id){
        familiaRepositorio.deleteById(id);
    }
}
