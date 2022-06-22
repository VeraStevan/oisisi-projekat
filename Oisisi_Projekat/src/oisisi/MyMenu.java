package oisisi;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenu extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7863806568418316202L;

	public MyMenu() {

		JMenu file = new JMenu("File");
		JMenu miOpen = new JMenu("Open");
		JMenuItem miZaposleni = new JMenuItem("Zaposleni");
		JMenuItem miSoftveri = new JMenuItem("Softveri");
		miOpen.add(miZaposleni);
		miOpen.addSeparator();
		miOpen.add(miSoftveri);

		JMenu miNew = new JMenu("New");
		JMenuItem miZaposleni2 = new JMenuItem("Zaposleni");
		JMenuItem miSoftveri2 = new JMenuItem("Softveri");
		miNew.add(miZaposleni2);
		miNew.addSeparator();
		miNew.add(miSoftveri2);
		miZaposleni2.addActionListener(new Zaposleni());
		miSoftveri2.addActionListener(new Softver());
		
		JMenuItem miClose = new JMenuItem("Exit");
		miClose.addActionListener(new Exit());
		
		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miClose);

		JMenu edit = new JMenu("Edit");
		JMenu miEdit = new JMenu("Edit");
		JMenu miDelete = new JMenu("Delete");

		edit.add(miEdit);
		edit.addSeparator();
		edit.add(miDelete);

		JMenu help = new JMenu("Help");
		JMenu miAbout = new JMenu("About");

		help.add(miAbout);

		add(file);
		add(edit);
		add(help);

	}

}