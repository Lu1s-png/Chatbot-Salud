package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentoRepositorio extends JpaRepository<Medicamento, Integer> {
    List<Medicamento> findByIntegranteIdIntegrante(Integer idIntegrante);
}
