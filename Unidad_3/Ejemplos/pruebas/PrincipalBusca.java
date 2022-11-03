package pruebas;


public class PrincipalBusca {

	public static void main(String[] args) {
		int numero=26, resultado;
		   // https://www.juegosonce.es/resultados-superonce-06-noviembre-2016
		   int [] superonce= {5, 9, 15, 24, 26, 30, 34, 36, 37, 42, 47, 55, 56, 58, 63, 67, 70, 71, 73, 78};
		   resultado= busca.Busca.busquedaBinaria(superonce, numero);
		   if (resultado !=-1)
				System.out.println("El numero " + numero + " apareció y ocupa la posicion " + resultado + " (comenzando en la 0)");
		   else	
				System.out.println("El numero " + numero + " no salió premiado ") ;

	}

}
