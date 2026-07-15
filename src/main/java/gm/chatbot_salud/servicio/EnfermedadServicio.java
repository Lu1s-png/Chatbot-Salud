package gm.chatbot_salud.servicio;

import gm.chatbot_salud.modelo.Enfermedad;
import gm.chatbot_salud.repositorio.EnfermedadRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermedadServicio {
    private final EnfermedadRepositorio enfermedadRepositorio;

    public EnfermedadServicio(EnfermedadRepositorio enfermedadRepositorio) {
        this.enfermedadRepositorio = enfermedadRepositorio;
    }

    public List<Enfermedad> listarEnfermedades() {
        return enfermedadRepositorio.findAll();
    }

    public Enfermedad buscarPorId(Integer id) {
        return enfermedadRepositorio.findById(id).orElse(null);
    }

    public Enfermedad guardar(Enfermedad enfermedad) {
        return enfermedadRepositorio.save(enfermedad);
    }

    public void eliminar(Integer id) {
        enfermedadRepositorio.deleteById(id);
    }
}
