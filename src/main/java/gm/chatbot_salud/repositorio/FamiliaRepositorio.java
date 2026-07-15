package gm.chatbot_salud.repositorio;

import gm.chatbot_salud.modelo.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliaRepositorio extends JpaRepository <Familia, Integer> {

}
