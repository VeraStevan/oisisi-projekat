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

public class txtPolja extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public txtPolja() {
		 super();
		 setTitle("Novi Zaposleni");
		 setSize(400,400);
		 setLocationRelativeTo(null);
		 setVisible(true);
		 
		 JPanel panCenter = new JPanel();
		 BoxLayout boxCenter = new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		 panCenter.setLayout(boxCenter);
		 
		 Dimension dim = new Dimension(150,20);
		 
		 JPanel panIme=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblIme=new JLabel("Ime:");
		 lblIme.setPreferredSize(dim);
		 
		 JTextField txtIme= new JTextField();
		 txtIme.setPreferredSize(dim);
		 
		 panIme.add(lblIme);
		 panIme.add(txtIme);
		 
		 JPanel panPrezime=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblPrezime=new JLabel("Prezime:");
		 lblPrezime.setPreferredSize(dim);
		 
		 JTextField txtPrezime= new JTextField();
		 txtPrezime.setPreferredSize(dim);
		 
		 panPrezime.add(lblPrezime);
		 panPrezime.add(txtPrezime);
		 
		
		 JPanel panJmbg=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblJmbg=new JLabel("Jmbg:");
		 lblJmbg.setPreferredSize(dim);
		 
		 JTextField txtJmbg= new JTextField();
		 txtJmbg.setPreferredSize(dim);
		 
		 panJmbg.add(lblJmbg);
		 panJmbg.add(txtJmbg);
		 
		 	 
		 JPanel panDatumRodjenja=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblDatumRodjenja=new JLabel("Datum Rodjenja:");
		 lblDatumRodjenja.setPreferredSize(dim);
		 
		 JTextField txtDatumRodjenja= new JTextField();
		 txtDatumRodjenja.setPreferredSize(dim);
		 
		 panDatumRodjenja.add(lblDatumRodjenja);
		 panDatumRodjenja.add(txtDatumRodjenja);
		 
		 
		 JPanel panEmail=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblEmail=new JLabel("Email:");
		 lblEmail.setPreferredSize(dim);
		 
		 JTextField txtEmail= new JTextField();
		 txtEmail.setPreferredSize(dim);
		 
		 panEmail.add(lblEmail);
		 panEmail.add(txtEmail);
		 
		 
		 JPanel panAdresa=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblAdresa=new JLabel("Adresa stanovanja:");
		 lblAdresa.setPreferredSize(dim);
		 
		 JTextField txtAdresa= new JTextField();
		 txtAdresa.setPreferredSize(dim);
		 
		 panAdresa.add(lblAdresa);
		 panAdresa.add(txtAdresa);
		 
		 
		 JPanel panSoftveri=new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblSoftveri=new JLabel("Softveri:");
		 lblSoftveri.setPreferredSize(dim);
		 
		 JTextField txtSoftveri= new JTextField();
		 txtSoftveri.setPreferredSize(dim);
		 
		 panSoftveri.add(lblSoftveri);
		 panSoftveri.add(txtSoftveri);
		 
		 panCenter.add(panIme);
		 panCenter.add(panPrezime);
		 panCenter.add(panJmbg);
		 panCenter.add(panDatumRodjenja);
		 panCenter.add(panEmail);
		 panCenter.add(panAdresa);
		 panCenter.add(panSoftveri);
		 
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
