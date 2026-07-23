package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Document(collection = "tensiones")
public class Tension {

    @Id
    private String idTension;

    private Integer sistolica;
    private Integer diastolica;
    private LocalDate fecha;
    private LocalTime hora;

    @DBRef
    private Integrante integrante;

    public Tension() {
    }

    @Override
    public String toString() {
        return "Tension{" +
                "idTension='" + idTension + '\'' +
                ", sistolica=" + sistolica +
                ", diastolica=" + diastolica +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", integrante=" + (integrante != null ? integrante.getNombre() : null) +
                '}';
    }
}