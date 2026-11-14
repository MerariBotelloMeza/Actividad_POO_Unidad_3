package Taller_18.ejercicio2;

public class Usuarios implements Retiros,Transferencias,PagosFacturas {
    @Override
    public void retiros(){

        System.out.println("Los usuarios pueden retirar dinero.");
    }

    @Override
    public void pagosFacturas(){

        System.out.println("Los usuario pueden pagar facturas");
    }

    @Override
    public void transferencias(){

        System.out.println("Los usuarios puede transferir dinero");
    }

}
