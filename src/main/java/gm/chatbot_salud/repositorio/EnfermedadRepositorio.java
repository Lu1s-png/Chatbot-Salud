package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Enfermedad;
import gm.chatbot_salud.modelo.Integrante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfermedadRepositorio extends MongoRepository<Enfermedad, Integer> {

    List<Enfermedad> findByIntegrante (Integrante integrante);

    List<Enfermedad> findTop5ByIntegranteNombreOrderByFechaEnfermedadDesc(String nombre);
}
