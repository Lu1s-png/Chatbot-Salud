package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Enfermedad;
import gm.chatbot_salud.modelo.Integrante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EnfermedadRepositorio extends MongoRepository<Enfermedad, String> {

    List<Enfermedad> findByIntegrante (Integrante integrante);

}
