package example4;

import javax.swing.*;

public class Simple extends JFrame {/**
	 * 
	 */
	private static final long serialVersionUID = -4595036056542733067L;
// inheriting JFrame
	JFrame f;

	Simple() {
		JButton b = new JButton("click");// create button
		b.setBounds(130, 100, 100, 40);

		add(b);// adding button on frame
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Simple();
	}
}