package Taller_19.ejercicio3;

public class GestorReportes {

    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String nombreArchivo) {

        generador.generarReporte(nombreArchivo);

    }

}
