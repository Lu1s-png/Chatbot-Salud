package gm.chatbot_salud.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Familia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idFamilia;
    private String nombreFamilia;

    @OneToMany(mappedBy = "familia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Integrante> integrantes = new ArrayList<>();

    public Familia() {}

    public Familia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "idFamilia=" + idFamilia +
                ", nombreFamilia='" + nombreFamilia + '\'' +
                '}';
    }
}
