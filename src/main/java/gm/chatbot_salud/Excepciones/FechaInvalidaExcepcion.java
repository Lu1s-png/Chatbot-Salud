package gm.chatbot_salud.Excepciones;

public class FechaInvalidaExcepcion extends RuntimeException{
    public FechaInvalidaExcepcion(String mensaje){
        super(mensaje);
    }
}
