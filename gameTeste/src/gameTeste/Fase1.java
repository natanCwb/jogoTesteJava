package gameTeste;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.font.GraphicAttribute;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase1 extends JPanel implements ActionListener {
	
	private Image backgroud;
	private Nave nave;
	private Timer timer;
	
	
	///construtor
	
	public Fase1(){
		
			
			addKeyListener(new TecladoAdapter());
			ImageIcon referencia = new ImageIcon("res\\background.jpg");
			
			backgroud = referencia.getImage();
			
			nave = new Nave();
			timer = new Timer(5, this);
			timer.start();
			
	}//Fase1
	
	//metodo para poder pintar na tela o background
	public void paint(Graphics g){
						
		Graphics2D graficos = (Graphics2D) g;
				
		//drawImage(imagemQuePretendeEnviar, coordenada x, coordenada y, observer = significa se vc quer quea imagem faça algo)	
		// no nosso caso as coordenadas ficam 0 porque queremos que a imagem fique em telacheia, e o ultimo parametro o observe null porque:
		//queremos que a imagem fique parada e estatica
		graficos.drawImage(backgroud, 0, 0, null); 
		
		//para pintar a nave a de cima foi o background 
		//o observe tem que ser esse metodo, pelo fato de que toda a vez essa imagem (Nave) estará em movimento
		//e o a pintura anterior será esquecida
		graficos.drawImage(nave.getImagem(),nave.getX(), nave.getY(), this); 		
		
		//metodo dispose irá limpar para a proxma pintura
		g.dispose();
														
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		nave.movimento();
		
		//toda vez que o metodo for chamado ira repintar a tela 
		//utilizado para animação da nave ou de outros objetos
		repaint();
		
	}//actinoPerformed
	
	private class TecladoAdapter extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			
			nave.keyPressed(e);
		}//keyPressed

		@Override
		public void keyReleased(KeyEvent e) {
			
			nave.keyReleased(e);
		}//keyreleased

	
			
	}//keyAdapter
		
		
		
	
	
	
	
	
	
	
	

}//fim de tudo
