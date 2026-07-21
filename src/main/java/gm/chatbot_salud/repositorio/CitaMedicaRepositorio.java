package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.CitaMedica;
import gm.chatbot_salud.modelo.Integrante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CitaMedicaRepositorio extends MongoRepository<CitaMedica, Integer> {

    List<CitaMedica> findByFecha(LocalDate fecha);

    List<CitaMedica> findByIntegrante(Integrante integrante);
}
