/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * @author Gustavo
 * Esta calse es para almacenar datos de la cuenta
 */

public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
    

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return cuenta
 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * 
	 * @param cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * 
	 * @return saldo
	 */
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public static String getErrorcantidadnegativa() {
		return ERRORCANTIDADNEGATIVA;
	}

	public double estado(){
        return this.saldo;
    }

	public double obtenerSaldo() {
        return this.saldo;
    }
	
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("ERRORCANTIDADNEGATIVA");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   