package oisisi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Softver implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		softveriFirme frameInterface = new softveriFirme();
		frameInterface.setVisible(true);
		
	}

}
