package Taller_19.ejercicio2;

public class Prueba {

        public static void main(String[] args) {

            Almacenamiento local = new AlmacenamientoLocal();

            GestorArchivos gestorLocal = new GestorArchivos(local);

            gestorLocal.guardar("archivo.pdf");
            gestorLocal.recuperar("archivo.pdf");


            Almacenamiento nube = new AlmacenamientoNube();

            GestorArchivos gestorNube = new GestorArchivos(nube);

            gestorNube.guardar("video.mp4");
            gestorNube.recuperar("video.mp4");

        }
}
