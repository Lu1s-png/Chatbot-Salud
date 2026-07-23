package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Integrante;
import gm.chatbot_salud.modelo.Medicamento;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface MedicamentoRepositorio extends MongoRepository<Medicamento, String> {
    List<Medicamento> findByIntegrante(Integrante integrante);
}
