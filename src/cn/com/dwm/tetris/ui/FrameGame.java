package cn.com.dwm.tetris.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameGame extends JFrame{
	
	public FrameGame () {
		//���ñ���
		this.setTitle("Java����˹����");
		//���Ĭ�Ϲر����ԣ����������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڴ�С
		this.setSize(1200, 700);
		//�����û����ܸı䴰�ڴ�С
		this.setResizable(false);
		//������ʾ
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int h = (screen.height-this.getHeight())/2-15;
		int y = (screen.width-this.getWidth())/2;
		this.setLocation(y, h);
		//����Ĭ��panel
		this.setContentPane(new PanelGame());
	}
}
