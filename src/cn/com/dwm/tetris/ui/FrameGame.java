package cn.com.dwm.tetris.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameGame extends JFrame{
	
	public FrameGame () {
		//设置标题
		this.setTitle("Java俄罗斯方块");
		//设计默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置窗口大小
		this.setSize(1200, 700);
		//设置用户不能改变窗口大小
		this.setResizable(false);
		//居中显示
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int h = (screen.height-this.getHeight())/2-15;
		int y = (screen.width-this.getWidth())/2;
		this.setLocation(y, h);
		//设置默认panel
		this.setContentPane(new PanelGame());
	}
}
