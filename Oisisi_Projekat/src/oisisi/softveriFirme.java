package oisisi;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class softveriFirme extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public softveriFirme() {
		 super();
		 setTitle("Novi Softver");
		 setSize(400,400);
		 setLocationRelativeTo(null);
		 setVisible(true);
		 
		 JPanel panCenter = new JPanel();
		 BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		 panCenter.setLayout(boxCenter);
		 
		 Dimension dim = new Dimension(150,20);
		 
		 JPanel panNaziv=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblNaziv=new JLabel("Naziv:");
		 lblNaziv.setPreferredSize(dim);
		 
		 JTextField txtNaziv= new JTextField();
		 txtNaziv.setPreferredSize(dim);
		 
		 panNaziv.add(lblNaziv);
		 panNaziv.add(txtNaziv);
		 
		 JPanel panCetkice=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblCetkice=new JLabel("Cetkice:");
		 lblCetkice.setPreferredSize(dim);
		 
		 JTextField txtCetkice= new JTextField();
		 txtCetkice.setPreferredSize(dim);
		 
		 panCetkice.add(lblCetkice);
		 panCetkice.add(txtCetkice);
		 
		 
		 
		 JPanel panFajl=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblFajl=new JLabel("Fajl format:");
		 lblFajl.setPreferredSize(dim);
		 
		 JTextField txtFajl= new JTextField();
		 txtFajl.setPreferredSize(dim);
		 
		 panFajl.add(lblFajl);
		 panFajl.add(txtFajl);
		 
		 	 
		 JPanel panAlati=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblAlati=new JLabel("Alati za animaciju:");
		 lblAlati.setPreferredSize(dim);
		 
		 JTextField txtAlati= new JTextField();
		 txtAlati.setPreferredSize(dim);
		 
		 panAlati.add(lblAlati);
		 panAlati.add(txtAlati);
		 
		 
		 JPanel panRenderi=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblRenderi=new JLabel("Renderi:");
		 lblRenderi.setPreferredSize(dim);
		 
		 JTextField txtRenderi= new JTextField();
		 txtRenderi.setPreferredSize(dim);
		 
		 panRenderi.add(lblRenderi);
		 panRenderi.add(txtRenderi);
		 
		 
		 
		 panCenter.add(panNaziv);
		 panCenter.add(panCetkice);
		 panCenter.add(panFajl);
		 panCenter.add(panAlati);
		 panCenter.add(panRenderi);
		 
		 panCenter.add(Box.createVerticalStrut(25));
		 add(panCenter, BorderLayout.CENTER);
		 
		 JPanel panBottom=new JPanel();
		 BoxLayout box=new BoxLayout(panBottom, BoxLayout.X_AXIS);
		 panBottom.setLayout(box);
		 
		 JButton btnOk=new JButton("Ok");
		 btnOk.setPreferredSize(new Dimension(75,25));
		 
		 JButton btnCancel=new JButton("Cancel");
		 btnOk.setPreferredSize(new Dimension(75,25));
		 panBottom.add(Box.createGlue());
		 panBottom.add(btnOk);
		 panBottom.add(Box.createHorizontalStrut(10));
		 panBottom.add(btnCancel);
		 panBottom.add(Box.createHorizontalStrut(10));
		 
		 add(panBottom,BorderLayout.SOUTH);
		 pack();
		 
	}

}
