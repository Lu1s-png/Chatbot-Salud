package gm.chatbot_salud.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class AgregarTensiondto {
    private String idIntegrante;
    private Integer sistonica;
    private Integer diatonica;
    private LocalDate fecha;
    private LocalTime hora;
}
