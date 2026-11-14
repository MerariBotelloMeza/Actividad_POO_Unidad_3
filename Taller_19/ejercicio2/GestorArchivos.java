package Taller_19.ejercicio2;

public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombreArchivo) {

        almacenamiento.guardarArchivo(nombreArchivo);

    }

    public void recuperar(String nombreArchivo) {

        almacenamiento.recuperarArchivo(nombreArchivo);

    }
}
