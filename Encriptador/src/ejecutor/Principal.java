package ejecutor;

import controller.Controlador;
import java.io.IOException;

public class Principal  {
     public static void main(String[] args) {
      Controlador controladorsito = new Controlador();
      controladorsito.seleccionarArchivo("C:\\Users\\MentoringIT\\Desktop\\hola.txt");
      controladorsito.setLlave("NeverBackDown");
         try {
//             controladorsito.encriptar();
             controladorsito.desencriptar();
         } catch (IOException ex) {
             System.err.println("Hola, tienes sueño?");
         }
      
    }     
}



