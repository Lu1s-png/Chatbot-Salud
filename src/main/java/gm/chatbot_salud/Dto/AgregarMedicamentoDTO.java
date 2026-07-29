package gm.chatbot_salud.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgregarMedicamentoDTO {
    private String idIntegrante;
    private String nombreMedicamento;
    private String frecuencia;
    private String horario;
}
