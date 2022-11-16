package ejemplos;

//Clase Cuenta
public class Cuenta {
    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
	
    public Cuenta() {
	}

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
	    this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean ingreso(double cantidad) {
		boolean resultadoIngreso = true;
		if (cantidad <=0)
				resultadoIngreso=false;
		else
				saldo=saldo+cantidad;
		return resultadoIngreso;
	}
	public boolean reintegro (double cantidad) {
		boolean resultadoReintegro=true;
		if (cantidad <=0 || saldo < cantidad)
			resultadoReintegro=false;
		else
			saldo = saldo - cantidad;
		return resultadoReintegro;
	}
	
	public boolean transferencia (Cuenta destino, double cantidad) {
		boolean resultadoTransferencia=true;
		if (reintegro(cantidad))
			destino.ingreso(cantidad);
		else
			resultadoTransferencia=false;
		
		return resultadoTransferencia;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", tipoInteres=" + tipoInteres
				+ ", saldo=" + saldo + "]";
	}
    

} // De la Clase Cuenta