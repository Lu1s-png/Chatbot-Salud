package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Familia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FamiliaRepositorio extends MongoRepository<Familia, String> {

}
