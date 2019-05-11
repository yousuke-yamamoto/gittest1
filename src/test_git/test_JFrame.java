package test_git;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200);
		addWindowListener(new MyWindowAdapter());
	}
}

class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
public class test_JFrame {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setVisible(true);
	}

}
