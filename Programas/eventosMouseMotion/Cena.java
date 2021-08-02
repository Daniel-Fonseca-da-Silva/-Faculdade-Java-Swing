package eventosMouseMotion;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class Cena extends JPanel implements MouseListener, MouseMotionListener{
	private Point p;
	
	public Cena()
	{
		addMouseListener(this);
		addMouseMotionListener(this);

	}

	public void mouseDragged(MouseEvent e) {
		p = e.getPoint();
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
		
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		p = e.getPoint(); // Captura posicoes
		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		p = null;
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
	// Função para desenhar
		public void paint(Graphics g)
		{
			if(p != null) 
			{
				Dimension d = getSize();
				int xc = d.width /2;
				int yc = d.height /2;
				g.drawLine(xc, yc, p.x, p.y);
			}
		}
	
	
}
