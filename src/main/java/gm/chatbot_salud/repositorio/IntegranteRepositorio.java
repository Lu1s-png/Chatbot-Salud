package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Integrante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntegranteRepositorio extends MongoRepository<Integrante, Integer> {
    List<Integrante> findByNombre (String nombre);
}
