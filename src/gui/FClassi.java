package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import code.*;

public class FClassi extends JFrame implements ActionListener
{
	JPanel frame = new JPanel();
		JPanel testi = new JPanel();
		
		JLabel descrizione = new JLabel("Descrizione");
		JTextField text_desc = new JTextField(20);
		
		JLabel capienza = new JLabel("Capienza");
		JTextField text_capienza = new JTextField(20);
		
		JPanel bottoni = new JPanel();
		
		JButton insert = new JButton("Inserimento");
		JButton exit = new JButton("Exit");
		
		
	
	
	public FClassi() 
	{	
		testi.setLayout(new GridLayout(2,2));
		
		testi.add(descrizione);
		testi.add(text_desc);
		testi.add(capienza);
		testi.add(text_capienza);
		
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
