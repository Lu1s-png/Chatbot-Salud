package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Familia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliaRepositorio extends MongoRepository<Familia, Integer> {

}
