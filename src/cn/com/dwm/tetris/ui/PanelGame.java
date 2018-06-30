package cn.com.dwm.tetris.ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelGame extends JPanel{
	
	public PanelGame () {
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		Image img = new ImageIcon("Graphics/background/a.jpg").getImage();
		g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
	}
}
