package test_git;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	public MyFrame() {
		Container contentPane = getContentPane();
		setTitle("My Window Application");
		setSize(300,200);
		addWindowListener(new MyWindowAdapter());
		contentPane.setLayout(new FlowLayout());

		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1)
			System.out.println("Button1がクリック");
		else if(ae.getSource() == b2)
			System.out.println("Button2がクリック");
		else
			System.out.println("Button3がクリック");
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
