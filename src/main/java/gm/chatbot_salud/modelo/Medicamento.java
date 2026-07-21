package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "medicamento")
public class Medicamento {
    @Id
    private Integer idMedicamento;
    private String nombreMedicamento;
    private String frecuencia;

    @DBRef
    private Integrante integrante;

    public Medicamento(){
    }

    public Medicamento(Integer idMedicamento){
        this.idMedicamento = idMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "idMedicamento='" + idMedicamento + '\'' +
                ", nombreMedicamento='" + nombreMedicamento + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", integrante=" + integrante +
                '}';
    }
}