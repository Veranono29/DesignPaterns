package creationalPaterns.singleton;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
		
		ExampleSingleton prueba = ExampleSingleton.getInstance("pepe");	//como el construcotr es privado llamo a este metodo estatico
																		// para que llame al constructor
		System.out.println(prueba.getPit());						//la cadena que le paso el construcotr la guarda en esta variable
		
		prueba.borrar();										//dejo de referenciar el objeto, que en este caso al estar siendo referenciado por el mismo
																//lo que tengo que volver null es un atrivuto suyo autereferenciante
														//si quisiera hacer que solo pudiera haber un objeto de estos referenciado en total 
														//pues se elimina este metodo y ya (metodo borrar)
		System.gc();										//en teoria llamo al colector de basura
		/*for (int i = 0; i < 80; i++) {						
			int a = 3;										//reyeno para darle tiempo a que venga
			a++;
			System.out.print(a);
		}System.out.println("");
		*/
		ExampleSingleton prueba2 = ExampleSingleton.getInstance("ASDFASDFADF");		//intento crear otro objeto de la misma clase
		System.out.println(prueba2.getPit());									//prueba para ver si ha funcionado
	}

}
