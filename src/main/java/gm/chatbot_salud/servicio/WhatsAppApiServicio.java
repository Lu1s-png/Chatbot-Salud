package gm.chatbot_salud.servicio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WhatsAppApiServicio {

    @Value("${whatsapp.verify-token}")
    private String verifyToken;

    private final WhatsAppServicio whatsAppServicio;

    public WhatsAppApiServicio(WhatsAppServicio whatsAppServicio) {
        this.whatsAppServicio = whatsAppServicio;
    }

    /**
     * Verifica el Webhook enviado por Meta.
     */
    public ResponseEntity<String> verificarWebhook(
            String mode,
            String token,
            String challenge) {

        if ("subscribe".equals(mode) &&
                verifyToken.equals(token)) {

            return ResponseEntity.ok(challenge);
        }

        return ResponseEntity.status(403).body("Token inválido");
    }

    /**
     * Procesa el mensaje recibido desde Meta.
     */
    public void procesarMensaje(String body) {

        System.out.println("Mensaje recibido desde WhatsApp:");

        System.out.println(body);

        /*
         * Más adelante aquí se hará:
         *
         * 1. Leer el JSON.
         * 2. Obtener el mensaje.
         * 3. Obtener el número.
         * 4. Llamar a WhatsAppServicio.
         * 5. Enviar la respuesta.
         */

    }

}