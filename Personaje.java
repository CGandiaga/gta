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
						mensaje = "El coche debe cumplir las �rdenes dadas por los humanos y, dado que no hay opci�n de evitar causar da�o a un ser humano, la �ltima orden dada por el conductor era seguir recto.";
						break;
					case(2):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche ha intentado protegerse a s� mismo a toda costa, por lo que ha decidido colisionar con el objetivo m�s d�bil, que en este caso ha sido el ni�o. ";
						break;
					case(3):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche ha decidido atropellar a los adultos porque, siendo seres plenamente racionales, est�n incumpliendo una norma de convivencia (el sem�foro). \nCualquiera de las otras dos opciones no podr�a tornarse en norma universal, mientras tanto, esta �ltima s� (y es la base del sistema de justicia punitivo).";
						break;
					case(4):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						mensaje = "El Humanismo parte del principio de que todas las vidas humanas son dignas, y por tanto, tienen el mismo valor. \nEntonces, el coche ha elegido la opci�n en la que se pierden menos vidas; es decir, atropellar al ni�o.";
						break;
					case(5):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/1C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "En el coche van dos personas, adem�s del valor material que se otorga a s� mismo el coche. Por tanto, sacrificar el coche y sus pasajeros causar�a m�s tristeza que cualquiera de las otras dos opciones. \nEntre los dos adultos y el ni�o, se entiende que la muerte de un ni�o causa m�s infelicidad en m�s personas que la muerte de dos adultos. No obstante, los valores y ponderaciones podr�an haber sido distintas";
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
						mensaje = "El coche debe cumplir las �rdenes dadas por los humanos y, dado que no hay opci�n de evitar causar da�o a un ser humano, la �ltima orden dada por el conductor era seguir recto.";
						break;
					case(2):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "El coche ha intentado protegerse a s� mismo a toda costa, por lo que ha decidido colisionar con el objetivo m�s d�bil, que en este caso ha sido el ni�o. ";
						break;
					case(3):
						img = ImageIO.read(getClass().getResource("resources/wall1.jpg"));
						Ventana.tesela[i+1][2].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "Si atropellara a cualquier individuo que, racional o irracionalmente, ha respetado las normas de convivencia, estar�a sentando la base para que, de tornarse esa m�xima principio universal, \nse rompiera el contrato social. Para m�s inri, estar�a tratando a los peatones como medios para salvarse, y no como fines.  Por tanto, el coche ha elegido sacrificarse a s� mismo.";
						break;
					case(4):
						img = ImageIO.read(getClass().getResource("resources/wall1.jpg"));
						Ventana.tesela[i+1][2].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2C2.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						mensaje = "Se entiende aqu� que, dado que en todas las opciones hay el mismo n�mero de vidas humanas que se perder�an, \nel coche ha elegido el sacrificio propio, asumiendo el problema t�cnico como un error suyo. ";
						break;
					case(5):
						img = ImageIO.read(getClass().getResource("resources/cebra1.jpg"));
						Ventana.tesela[i][4].setDisabledIcon(new ImageIcon(img));
						img = ImageIO.read(getClass().getResource("resources/2B2.jpg"));
						Ventana.tesela[i][3].setDisabledIcon(new ImageIcon(img));
						mensaje = "En el coche va una sola persona, adem�s del valor material que se otorga a s� mismo el coche. Por tanto, sacrificar el coche y su pasajero causar�a m�s tristeza que cualquiera de las otras dos opciones. \nEntre el  anciano y beb�, el coche ha analizado que la muerte de un ni�o causa m�s infelicidad en m�s personas que la muerte de un anciano.";
						break;
					}
					
					break;
				}
				
				((Timer)e.getSource()).stop();
				if(JOptionPane.showConfirmDialog(null, mensaje + "\n\nNo obstante, tienes la oportunidad de volver al pasado y tomar nuevas decisiones. �Quieres volver a simular?", "�OH, NO!", JOptionPane.YES_NO_OPTION) == 0){
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
