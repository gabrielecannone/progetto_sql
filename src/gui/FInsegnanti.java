package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import code.*;

public class FInsegnanti extends JFrame implements ActionListener
{
	JPanel frame = new JPanel();
		JPanel testi = new JPanel();
		
		JLabel nome = new JLabel("Nome");
		JTextField text_nome = new JTextField(20);
		
		JLabel cognome = new JLabel("Cognome");
		JTextField text_cognome = new JTextField(20);
		
		JLabel ore = new JLabel("Ore");
		JTextField text_ore = new JTextField(20);
		
		JLabel materia = new JLabel("Materia");
		JTextField text_materia = new JTextField(20);
		
		JPanel bottoni = new JPanel();
		
		JButton insert = new JButton("Inserimento");
		JButton exit = new JButton("Exit");
		
		
	
	
	public FInsegnanti() 
	{	
		testi.setLayout(new GridLayout(4,2));
		
		testi.add(nome);
		testi.add(text_nome);
		testi.add(cognome);
		testi.add(text_cognome);
		testi.add(ore);
		testi.add(text_ore);
		testi.add(materia);
		testi.add(text_materia);
		
		bottoni.setLayout(new GridLayout(1,2));
		
		insert.addActionListener(this);
		exit.addActionListener(this);
		
		bottoni.add(insert);
		bottoni.add(exit);
		
		frame.setLayout(new GridLayout(2,1));
		
		frame.add(testi);
		frame.add(bottoni);
		
			
			
		
		
		
		this.getContentPane().add(frame);
		this.setSize(600,600);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==insert) 
		{
			
		}
		
		if(e.getSource()==exit) 
		{
			this.dispose();
		}
		
		
		
		
	}

}
