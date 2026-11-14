package Taller_19.ejercicio1;

public class prueba {
        public static void main(String[] args) {

            ServicioAutenticacion local = new AutenticacionLocal();

            GestorAutenticacion gestorLocal = new GestorAutenticacion(local);

            gestorLocal.iniciarSesion("Merari", "1234");


            ServicioAutenticacion oauth = new AutenticacionOAuth();

            GestorAutenticacion gestorOAuth = new GestorAutenticacion(oauth);

            gestorOAuth.iniciarSesion("Merari", "TOKEN123");

        }
}
