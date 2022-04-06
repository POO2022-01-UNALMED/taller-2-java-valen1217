package test;

public class Auto {

		String modelo;
	    int precio;
	    Asiento[] asientos; 	    
	    String marca;
	    Motor motor;
	    int registro;
	    static int cantidadCreados;
		
	    public  int cantidadAsientos() {
	    	int total=asientos.length;
	    	return total;
	    }
	    
	    public String verificarIntegridad(){
	    		
	    	if (motor.registro == registro) {
	    		System.out.println("Auto original");
	    	}else {
	    		System.out.println("Las piezas no son originales");
	    	}
	    }
	    	
}
