package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.CitaMedica;
import gm.chatbot_salud.modelo.Integrante;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface CitaMedicaRepositorio extends MongoRepository<CitaMedica, String> {

    List<CitaMedica> findByFecha(LocalDate fecha);

    List<CitaMedica> findByIntegrante(Integrante integrante);
}
