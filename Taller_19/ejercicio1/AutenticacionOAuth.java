package Taller_19.ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasena) {

        if (contrasena.equals("TOKEN123")) {
            System.out.println("Autenticación OAuth exitosa.");
            return true;
        } else {
            System.out.println("Token de autenticación inválido.");
            return false;
        }
    }
}
