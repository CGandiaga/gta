import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Ventana extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = 1L;
	
	JTextArea cabecera = new JTextArea(); 
	JTextArea mensajeBienvenida = new JTextArea();
	JTextArea nombres = new JTextArea();
	JTextArea usoFilo = new JTextArea();
	JTextArea filoText1 = new JTextArea();
	JTextArea filoText2 = new JTextArea();
	JTextArea filoText3 = new JTextArea();
	JTextArea filoText4 = new JTextArea();
	JTextArea filoText5 = new JTextArea();
	
	static JButton next = new JButton();
	static JButton cancel0 = new JButton();
	static JButton filoButton1 = new JButton();
	static JButton filoButton2 = new JButton();
	static JButton filoButton3 = new JButton();
	static JButton filoButton4 = new JButton();
	static JButton filoButton5 = new JButton();
	static JButton cancelF = new JButton();
	static JButton situacion1 = new JButton();
	static JButton situacion2 = new JButton();
	static JButton[][] tesela;
	
	
	
	public void configuracionVentanaInterfaz(){
		
		this.setTitle("ELU VI - Generando Tontería Artificial");
		this.setSize(625,416);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.BLUE );
		
		cabecera = new JTextArea();
		cabecera.setPreferredSize(new Dimension(550, 22));
		cabecera.setLineWrap(true);
		cabecera.setEditable(false);
		cabecera.setBackground(Color.LIGHT_GRAY);
		cabecera.setForeground(Color.BLUE);
		cabecera.setFont(cabecera.getFont().deriveFont(Font.BOLD, cabecera.getFont().getSize()));
		cabecera.append("                                                                    Generando Tontería Artificial");
		
		mensajeBienvenida = new JTextArea();
		mensajeBienvenida.setPreferredSize(new Dimension(550, 275));
		mensajeBienvenida.setLineWrap(true);
		mensajeBienvenida.setEditable(false);
		mensajeBienvenida.setBackground(Color.WHITE);
		mensajeBienvenida.setForeground(Color.BLUE);
		mensajeBienvenida.setFont(mensajeBienvenida.getFont().deriveFont(Font.ITALIC, mensajeBienvenida.getFont().getSize()));
		mensajeBienvenida.append("\n Puede simbolizar uno de los mayores hitos tecnológicos de la historia.\n\n Se trata del coche autónomo, ese vehículo que, a medio camino entre lo real y lo futurista, empieza  a introducirse en el discurso social. Una innovación tan importante que, de hecho, ni siquiera\n somos aún conscientes de lo que puede suponer.\r\n" + 
				"\r\n" + 
				" Son muchas las palabras apasionadas y de futuro, pero escaso el discurso racional que no solo\n comente sus evidentes ventajas, sino también sus posibles contras \n\n El objetivo de esta aplicación no es otro que visibilizar algunas de esas situaciones que el discurso  más pasional tiende a pasar por alto. La filosofía en base a la que esté programado el robot es\n bastante más que unas cuantas líneas de código y, en ocasiones, podría marcar la\n diferencia entre la vida o la muerte.\n\n ¡¡Esperamos que disfrutéis de la simulación:    G.T.A. (Generando Tontería Artificial)!! ");
		
		nombres = new JTextArea();
		nombres.setPreferredSize(new Dimension(550,22));
		nombres.setEditable(false);
		nombres.setBackground(Color.LIGHT_GRAY);
		nombres.setForeground(Color.BLUE);
		nombres.setFont(nombres.getFont().deriveFont(Font.ITALIC, nombres.getFont().getSize()));
		nombres.setFont(nombres.getFont().deriveFont(Font.BOLD, nombres.getFont().getSize()));
		nombres.append("                  Carlos Gandiaga Calero - Jaime Redondo Yuste - Diego José Sánchez Martín");
		
		next = new JButton();
		next.setPreferredSize(new Dimension(273,25));
		next.setBackground(Color.GREEN);
		next.setForeground(Color.WHITE);
		next.setText("Continuar...");
		next.addMouseListener(this);
		
		cancel0 = new JButton();
		cancel0.setPreferredSize(new Dimension(273,25));
		cancel0.setBackground(Color.RED);
		cancel0.setForeground(Color.WHITE);
		cancel0.setText("Salir");
		cancel0.addMouseListener(this);
		
		add(cabecera);
		add(mensajeBienvenida);
		add(next);
		add(cancel0);
		add(nombres);
		this.setVisible(true);
		
	}

	public void configuracionVentanaFilosofias() {
		this.setTitle("ELU VI - Elija las reglas del juego");
		this.setSize(625,415);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.BLUE);
		
		cabecera = new JTextArea();
		cabecera.setPreferredSize(new Dimension(550, 22));
		cabecera.setLineWrap(true);
		cabecera.setEditable(false);
		cabecera.setBackground(Color.LIGHT_GRAY);
		cabecera.setForeground(Color.BLUE);
		cabecera.setFont(cabecera.getFont().deriveFont(Font.BOLD, cabecera.getFont().getSize()));
		cabecera.append("                                                                    Generando Tontería Artificial");
		
		
		usoFilo.setPreferredSize(new Dimension(550, 55));
		usoFilo.setLineWrap(true);
		usoFilo.setEditable(false);
		usoFilo.setBackground(Color.WHITE);
		usoFilo.setForeground(Color.BLUE);
		usoFilo.setFont(usoFilo.getFont().deriveFont(Font.ITALIC, usoFilo.getFont().getSize()));
		usoFilo.append(" Elige la filosofía con la que quieres desarrollar el juego. En función de tu elección, nuestra \n inteligencia artificial tomará unas decisiones u otras. Haga click en la filosofía que desee probar. \n Después, podrás volver atrás y probar otras corrientes de pensamiento");
		
		nombres = new JTextArea();
		nombres.setPreferredSize(new Dimension(550,22));
		nombres.setEditable(false);
		nombres.setBackground(Color.LIGHT_GRAY);
		nombres.setForeground(Color.BLUE);
		nombres.setFont(nombres.getFont().deriveFont(Font.ITALIC, nombres.getFont().getSize()));
		nombres.setFont(nombres.getFont().deriveFont(Font.BOLD, nombres.getFont().getSize()));
		nombres.append("                  Carlos Gandiaga Calero - Jaime Redondo Yuste - Diego José Sánchez Martín");
		
		filoButton1 = new JButton();
		filoButton1.setPreferredSize(new Dimension(200,40));
		filoButton1.setBackground(Color.GREEN);
		filoButton1.setForeground(Color.WHITE);
		filoButton1.setText("Leyes de Asimov");
		filoButton1.addMouseListener(this);
		
		filoText1 = new JTextArea();
		filoText1.setPreferredSize(new Dimension(346,40));
		filoText1.setEditable(false);
		filoText1.setLineWrap(true);
		filoText1.setBackground(Color.BLUE);
		filoText1.setForeground(Color.WHITE);
		filoText1.append("  \"Un robot no hará daño a la Humanidad o permitirá que sufra\"\n\t\t - Isaac Asimov");
		
		filoButton2 = new JButton();
		filoButton2.setPreferredSize(new Dimension(200,40));
		filoButton2.setBackground(Color.GREEN);
		filoButton2.setForeground(Color.WHITE);
		filoButton2.setText("Leyes de Tilden");
		filoButton2.addMouseListener(this);
		
		filoText2 = new JTextArea();
		filoText2.setPreferredSize(new Dimension(346,40));
		filoText2.setEditable(false);
		filoText2.setLineWrap(true);
		filoText2.setBackground(Color.BLUE);
		filoText2.setForeground(Color.WHITE);
		filoText2.append("  \"Un robot debe proteger su existencia bajo todo costo.\"\t\t - Mark Tilden");
		
		filoButton3 = new JButton();
		filoButton3.setPreferredSize(new Dimension(200,40));
		filoButton3.setBackground(Color.GREEN);
		filoButton3.setForeground(Color.WHITE);
		filoButton3.setText("Kant");
		filoButton3.addMouseListener(this);
		
		filoText3 = new JTextArea();
		filoText3.setPreferredSize(new Dimension(346,40));
		filoText3.setEditable(false);
		filoText3.setLineWrap(true);
		filoText3.setBackground(Color.BLUE);
		filoText3.setForeground(Color.WHITE);
		filoText3.append("  \"Obra según una máxima que quieras que sea ley universal.\"\n\t\t - Immanuel Kant");
		
		filoButton4 = new JButton();
		filoButton4.setPreferredSize(new Dimension(200,40));
		filoButton4.setBackground(Color.GREEN);
		filoButton4.setForeground(Color.WHITE);
		filoButton4.setText("Humanismo");
		filoButton4.addMouseListener(this);
		
		filoText4 = new JTextArea();
		filoText4.setPreferredSize(new Dimension(346,40));
		filoText4.setEditable(false);
		filoText4.setLineWrap(true);
		filoText4.setBackground(Color.BLUE);
		filoText4.setForeground(Color.WHITE);
		filoText4.append("  \"La paz más desventajosa es mejor que la guerra más justa.\"\n\t\t - Erasmo de Rotterdam");
		
		filoButton5 = new JButton();
		filoButton5.setPreferredSize(new Dimension(200,40));
		filoButton5.setBackground(Color.GREEN);
		filoButton5.setForeground(Color.WHITE);
		filoButton5.setText("Utilitarismo");
		filoButton5.addMouseListener(this);
		
		filoText5 = new JTextArea();
		filoText5.setPreferredSize(new Dimension(346,40));
		filoText5.setEditable(false);
		filoText5.setLineWrap(true);
		filoText5.setBackground(Color.BLUE);
		filoText5.setForeground(Color.WHITE);
		filoText5.append("  \"La mayor felicidad para el mayor número de personas.\"\n\t\t - Jeremy Bentham" );
			
		cancelF = new JButton();
		cancelF.setPreferredSize(new Dimension(273,25));
		cancelF.setBackground(Color.RED);
		cancelF.setForeground(Color.WHITE);
		cancelF.setText("Salir");
		cancelF.addMouseListener(this);
		
		add(cabecera);
		add(usoFilo);
		add(filoButton1);
		add(filoText1);
		add(filoButton2);
		add(filoText2);
		add(filoButton3);
		add(filoText3);
		add(filoButton4);
		add(filoText4);
		add(filoButton5);
		add(filoText5);
		add(nombres);
		add(cancelF);
		
		this.setVisible(true);
		
	}
	
	public void configuracionVentanaModelo() {
		
		if(!controladorDeSesion.getRepeticion()) {
		this.setTitle("ELU VI - Elija la situación del juego");
		this.setSize(625,358);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.BLUE);
		
		cabecera.removeAll();
		cabecera = new JTextArea();
		cabecera.setPreferredSize(new Dimension(550, 22));
		cabecera.setLineWrap(true);
		cabecera.setEditable(false);
		cabecera.setBackground(Color.LIGHT_GRAY);
		cabecera.setForeground(Color.BLUE);
		cabecera.setFont(cabecera.getFont().deriveFont(Font.BOLD, cabecera.getFont().getSize()));
		cabecera.append("                                                                    Generando Tontería Artificial");
		
		mensajeBienvenida.setPreferredSize(new Dimension(550, 58));
		mensajeBienvenida.setLineWrap(true);
		mensajeBienvenida.setEditable(false);
		mensajeBienvenida.setForeground(Color.BLUE);
		mensajeBienvenida.setFont(usoFilo.getFont().deriveFont(Font.ITALIC, usoFilo.getFont().getSize()));
		mensajeBienvenida.append(" Elige la situación con la que quieres desarrollar la simulación. En función de tu elección, nuestra \n inteligencia artificial tomará unas decisiones u otras. Haga click en la situación que desee probar. \n Después, podrás volver atrás y probar otras corrientes de pensamiento");

		situacion1 = new JButton();
		situacion1.setPreferredSize(new Dimension(272,190));
		situacion1.setBackground(Color.MAGENTA);
		situacion1.setForeground(Color.WHITE);
		situacion1.setText("Situación 1");
		situacion1.addMouseListener(this);
		
		situacion2 = new JButton();
		situacion2.setPreferredSize(new Dimension(272,190));
		situacion2.setBackground(Color.ORANGE);
		situacion2.setForeground(Color.WHITE);
		situacion2.setText("Situación 2");
		situacion2.addMouseListener(this);
		
		nombres = new JTextArea();
		nombres.setPreferredSize(new Dimension(550,22));
		nombres.setEditable(false);
		nombres.setBackground(Color.LIGHT_GRAY);
		nombres.setForeground(Color.BLUE);
		nombres.setFont(nombres.getFont().deriveFont(Font.ITALIC, nombres.getFont().getSize()));
		nombres.setFont(nombres.getFont().deriveFont(Font.BOLD, nombres.getFont().getSize()));
		nombres.append("                  Carlos Gandiaga Calero - Jaime Redondo Yuste - Diego José Sánchez Martín");
		
			add(cabecera);
			add(mensajeBienvenida);
			add(situacion1);
			add(situacion2);
			add(nombres);
		}
		
		this.setVisible(true);
	}
	
	public void configuracionVentanaSimulacion() throws InterruptedException, IOException {
		
		int I=7, J=7;
		
		this.setTitle("GTA: Simulación: " + controladorDeSesion.getSituacion() + " - Filosofía: " + controladorDeSesion.getFilosofia());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550,550);
		this.setLayout(new GridLayout(I,J));
		
		tesela = new JButton[I][J];
		Image img;
		
		for (int i=0; i<I; i++) {
			for (int j=0; j<J; j++) {
				tesela[i][j] = new JButton(); 
				if(j==0 || j==6) {
					img = ImageIO.read(getClass().getResource("resources/grass.jpg"));
				    tesela[i][j].setIcon(new ImageIcon(img));
				    tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==3 || j == 4 || j ==2) {
					img = ImageIO.read(getClass().getResource("resources/road.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==5 && i%2!=0) {
					img = ImageIO.read(getClass().getResource("resources/5.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==1 && i%2==0) {
					img = ImageIO.read(getClass().getResource("resources/1.2.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==1 && i%2!=0) {
					img = ImageIO.read(getClass().getResource("resources/1.3.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==5 && i%2==0) {
					img = ImageIO.read(getClass().getResource("resources/5.2.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(i==0 && j>=2 && j<=4) {
					img = ImageIO.read(getClass().getResource("resources/cebra.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(i==3 && j==5) {
					img = ImageIO.read(getClass().getResource("resources/5morado.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(i==2 && j==1) {
					img = ImageIO.read(getClass().getResource("resources/1pinchos.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(i==6 && j==1) {
					img = ImageIO.read(getClass().getResource("resources/1pinchos.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==1 &&(i%2==1)) {
					img = ImageIO.read(getClass().getResource("resources/1bush.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				if(j==2 && i==1) {
					img = ImageIO.read(getClass().getResource("resources/muro.jpg"));
					tesela[i][j].setIcon(new ImageIcon(img));
					tesela[i][j].setDisabledIcon(new ImageIcon(img));
				}
				//tesela[i][j].addMouseListener(this);
				this.add(tesela[i][j]);
				tesela[i][j].setEnabled(false);		
				}
		}
		this.setVisible(true);	
		
		
	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if((JButton) e.getSource() == Ventana.next)
			Iteracion0.botonNext0();
		else if ((JButton) e.getSource() == Ventana.cancel0)
			Iteracion0.botonCancel0();
		else if ((JButton) e.getSource() == Ventana.cancelF)
			Iteracion0.botonCancelF();
		else if ((JButton) e.getSource() == Ventana.filoButton1)
			Iteracion0.asimov();
		else if ((JButton) e.getSource() == Ventana.filoButton2)
			Iteracion0.tilden();
		else if ((JButton) e.getSource() == Ventana.filoButton3)
			Iteracion0.kant();
		else if ((JButton) e.getSource() == Ventana.filoButton4)
			Iteracion0.humanismo();
		else if ((JButton) e.getSource() == Ventana.filoButton5)
			Iteracion0.utilitarismo();
		else if ((JButton) e.getSource() == Ventana.situacion1)
			try {
				Iteracion0.situacion1();
			} catch (InterruptedException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else if ((JButton) e.getSource() == Ventana.situacion2)
			try {
				Iteracion0.situacion2();
			} catch (InterruptedException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void colocarPersonajes(int situacion) throws InterruptedException, IOException {
		
		Image img;
		
		img = ImageIO.read(getClass().getResource("resources/muro.jpg"));
		Ventana.tesela[1][2].setDisabledIcon(new ImageIcon(img));
		
		switch(situacion) {
			case 1:
				img = ImageIO.read(getClass().getResource("resources/verde.jpg"));
				Ventana.tesela[0][5].setDisabledIcon(new ImageIcon(img));
				img = ImageIO.read(getClass().getResource("resources/1C1.jpg"));
				Ventana.tesela[0][4].setDisabledIcon(new ImageIcon(img));
				img = ImageIO.read(getClass().getResource("resources/1B1.jpg"));
				Ventana.tesela[0][3].setDisabledIcon(new ImageIcon(img));
				break;
			case 2:
				img = ImageIO.read(getClass().getResource("resources/rojo.jpg"));
				Ventana.tesela[0][5].setDisabledIcon(new ImageIcon(img));
				img = ImageIO.read(getClass().getResource("resources/2B1.jpg"));
				Ventana.tesela[0][3].setDisabledIcon(new ImageIcon(img));
				img = ImageIO.read(getClass().getResource("resources/2C1.jpg"));
				Ventana.tesela[0][4].setDisabledIcon(new ImageIcon(img));
				break;
		}
		
	}

}
