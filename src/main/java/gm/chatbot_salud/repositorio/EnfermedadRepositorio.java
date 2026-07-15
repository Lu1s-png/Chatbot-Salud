package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnfermedadRepositorio extends JpaRepository<Enfermedad, Integer> {

    List<Enfermedad> findByIntegranteIdIntegrante (Integer IdIntegrante);

    List<Enfermedad> findTop5ByIntegranteNombreOrderByFecheEnfermedadDesc(String nombre);
}
