package gm.chatbot_salud.servicio;

import gm.chatbot_salud.modelo.Familia;
import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.repositorio.FamiliaRepositorio;
import gm.chatbot_salud.repositorio.IntegranteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegranteServicio {

    private final IntegranteRepositorio integranteRepositorio;
    private final FamiliaRepositorio familiaRepositorio;

    public IntegranteServicio(IntegranteRepositorio integranteRepositorio,
                              FamiliaRepositorio familiaRepositorio) {

        this.integranteRepositorio = integranteRepositorio;
        this.familiaRepositorio = familiaRepositorio;
    }

    public List<Integrante> listarIntegrantes() {
        return integranteRepositorio.findAll();
    }

    public List<Integrante> buscarPorNombre(String nombre) {
        return integranteRepositorio.findByNombre(nombre);
    }

    public Integrante buscarPorId(String id) {
        return integranteRepositorio.findById(id).
                orElseThrow(() -> new RuntimeException("Integrante no encontrado"));
    }

    public Integrante guardar(Integrante integrante) {
        return integranteRepositorio.save(integrante);
    }

    public Integrante agregarIntegrante(String idFamilia, String nombre) {

        Familia familia = familiaRepositorio.findById(idFamilia)
                .orElseThrow(() ->
                        new RuntimeException("Familia no encontrada."));

        List<Integrante> integrantes = integranteRepositorio.findByFamilia(familia);

        if (integrantes.size() >= 6) {
            throw new RuntimeException("La familia ya tiene el máximo de 6 integrantes.");
        }

        Integrante integrante = new Integrante();

        integrante.setNombre(nombre);
        integrante.setFamilia(familia);

        return integranteRepositorio.save(integrante);
    }

    public Integrante actualizar(Integrante integrante){
        return integranteRepositorio.save(integrante);
    }

    public void eliminar(String id) {
        integranteRepositorio.deleteById(id);
    }

}