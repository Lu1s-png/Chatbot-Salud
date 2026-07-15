package gm.chatbot_salud.servicio;

import gm.chatbot_salud.modelo.CitaMedica;
import gm.chatbot_salud.repositorio.CitaMedicaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaServicio {
    private final CitaMedicaRepositorio citaMedicaRepositorio;

    public CitaMedicaServicio(CitaMedicaRepositorio citaMedicaRepositorio) {
        this.citaMedicaRepositorio = citaMedicaRepositorio;
    }

    public List<CitaMedica>listarCitas(){
        return citaMedicaRepositorio.findAll();
    }

    public CitaMedica buscarPorId (Integer id){
        return citaMedicaRepositorio.findById(id).orElse(null);
    }

    public CitaMedica guardar (CitaMedica citaMedica){
        return citaMedicaRepositorio.save(citaMedica);
    }

    public void eliminar (Integer id){
        citaMedicaRepositorio.deleteById(id);
    }
}
