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
	    	int contador=0;
	    	int totalAsientos= asientos.length;
	    	
	    	for (int i=0;i<totalAsientos; i++) {
	    		if (asientos[i] != null) {
	    			contador++;
	    		}
	    	}
	    	System.out.println(contador);
	    }
	    
	    public String verificarIntegridad(){
	    		
	    	if (motor.registro == registro) {
	    		System.out.println("Auto original");
	    	}else {
	    		System.out.println("Las piezas no son originales");
	    	}
	    }
	    	
}
