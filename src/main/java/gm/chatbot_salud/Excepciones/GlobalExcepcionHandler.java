package gm.chatbot_salud.Excepciones;

import gm.chatbot_salud.Dto.ErrorResponsedto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExcepcionHandler {

    @ExceptionHandler(RecursoNoEncontradoExcepcion.class)
    public ResponseEntity<ErrorResponsedto> manejarRecursoNoEncontrado(
            RecursoNoEncontradoExcepcion ex,
            HttpServletRequest request
    ){
        ErrorResponsedto error = new ErrorResponsedto(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IntegranteNoEncontradoExcepcion.class)
    public ResponseEntity<ErrorResponsedto> manejarIntegranteNoEncontrado(
            IntegranteNoEncontradoExcepcion ex,
            HttpServletRequest request
    ){
        ErrorResponsedto error = new ErrorResponsedto(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FamiliaNoEncontradaExcepcion.class)
    public ResponseEntity<ErrorResponsedto> manejarFamiliaNoEncontrado(
            FamiliaNoEncontradaExcepcion ex,
            HttpServletRequest request
    ){
        ErrorResponsedto error = new ErrorResponsedto(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FechaInvalidaExcepcion.class)
    public ResponseEntity<ErrorResponsedto> manejarFechaInvalida(
            FechaInvalidaExcepcion ex,
            HttpServletRequest request
    ){
        ErrorResponsedto error = new ErrorResponsedto(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(LimiteIntegrantesExcepcion.class)
    public ResponseEntity<ErrorResponsedto> manejarLimiteIntegrantes(
            LimiteIntegrantesExcepcion ex,
            HttpServletRequest request
    ){
        ErrorResponsedto error = new ErrorResponsedto(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponsedto> manejarErrorGeneral(
            Exception ex,
            HttpServletRequest request
    ){
        ErrorResponsedto error = new ErrorResponsedto(
                LocalDateTime.now(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                ex.getMessage(),
                request.getRequestURI()
        );
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
