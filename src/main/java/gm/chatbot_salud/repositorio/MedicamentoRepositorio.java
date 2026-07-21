package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.modelo.Medicamento;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentoRepositorio extends MongoRepository<Medicamento, Integer> {
    List<Medicamento> findByIntegrante(Integrante integrante);
}
