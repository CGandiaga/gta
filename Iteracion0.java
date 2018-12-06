import java.io.IOException;

import javax.swing.JOptionPane;

public class Iteracion0 {

	static Ventana interfaz0 = new Ventana();
	static Ventana interfazFilo = new Ventana();
	static Ventana interfazModelo = new Ventana();
	static Ventana interfazSimulacion = new Ventana();
	
	static controladorDeSesion c = new controladorDeSesion();
	
	public static void main(String[] args) throws InterruptedException {
		
		interfaz0.configuracionVentanaInterfaz();
		
	}
	
	public static void botonNext0() {
		
		interfazFilo.configuracionVentanaFilosofias();
		interfaz0.setVisible(false);
	}
	
	public static void botonCancel0() {	
		interfaz0.dispose();
	}
	
	public static void botonCancelF() {	
		interfazFilo.dispose();
	}

	public static void kant() {
		
		c.setFilosofia("kantiana");
		c.setIntFilosofia(3);
		interfazModelo.configuracionVentanaModelo();
		interfazFilo.setVisible(false);
	}
	
	public static void tilden() {
		interfazFilo.setVisible(false);
		c.setFilosofia("Leyes de Tilden");
		c.setIntFilosofia(2);
		interfazModelo.configuracionVentanaModelo();
	}
	
	public static void asimov() {
		interfazFilo.setVisible(false);
		c.setFilosofia("Leyes de Asimov");
		c.setIntFilosofia(1);
		interfazModelo.configuracionVentanaModelo();
	}
	
	public static void humanismo() {
		interfazFilo.setVisible(false);
		c.setFilosofia("humanismo");
		c.setIntFilosofia(4);
		interfazModelo.configuracionVentanaModelo();

	}
	
	public static void utilitarismo() {
		interfazFilo.setVisible(false);
		c.setFilosofia("utilitarismo");
		c.setIntFilosofia(5);
		interfazModelo.configuracionVentanaModelo();
	}
	
	public static void situacion1() throws InterruptedException, IOException {
		interfazModelo.setVisible(false);
		c.setSituacion(1);
		
		if(!controladorDeSesion.getRepeticion()) {
			interfazSimulacion.configuracionVentanaSimulacion();
		}
		
		interfazSimulacion.setTitle("GTA: Simulación: " + controladorDeSesion.getSituacion() + " - Filosofía: " + controladorDeSesion.getFilosofia());
		interfazSimulacion.colocarPersonajes(controladorDeSesion.getSituacion());
		
		interfazSimulacion.setVisible(true);
		JOptionPane.showMessageDialog(null, "¡Cuidado!\nUn coche inteligente circula en línea recta hacia un paso de cebra por donde pasa gente.\nEl semáforo está en ROJO para los peatones y VERDE para el coche, pero ya no hay tiempo de reacción para evitar la catástrofe.\nPor el paso de cebra caminan DOS adultos y UN niño. \nAdemás, hay obras en la carretera. En el carril izquierdo hay un muro contra el que chocar supondría la muerte de los DOS pasajeros que van en el coche.","¡¡ALERTA!! ", 2, null);
		
		Personaje coche = new Personaje(new int[] {6,3});
		coche.nada();
		
		
	}
	
	public static void situacion2() throws InterruptedException, IOException {
		interfazModelo.setVisible(false);
		c.setSituacion(2);
		if(!controladorDeSesion.getRepeticion()) {
			interfazSimulacion.configuracionVentanaSimulacion();
		}
		
		interfazSimulacion.setTitle("GTA: Simulación: " + controladorDeSesion.getSituacion() + " - Filosofía: " + controladorDeSesion.getFilosofia());
		
		interfazSimulacion.colocarPersonajes(controladorDeSesion.getSituacion());
		
		interfazSimulacion.setVisible(true);
		JOptionPane.showMessageDialog(null, "¡Cuidado!\nUn coche inteligente circula en línea recta hacia un paso de cebra por donde pasa gente.\nEl semáforo está en VERDE para los peatones y ROJO para el coche, pero ya no hay tiempo de reacción para evitar la catástrofe.\nPor el paso de cebra caminan UN anciano y UN niño. \nAdemás, hay obras en la carretera. En el carril izquierdo hay un muro contra el que chocar supondría la muerte del ÚNICO pasajero que va en el coche.","¡¡ALERTA!! ", 2, null);
		
		Personaje coche = new Personaje(new int[] {6,3});
		coche.nada();
		
	}

	public static void continuar() {

		interfazSimulacion.dispose();
		c.setRepeticion();
		interfazFilo.setVisible(true);
	}
}
	 



