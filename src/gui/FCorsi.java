package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import code.*;

public class FCorsi extends JFrame implements ActionListener
{
	JPanel frame = new JPanel();
		JPanel testi = new JPanel();
		
		JLabel descrizione = new JLabel("Descrizione");
		JTextField text_descrizione = new JTextField(20);
		
		JLabel insegnante = new JLabel("Insegnante");
		JComboBox text_insegnante = new JComboBox();
		
		JLabel classe = new JLabel("Classe");
		JComboBox text_classe = new JComboBox();
		
		JLabel blocco = new JLabel("Blocco");
		JComboBox text_blocco = new JComboBox();
		
		JPanel bottoni = new JPanel();
		
		JButton insert = new JButton("Inserimento");
		JButton exit = new JButton("Exit");
		
		
	
	
	public FCorsi() 
	{	
		testi.setLayout(new GridLayout(4,2));
		
		testi.add(descrizione);
		testi.add(text_descrizione);
		testi.add(insegnante);
		testi.add(text_insegnante);
		testi.add(classe);
		testi.add(text_classe);
		testi.add(blocco);
		testi.add(text_blocco);
		
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
