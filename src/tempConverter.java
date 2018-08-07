import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class tempConverter implements ActionListener {
	JFrame boi = new JFrame();
	JPanel u = new JPanel();
	JButton better = new JButton();
	JTextField stop = new JTextField(5);
	JLabel dank = new JLabel();
	JLabel memes = new JLabel();
	JLabel tentacion = new JLabel();
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		// TODO Auto-generated method stub
		String x = stop.getText();
		int y = Integer.parseInt(x);
		if (buttonPressed == better) {
			double lol = ((5.0/9.0) * y)-32;
			memes.setText( lol + " degrees Celsius");
			boi.pack();
		}
			
	}
	
	public static void main(String[] args) {
	tempConverter ayy = new tempConverter();
	}
	
	tempConverter() {
		
		boi.setVisible(true);
		boi.add(u);
		u.add(better);
		u.add(stop);
		u.add(dank);
		u.add(memes);
		u.add(tentacion);
		better.addActionListener(this);
		
		
		dank.setText("degrees Farhenhiet");
		boi.pack();
		better.setText("Convert");
		boi.pack();
	}

	
			
	}


