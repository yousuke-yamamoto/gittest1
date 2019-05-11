package test_git;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4;
	public MyFrame() {
		Container contentPane = getContentPane();
		setTitle("My Window Application");
		setSize(300,200);
		addWindowListener(new MyWindowAdapter());
		contentPane.setLayout(new GridLayout(2,2));

		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1)
			b1.setText("Button");
		else if(ae.getSource() == b2)
			System.out.println("Button2がクリック");
		else if(ae.getSource() == b3)
			System.out.println("Button3がクリック");
		else
			System.out.println("Button4がクリック");
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
