package ExercSlide02;

//RedRect.java: O maior retângulo possível em vermelho. 
import java.awt.*;
import java.awt.event.*;

public class RedRect extends Frame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new RedRect();
	}
	
	RedRect() {
		super("RedRect");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(816, 639);
		add("Center", new CvRedRect());
		show();
	}
	
}

class CvRedRect extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Dimension d = getSize();
		 int maxX = d.width - 1, maxY = d.height - 1;
		 g.drawString("d.largura = " + d.width, 10, 30);
		 g.drawString("d.altura = " + d.height, 10, 60);
		 g.setColor(Color.red);
		 g.drawRect(0, 0, maxX, maxY);
		 /**
		  * A chamada a drawRect quase no final desse programa tem o 
		  * mesmo efeito que as quatro linhas a seguir:
		  * g.drawLine(0, 0, maxX, 0);                  // Lado superior
			g.drawLine(maxX, 0, maxX, maxY);   // Lado direito
			g.drawLine(maxX, maxY, 0, maxY);   // Lado inferior
			g.drawLine(0, maxY, 0, 0);                  // Lado esquerdo
			O programa contém duas classes: 
			RedRect: Esta é a classe para o quadro que implementa a janela e também é usada para concluir a aplicação.
			CvRedRect: Esta é a classe para a área de desenho, na qual exibimos a saída gráfica.

		  */
	}
}

