package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CitaMedicaRepositorio extends JpaRepository<CitaMedica, Integer> {

    List<CitaMedica> findByFechaCita(LocalDate fechaCita);

    List<CitaMedica> findByIntegranteIdIntegrante(Integer idIntegrante);
}
