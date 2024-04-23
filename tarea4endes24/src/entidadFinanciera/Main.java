/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * GustavoC
 */

package entidadFinanciera;

public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        probarIngresar(objetoCuenta, 500, 3000);
        probarRetirar(objetoCuenta, 2000, 500);
    }
	    public static void probarIngresar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
	        try {
	            cuenta.ingresar(cantidad);
	            System.out.println("Ingreso realizado correctamente. Nuevo saldo: " + cuenta.obtenerSaldo());
	            if (cuenta.obtenerSaldo() == cantidadEsperada)
	                System.out.println("El saldo esperado coincide con el saldo actual.");
	            else
	                System.out.println("Error: El saldo esperado no coincide con el saldo actual.");
	        } catch (Exception e) {
	            System.out.println("Error al ingresar: " + e.getMessage());
	        }
	    }
	
	    public static void probarRetirar(CCuenta cuenta, double cantidad, double cantidadEsperada) {
	        try {
	            cuenta.retirar(cantidad);
	            System.out.println("Retiro realizado correctamente. Nuevo saldo: " + cuenta.obtenerSaldo());
	            if (cuenta.obtenerSaldo() == cantidadEsperada)
	                System.out.println("El saldo esperado coincide con el saldo actual.");
	            else
	                System.out.println("Error: El saldo esperado no coincide con el saldo actual.");
	        } catch (Exception e) {
	            System.out.println("Error al retirar: " + e.getMessage());
        }
    }
}
