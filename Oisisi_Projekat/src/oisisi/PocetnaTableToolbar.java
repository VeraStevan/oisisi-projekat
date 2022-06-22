package oisisi;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class PocetnaTableToolbar extends JToolBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1209699209668701828L;

	public PocetnaTableToolbar() {

		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setIcon(new ImageIcon("images/new_22x22.jpg"));
		btnNew.addActionListener(new Zaposleni());
		btnNew.addActionListener(new Softver());
		add(btnNew);
		
		addSeparator();

		JButton btnEdit = new JButton();
		btnEdit.setToolTipText("Edit");
		btnEdit.setIcon(new ImageIcon("images/open_22x22.jpg"));
		add(btnEdit);

		addSeparator();

		JButton btnDelete = new JButton();
		btnDelete.setToolTipText("Delete");
		btnDelete.setIcon(new ImageIcon("images/trashcan.jpg"));
		add(btnDelete);

		setFloatable(false);
		setBackground(new Color(255, 255, 255));

	}

}
