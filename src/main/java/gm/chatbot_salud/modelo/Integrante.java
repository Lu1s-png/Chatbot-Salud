package gm.chatbot_salud.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Document(collection = "integrantes")
public class Integrante{
   @Id
    private String idIntegrante;

   private String nombre;

   @DBRef
    private Familia familia;

   public Integrante(){
   }

   public Integrante(String idIntegrante){
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

