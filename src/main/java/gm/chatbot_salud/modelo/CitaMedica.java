package gm.chatbot_salud.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Entity
public class CitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idCitaMedica;
    private String lugarCita;
    private String direccion;
    private LocalDate fechaCita;
    private LocalTime hora;

    @ManyToOne
    @JoinColumn(name = "id_integrante")
    private Integrante integrante;

    public CitaMedica (){}

    public CitaMedica(Integer idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "idCitaMedica=" + idCitaMedica +
                ", lugarCita='" + lugarCita + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaCita=" + fechaCita +
                ", hora=" + hora +
                '}';
    }
}
