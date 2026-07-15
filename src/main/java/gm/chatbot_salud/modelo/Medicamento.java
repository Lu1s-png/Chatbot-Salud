package gm.chatbot_salud.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer idMedicamento;
    String nombreMedicamento;
    String tratamientoMedicamento;

    @ManyToOne
    @JoinColumn(name = "id_integrante")
    private Integrante integrante;
    private Medicamento(){}

    public Medicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "idMedicamento=" + idMedicamento +
                ", nombreMedicamento='" + nombreMedicamento + '\'' +
                ", tratamientoMedicamento='" + tratamientoMedicamento + '\'' +
                '}';
    }
}
