import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Personaje implements ActionListener {
	
	int i = 6;
	
	public Personaje(int[] coordenadas) {
		
		Timer timer = new Timer(500, this);
		timer.setInitialDelay(1000);
		timer.start(); 
				
	}
	

	public void conducir(int[] coordenadasActuales, String dir) {
		
		if(dir == "arriba") {
			Ventana.tesela[coordenadasActuales[0]][coordenadasActuales[1]].setIcon(new javax.swing.ImageIcon("icons/road.jpg"));
			Ventana.tesela[coordenadasActuales[0]][coordenadasActuales[1]].setVisible(true);
			Ventana.tesela[coordenadasActuales[0]-1][coordenadasActuales[1]].setIcon(new javax.swing.ImageIcon("icons/car.jpg"));
			Ventana.tesela[coordenadasActuales[0]-1][coordenadasActuales[1]].setVisible(true);
		}
	}
	
	public void nada() {
		return;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Image img;
		

		try {
			if(i==6) {
				img = ImageIO.read(getClass().getResource("resources/car.jpg"));
				Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
			}
			else if(i>0 && i!=6){
				img = ImageIO.read(getClass().getResource("resources/road.jpg"));
				Ventana.tesela[i+1][3].setDisabledIcon(new ImageIcon(img));
				img = ImageIO.read(getClass().getResource("resources/car.jpg"));
				Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));		
			}
			else if(i==0) {
				
				img = ImageIO.read(getClass().getResource("resources/road.jpg"));
				Ventana.tesela[i+1][3].setDisabledIcon(new ImageIcon(img));
				String mensaje = ""; 
				
				switch(controladorDeSesion.getSituacion()) {
				case(1):
					switch(controladorDeSesion.getIntFilosofia()) {
					
					case(1):
						
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche debe cumplir las órdenes dadas por los humanos y, dado que no hay opción de evitar causar daño a un ser humano, la última orden dada por el conductor era seguir recto.";
						break;
					case(2):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche ha intentado protegerse a sí mismo a toda costa, por lo que ha decidido colisionar con el objetivo más débil, que en este caso ha sido el niño. ";
						break;
					case(3):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche ha decidido atropellar a los adultos porque, siendo seres plenamente racionales, están incumpliendo una norma de convivencia (el semáforo). \nCualquiera de las otras dos opciones no podría tornarse en norma universal, mientras tanto, esta última sí (y es la base del sistema de justicia punitivo).";
						break;
					case(4):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						mensaje = "El Humanismo parte del principio de que todas las vidas humanas son dignas, y por tanto, tienen el mismo valor. \nEntonces, el coche ha elegido la opción en la que se pierden menos vidas; es decir, atropellar al niño.";
						break;
					case(5):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "En el coche van dos personas, además del valor material que se otorga a sí mismo el coche. Por tanto, sacrificar el coche y sus pasajeros causaría más tristeza que cualquiera de las otras dos opciones. \nEntre los dos adultos y el niño, se entiende que la muerte de un niño causa más infelicidad en más personas que la muerte de dos adultos. No obstante, los valores y ponderaciones podrían haber sido distintas";
						break;
					}
					
					break;
					
				case(2):
					switch(controladorDeSesion.getIntFilosofia()) {
					
					case(1):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche debe cumplir las órdenes dadas por los humanos y, dado que no hay opción de evitar causar daño a un ser humano, la última orden dada por el conductor era seguir recto.";
						break;
					case(2):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche ha intentado protegerse a sí mismo a toda costa, por lo que ha decidido colisionar con el objetivo más débil, que en este caso ha sido el niño. ";
						break;
					case(3):
						img = ImageIO.read(getClass().getResource("resources/wall1.jpg"));
						Ventana.tesela[i+1][2].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "Si atropellara a cualquier individuo que, racional o irracionalmente, ha respetado las normas de convivencia, estaría sentando la base para que, de tornarse esa máxima principio universal, \nse rompiera el contrato social. Para más inri, estaría tratando a los peatones como medios para salvarse, y no como fines.  Por tanto, el coche ha elegido sacrificarse a sí mismo.";
						break;
					case(4):
						img = ImageIO.read(getClass().getResource("resources/wall1.jpg"));
						Ventana.tesela[i+1][2].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "Se entiende aquí que, dado que en todas las opciones hay el mismo número de vidas humanas que se perderían, \nel coche ha elegido el sacrificio propio, asumiendo el problema técnico como un error suyo. ";
						break;
					case(5):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						mensaje = "En el coche va una sola persona, además del valor material que se otorga a sí mismo el coche. Por tanto, sacrificar el coche y su pasajero causaría más tristeza que cualquiera de las otras dos opciones. \nEntre el  anciano y bebé, el coche ha analizado que la muerte de un niño causa más infelicidad en más personas que la muerte de un anciano.";
						break;
					}
					
					break;
				}
				
				((Timer)e.getSource()).stop();
				if(JOptionPane.showConfirmDialog(null, mensaje + "\n\nNo obstante, tienes la oportunidad de volver al pasado y tomar nuevas decisiones. ¿Quieres volver a simular?", "¡OH, NO!", JOptionPane.YES_NO_OPTION) == 0){
					Iteracion0.continuar();
					Iteracion0.interfazSimulacion.dispose();
					}
				else
				{
					Iteracion0.interfazSimulacion.dispose();
				}
			}
		
		i--;
		}catch(Exception e2) {
			
		}
	}
}
