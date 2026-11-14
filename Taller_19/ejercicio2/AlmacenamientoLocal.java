package Taller_19.ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo) {

        System.out.println("El archivo " + nombreArchivo + " se guardó localmente.");

    }

    @Override
    public void recuperarArchivo(String nombreArchivo) {

        System.out.println("El archivo " + nombreArchivo + " se recuperó del almacenamiento local");

    }
}
