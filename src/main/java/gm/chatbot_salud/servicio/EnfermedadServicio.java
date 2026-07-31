package gm.chatbot_salud.servicio;

import gm.chatbot_salud.Excepciones.IntegranteNoEncontradoExcepcion;
import gm.chatbot_salud.Excepciones.RecursoNoEncontradoExcepcion;
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

    public Enfermedad buscarPorId(String id) {
        return enfermedadRepositorio.findById(id).
                orElseThrow(() -> new RecursoNoEncontradoExcepcion
                        ("Enfermedad no encontrad"));
    }

    public Enfermedad guardar(Enfermedad enfermedad) {

        if(enfermedad.getNombreEnfermedad()==null ||
                enfermedad.getNombreEnfermedad().isBlank()){

            throw new IllegalArgumentException(
                    "Debe ingresar el nombre de la enfermedad.");
        }

        if(enfermedad.getIntegrante()==null){
            throw new IntegranteNoEncontradoExcepcion(
                    "Debe seleccionar un integrante.");
        }
        return enfermedadRepositorio.save(enfermedad);
    }

    public Enfermedad actualizar(Enfermedad enfermedad){
        return enfermedadRepositorio.save(enfermedad);
    }

    public void eliminar(String id) {
        enfermedadRepositorio.deleteById(id);
    }
}
