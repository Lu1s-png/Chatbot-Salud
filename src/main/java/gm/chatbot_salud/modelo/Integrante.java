package gm.chatbot_salud.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Integrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idIntegrante;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_familia")

    private Familia familia;

    public Integrante(){}

    public Integrante(Integer idIntegrante) {
        this.idIntegrante = idIntegrante;
    }

    @OneToMany(mappedBy = "integrante")
    private List<Enfermedad> enfermedads;

    @OneToMany(mappedBy = "integrante")
    private List<Medicamento> medicamentos;

    @OneToMany(mappedBy = "integrante")
    private List<CitaMedica>citaMedicas;



    @Override
    public String toString() {
        return "Integrante{" +
                "idIntegrante=" + idIntegrante +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
