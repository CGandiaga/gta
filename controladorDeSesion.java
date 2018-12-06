
public class controladorDeSesion {
	
	static int situacion;
	static String filosofia;
	static int filosofiaMenu;
	static boolean repeticion = false;
	
	public controladorDeSesion() {
		
	}
	
	public void setSituacion(int situacion) {
		
		controladorDeSesion.situacion = situacion;
		
	}
	
	public void setFilosofia(String filosofia) {
		
		controladorDeSesion.filosofia = filosofia;
		
	}
	
	public void setRepeticion() {
		controladorDeSesion.repeticion = true; 
	}
	
	
	public static int getSituacion() {
		return situacion;
	}
	
	public static String getFilosofia() {
		return filosofia;
	}

	public void setIntFilosofia(int filosofia) {
		controladorDeSesion.filosofiaMenu = filosofia;
	}
	
	public static int getIntFilosofia() {
		return filosofiaMenu;
	}

	public static boolean getRepeticion() {
		// TODO Auto-generated method stub
		return controladorDeSesion.repeticion;
	}
}
