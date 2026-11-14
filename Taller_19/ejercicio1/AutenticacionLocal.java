package Taller_19.ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion{

    @Override
    public boolean autenticar(String usuario, String contrasena) {

        if (usuario.equals("Merari") && contrasena.equals("1234")) {
            System.out.println("Autenticación local exitosa.");
            return true;
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
            return false;
        }
    }
}