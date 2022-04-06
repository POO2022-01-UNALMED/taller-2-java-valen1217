package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		int registo= registro; 
	}
	
	void asignarTipo(String tipo) {
		if (tipo.equals("electrico") || tipo.equals("gasolina")) {
			String cambio=tipo;
		}
	}
}
