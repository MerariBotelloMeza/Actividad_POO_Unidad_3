package Taller_19.ejercicio3;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public void generarReporte(String nombreArchivo){
        System.out.println("Se ha generado el reporte Excel: " + nombreArchivo);

    }
}
