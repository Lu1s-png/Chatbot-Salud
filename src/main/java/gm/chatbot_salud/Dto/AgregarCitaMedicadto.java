package gm.chatbot_salud.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class AgregarCitaMedicadto {
    private String idIntegrante;
    private String tipoCita;
    private String lugarCita;
    private String direccion;
    private LocalDate fechaCita;
    private LocalTime hora;
}
