package ejemplos;


public class PruebaPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		/*p1.ponNombre("Alberto");
		p1.ponApellidos("Carrera Martín");
		p1.ponDni(18022567);
		p1.ponEdad(40);
		System.out.println(p1);*/
		
		//----
		
		Persona p2 = new Persona(18012401, 14, "Mario", "Carrera Bailín");
		System.out.println(p2.dameApellidos());
		System.out.println(p2.dameNif());
		p2.ponEdad(15);
		System.out.println(p2);
		Nif nif1 = new Nif(18022507);
		p2.ponNif(nif1);
		System.out.println(p2.dameNif());
		
	}
}
