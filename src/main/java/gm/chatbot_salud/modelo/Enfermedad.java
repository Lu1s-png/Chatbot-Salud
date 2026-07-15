package gm.chatbot_salud.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

// Historial de enfermedades de cada integrante de la familia
@Setter
@Getter
@Entity
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEnfermedad;
    String tipoEnfermedad;
    LocalDate fechaEnfermedad;
    String descripcionEnfermedad;

    @ManyToOne
    @JoinColumn(name = "id-integrante")
    private Integrante integrante;
    private Enfermedad(){}

    public Enfermedad(Integer idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "idEnfermedad=" + idEnfermedad +
                ", tipoEnfermedad='" + tipoEnfermedad + '\'' +
                ", fechaEnfermedad=" + fechaEnfermedad +
                ", descripcionEnfermedad='" + descripcionEnfermedad + '\'' +
                '}';
    }
}
