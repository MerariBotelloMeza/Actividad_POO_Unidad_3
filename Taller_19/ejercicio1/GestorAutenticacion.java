package Taller_19.ejercicio1;

public class GestorAutenticacion {

    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String contrasena) {

        servicio.autenticar(usuario, contrasena);

    }
}