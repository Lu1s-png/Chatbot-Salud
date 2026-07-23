package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.modelo.Tension;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface TensionRepositorio extends MongoRepository<Tension, String> {
    List<Tension> findByFecha (LocalDate fecha, LocalTime hora);

    List<Tension> findByIntegrante (Integrante integrante);
}
