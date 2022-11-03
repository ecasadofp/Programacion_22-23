package pruebas;

public class PrincipalOrden {

	public static void main(String[] args) {
	int [] m  = new int[100]; // !Probar 100000
	rellenar(m);
	//orden.Orden.burbuja(m);
	//orden.Orden.insercion(m);
	orden.Orden.seleccion(m);
	//orden.Orden.quicksort(m, 0, m.length-1);
	
	visualizar(m);

	}


//
public static void rellenar (int [] m) {
	for (int i=0; i< m.length; i++)
		m[i]= (int) (Math.random()*100 + 1);
} // de rellenar
//
public static void visualizar (int [] m) {
	for (int i=0; i< m.length; i++)
		System.out.print(m[i] + " - ");
} // de visualizar


//
} // de Principal
