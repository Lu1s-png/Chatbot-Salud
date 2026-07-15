package gm.chatbot_salud.servicio;

import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.repositorio.IntegranteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegranteServicio {
    private final IntegranteRepositorio integranteRepositorio;

    public IntegranteServicio(IntegranteRepositorio integranteRepositorio) {
        this.integranteRepositorio = integranteRepositorio;
    }

    public List<Integrante> listarIntegrantes(String nombre){
        return integranteRepositorio.findByNombre(nombre);
    }

    public Integrante bucarPorId (Integer id) {
        return integranteRepositorio.findById(id).orElse(null);
    }

    public Integrante guardar (Integrante integrante){
        return integranteRepositorio.save(integrante);
    }

    public void eliminar (Integer id){
        integranteRepositorio.deleteById(id);
    }
}
