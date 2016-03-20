package gameTeste;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Nave {

	//cordenadas onde andara o player
	private int x, y;
	
	//"força" adicional para onde a nave se mover
	private int dx, dy;
	
	//variavel nome de image do tipo image( do javax.swing.ImageIcon
	private Image imagem;
	
	
	
	//contrutor para denifir onde a nave ficará e outras coisas
	public Nave(){
		ImageIcon referencia = new ImageIcon("res\\nave2.gif");
		imagem = referencia.getImage();
		
		//definindo as coordenadas da nave
		this.x = 100;
		this.y = 100;
		
	}
	
	//movimentação da nave
	public void movimento(){
		
		//dx ira adicionar uma direção de coordenada para x, assim ela se moverá
		x += dx;
		y += dy;
		
	}
	
	
	public int getX() {
		return x;
	}
	

	public int getY() {
		return y;
	}
	

	public Image getImagem() {
		return imagem;
	}
	
	//metodo para captar as teclas do teclado
	//metodo para acionar o comando quando a tecla for apertada - obrigatoriamente deve ser adicionado o keyReleased depois
	public void keyPressed(KeyEvent tecla){
		
		//aplicar o codigo tabela ASCII para adicionar a tecla
		int codigo = tecla.getKeyCode();
		
		//faz com que suba"up"---------------I'M NOT UNDERSTAND YET??????????????????????????????????????????????????????????????????????
		if ( codigo == KeyEvent.VK_UP){
			
			//dy irá somar com o y, como o ecran e contado de x positivo para a direita 
			//e y negativo para baixo, para subir a nave o calculo deve ser negativo
			dy = -1;
		}
		if (codigo == KeyEvent.VK_DOWN){
			
			dy = 1;
		}
		
		
		if ( codigo == KeyEvent.VK_LEFT){
			
			dx = -1;
		}
		if (codigo == KeyEvent.VK_RIGHT){
			
			dx = 1;
		}
		
		
	}//fecha keyPressed
	
	
	/*  sem o metodo keyRealeased; quando apertado a tecla em keyPressed, 
	 *  o objeto irá eternamente para o lado apertado
	 *  e não ira parar quando soltar o botão*/
	public void keyReleased (KeyEvent tecla){
		
		int codigo = tecla.getKeyCode();
		
		if (codigo == KeyEvent.VK_KP_UP){
			
			//dy deve ser 0 para não ficar somando 
			//e parar no lugar onde está
			dy = 0;
			
		}
		if (codigo == KeyEvent.VK_DOWN){
			
			dy = 0;
		}
		
		
		if ( codigo == KeyEvent.VK_LEFT){
			
			dx = 0;
		}
		if (codigo == KeyEvent.VK_RIGHT){
			
			dx = 0;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}///final
