package gm.chatbot_salud.modelo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "medicamentos")
public class Medicamento {
    @Id
    private String idMedicamento;
    private String nombreMedicamento;
    private String frecuencia;
    private String horario;

    @DBRef
    private Integrante integrante;

    public Medicamento(){
    }

    public Medicamento(String idMedicamento){
        this.idMedicamento = idMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "idMedicamento='" + idMedicamento + '\'' +
                ", nombreMedicamento='" + nombreMedicamento + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", horario='" + horario + '\'' +
                ", integrante=" + (integrante != null ? integrante.getNombre() : null) +
                '}';
    }
}