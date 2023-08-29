package it.corso;

	
class Lucia {

    @Override
    public String toString() {
        return "Lucia, di Milano";
    }
}

class Renzo {

    @Override
    public String toString() {
        return "Renzo, di Roma";
    }
}

class Treno {

    @Override
    public String toString() {
        return "col treno";
    }
}

class Aereo {

    @Override
    public String toString() {
        return "con l'aereo";
    }
}
	
	class Mezzo <T> { 
	    private T mezzo; 

	    // costruttore
	    public Mezzo(T t) { 
	        mezzo = t; 
	    }
	   
	public T getMezzo() {
		return mezzo;
	}
	
	
	}
	
	class Persona <T>{
		private T persona;
		
		//costruttore
		
		public Persona(T t) {
			persona = t;
		}
		
		public T getPersona() {
			return persona;
		}
	}
	
	class Viaggio {
	
		public void faiViaggio (Mezzo<?> mezzo,Persona<?> persona) {
			System.out.println(persona.getPersona().toString() + " ha viaggiato " + mezzo.getMezzo().toString());
		}
		
		
	}
	
	public class GenericsTest {
		
		public static void main(String[] args) {
			
			Mezzo <Treno> treno = new Mezzo<Treno>(new Treno());
			Mezzo <Aereo> aereo= new Mezzo<Aereo>(new Aereo());
			Persona <Lucia> lucia = new Persona<Lucia>(new Lucia());
			Persona <Renzo> renzo = new Persona<Renzo>(new Renzo());
			
			Viaggio viaggio = new Viaggio();
			viaggio.faiViaggio(treno,renzo);
			viaggio.faiViaggio(aereo,renzo);
			viaggio.faiViaggio(treno, lucia);
			viaggio.faiViaggio(aereo,lucia);
			
	}
	
	}
	
	
	

