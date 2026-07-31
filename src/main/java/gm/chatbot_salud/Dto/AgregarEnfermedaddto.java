package gm.chatbot_salud.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AgregarEnfermedaddto {
    private String idIntegrante;
    private String nomnreEnfermedad;
    private String observaciones;
    private LocalDate fechaEnfermedad;
}
