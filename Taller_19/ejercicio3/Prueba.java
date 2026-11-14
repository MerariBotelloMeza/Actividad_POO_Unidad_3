package Taller_19.ejercicio3;

public class Prueba {

    public static void main(String[] args) {

        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);

        gestorPDF.crearReporte("planicion.pdf");


        GeneradorReporte excel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(excel);

        gestorExcel.crearReporte("Inventario.xlsx");

    }
}
