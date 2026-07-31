package gm.chatbot_salud.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErrorResponsedto {

    private LocalDateTime fechaHora;
    private int codigo;
    private String error;
    private String mensaje;
    private String ruta;

    public ErrorResponsedto() {
    }

    public ErrorResponsedto(LocalDateTime fechaHora, int codigo,
                            String error, String mensaje, String ruta){
        this.fechaHora = fechaHora;
        this.codigo = codigo;
        this.error = error;
        this.mensaje = mensaje;
        this.ruta = ruta;
    }
}
