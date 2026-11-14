package Taller_19.ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardarArchivo(String nombreArchivo) {

        System.out.println("El archivo " + nombreArchivo + " se guardó en la nube.");

    }

    @Override
    public void recuperarArchivo(String nombreArchivo) {

        System.out.println("El archivo " + nombreArchivo + " se recuperó de la nube.");

    }
}
