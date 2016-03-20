package gameTeste;

//classe responsavel por imagens
import javax.swing.JFrame;



public class conteinersDeJanelas extends JFrame {
	
	//criação do construtor
	public conteinersDeJanelas() {
		
		add(new Fase1());
		
		//Titulo da janela principal
		setTitle("JogoEmJavaTeste");
		
		//Botão 'X' do canto superio da tela irá fechar a aplicação
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500,400);
		
		//local onde abrirá a tela ... sendo null é para ficar bem ao centro
		setLocationRelativeTo(null);
		
		
		//não permite que seja remanejada o tamanho
		setResizable(false);
		
		//visivel
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		//nova Janela
		new conteinersDeJanelas();
		
	}

}
