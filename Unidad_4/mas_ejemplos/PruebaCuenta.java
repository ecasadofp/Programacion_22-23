package ejemplos;

public class PruebaCuenta {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		c1.setNombre("Alberto Carrera");
		c1.setNumeroCuenta("ES1111");
		c1.setTipoInteres(0.05);
		c1.setSaldo(600);
	    Cuenta c2 = new Cuenta("Raquel Carrera", "ES2222", 0.05, 1200);
        System.out.println(c1.transferencia(c2, 3000));
        System.out.println("Saldo c1: "+ c1.getSaldo());
        System.out.println("Saldo c2: "+ c2.getSaldo());
	}

}
