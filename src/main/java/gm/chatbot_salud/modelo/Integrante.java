package gm.chatbot_salud.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Document(collection = "integrante")
public class Integrante{
   @Id
    private Integer idIntegrante;

   private String nombre;

   @DBRef
    private Familia familia;

   public Integrante(){
   }

   public Integrante(Integer idIntegrante){
       this.idIntegrante = idIntegrante;
   }

    @Override
    public String toString() {
        return "Integrante{" +
                "idIntegrante='" + idIntegrante + '\'' +
                ", integrante='" + nombre + '\'' +
                ", familia=" + familia +
                '}';
    }
}

