package gm.chatbot_salud.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MensajeWhatsAppDTO {

    // Número del usuario que envia el mensaje
    // Lo suministra automaticamente WhatsApp Business
    private String remitente;

    //Nombre mostrado en WhatsApp
    private String nombreUsuario;


    // Mensaje enviado por el usuario
    private String mensaje;
}
