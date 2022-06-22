package oisisi;

import java.awt.*;
import javax.swing.*;

public class MainTableFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainTableFrame() {
		new oisisi.PocetnaTableToolbar();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		this.setSize(screenSize.width / 4 * 3, screenSize.height / 4 * 3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setVisible(true);

		JTabbedPane tabbedPane1 = new JTabbedPane();
		add(tabbedPane1);
		
		
		//DefaultTableModel model1 = new DefaultTableModel();
		Object[] columns1 = new Object[]{"Ime", "Prezime", "Jmbg", "Datum rodjenja", "Email", "Adresa stanovanja", "Softver"};
		Object[][] rows1 = {};
		JTable table1 = new JTable(rows1, columns1);
		
		//DefaultTableModel model1 = new DefaultTableModel();
				Object[] columns2 = new Object[]{"Naziv", "Cetkice", "Fajl format", "Alati za animaciju", "Render"};
				Object[][] rows2 = {};
				JTable table2 = new JTable(rows2, columns2);
		

		tabbedPane1.add("Zaposleni", table1.getTableHeader());
		tabbedPane1.add("Softveri", table2.getTableHeader());
		
		
		MyMenu menu = new MyMenu();
		this.setJMenuBar(menu);

		PocetnaTableToolbar toolbar = new oisisi.PocetnaTableToolbar();
		add(toolbar, BorderLayout.NORTH);

	}
}
