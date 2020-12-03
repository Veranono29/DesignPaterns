package creationalPaterns.singleton;

public class ExampleSingleton {	//lazy construction
	
	private static ExampleSingleton uniqueInstance = null;
	
	private String pit;
	
	private ExampleSingleton(String pi) {
		pit = pi;
	}

	public static ExampleSingleton getInstance(String pi){
		if(uniqueInstance == null){
			uniqueInstance = new ExampleSingleton(pi);
		}
		return uniqueInstance;
	}
	public void borrar(){
		uniqueInstance=null;
	}
	
	public String getPit() {
		return pit;
	}
	
	
}
