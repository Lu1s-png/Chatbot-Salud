package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Document(collection = "citas_medicas")
public class CitaMedica {
    @Id
    private Integer idCitaMedica;
    private String tipoCita;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugarCita;

    @DBRef
    private Integrante integrante;

    public CitaMedica() {
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "idCitaMedica='" + idCitaMedica + '\'' +
                ", tipoCita='" + tipoCita + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", lugarCita='" + lugarCita + '\'' +
                ", integrante=" + integrante +
                '}';
    }
}