import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kooda implements KeyListener {
	JFrame boi = new JFrame();
	JLabel dank = new JLabel();
	public static void main(String[] args) {
		Kooda billy = new Kooda();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		char characterPressed = arg0.getKeyChar();
		dank.setText(dank.getText() + characterPressed);
		boi.pack();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		}
		
	Kooda() {
		boi.setVisible(true);
		boi.add(dank);
		boi.addKeyListener(this);
		}
	}


