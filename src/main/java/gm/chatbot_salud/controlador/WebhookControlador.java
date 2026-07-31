package gm.chatbot_salud.controlador;

import gm.chatbot_salud.servicio.WhatsAppApiServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookControlador {

    private final WhatsAppApiServicio whatsAppApiServicio;

    public WebhookControlador(WhatsAppApiServicio whatsAppApiServicio) {
        this.whatsAppApiServicio = whatsAppApiServicio;
    }

    /**
     * Verificación del Webhook de Meta.
     */
    @GetMapping
    public ResponseEntity<String> verificarWebhook(

            @RequestParam("hub.mode") String mode,
            @RequestParam("hub.verify_token") String token,
            @RequestParam("hub.challenge") String challenge) {

        return whatsAppApiServicio.verificarWebhook(mode, token, challenge);
    }

    /**
     * Recibe mensajes enviados por WhatsApp.
     */
    @PostMapping
    public ResponseEntity<String> recibirMensaje(@RequestBody String body) {

        whatsAppApiServicio.procesarMensaje(body);

        return ResponseEntity.ok("EVENT_RECEIVED");
    }

}