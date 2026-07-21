package gm.chatbot_salud.servicio;

import org.springframework.stereotype.Service;

@Service
public class WhatsAppService {

    /**
     * Procesa el mensaje recibido desde WhatsApp.
     */
    public String procesarMensaje(String mensaje) {

        if (mensaje == null || mensaje.isBlank()) {
            return "No se recibió ningún mensaje.";
        }

        mensaje = mensaje.trim().toLowerCase();

        // El chatbot solo responde si lo llaman
        if (mensaje.equals("@chatbot")) {
            return mostrarMenuPrincipal();
        }

        // Comandos principales
        switch (mensaje) {

            case "/agregar":
                return mostrarMenuAgregar();

            case "/editar":
                return mostrarMenuEditar();

            case "/eliminar":
                return mostrarMenuEliminar();

            case "/consultar":
                return mostrarMenuConsultar();

            default:
                return "Comando no reconocido.\n\nEscriba @chatbot para iniciar.";
        }
    }

    /**
     * Menú principal.
     */
    private String mostrarMenuPrincipal() {

        return """
                👨‍⚕️ CHATBOT SALUD FAMILIAR

                Seleccione una opción:

                /agregar
                /editar
                /eliminar
                /consultar
                """;
    }

    /**
     * Menú Agregar.
     */
    private String mostrarMenuAgregar() {

        return """
                ¿Qué desea agregar?

                1. Enfermedad
                2. Medicamento
                3. Cita Médica

                Escriba el nombre de la opción.
                """;
    }

    /**
     * Menú Editar.
     */
    private String mostrarMenuEditar() {

        return """
                ¿Qué desea editar?

                1. Enfermedad
                2. Medicamento
                3. Cita Médica
                """;
    }

    /**
     * Menú Eliminar.
     */
    private String mostrarMenuEliminar() {

        return """
                ¿Qué desea eliminar?

                1. Enfermedad
                2. Medicamento
                3. Cita Médica
                """;
    }

    /**
     * Menú Consultar.
     */
    private String mostrarMenuConsultar() {

        return """
                ¿Qué desea consultar?

                1. Enfermedades
                2. Medicamentos
                3. Citas Médicas
                """;
    }

}