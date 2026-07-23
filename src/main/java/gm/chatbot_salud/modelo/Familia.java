package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "familias")
public class Familia {

    @Id
    private String idFamilia;

    private String nombreFamilia;

    public Familia() {
    }

    public Familia(String idFamilia) {
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
