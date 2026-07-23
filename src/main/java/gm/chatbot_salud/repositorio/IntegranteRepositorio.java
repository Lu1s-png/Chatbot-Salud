package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Familia;
import gm.chatbot_salud.modelo.Integrante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IntegranteRepositorio extends MongoRepository<Integrante, String> {
    List<Integrante> findByNombre(String nombre);

    List<Integrante> findByFamilia(Familia familia);
}
