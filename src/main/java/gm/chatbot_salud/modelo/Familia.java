package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "familia")
public class Familia {

    @Id
    private Integer idFamilia;

    private String nombreFamilia;

    public Familia() {
    }

    public Familia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "idFamilia='" + idFamilia + '\'' +
                ", nombreFamilia='" + nombreFamilia + '\'' +
                '}';
    }
}
