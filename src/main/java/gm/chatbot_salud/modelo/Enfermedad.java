package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Setter
@Getter
@Document(collection = "enfermedades")
public class Enfermedad {

    @Id
    private Integer idEnfermedad;

    private String nombreEnfermedad;

    private String descripcion;

    private LocalDate fechaEnfermedad;

    @DBRef
    private Integrante integrante;

    public Enfermedad() {
    }

    public Enfermedad(Integer idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "idEnfermedad='" + idEnfermedad + '\'' +
                ", nombreEnfermedad='" + nombreEnfermedad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaEnfermedad=" + fechaEnfermedad +
                ", integrante=" + integrante +
                '}';
    }
}
