package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import code.*;

public class FMenu extends JFrame implements ActionListener
{
	JPanel frame = new JPanel();
	
		JPanel fclassi = new JPanel();
		JButton bclassi = new JButton("Classe");
		
		
		JPanel finsegnanti = new JPanel();
		JButton binsegnanti = new JButton("Insegnanti");
		
		
		JPanel fcorsi = new JPanel();
		JButton bcorsi = new JButton("Corsi");
		
		
		JPanel fexit = new JPanel();
		JButton bexit = new JButton("Exit");

	
	
	public FMenu() 
	{	
		frame.setLayout(new GridLayout(4,1));
		
		bclassi.addActionListener(this);
		
		fclassi.add(bclassi);
		
		binsegnanti.addActionListener(this);
		
		finsegnanti.add(binsegnanti);
		
		bcorsi.addActionListener(this);
		
		fcorsi.add(bcorsi);
		
		bexit.addActionListener(this);
		
		fexit.add(bexit);
		
		frame.add(fclassi);
		frame.add(finsegnanti);
		frame.add(fcorsi);
		frame.add(fexit);
			
			
		
		
		
		this.getContentPane().add(frame);
		this.setSize(300,300);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==bclassi) 
		{
			FClassi a = new FClassi();
		}
		
		if(e.getSource()==binsegnanti) 
		{
			FInsegnanti a = new FInsegnanti();
		}
		
		if(e.getSource()==bcorsi) 
		{
			FCorsi a = new FCorsi();
		}
		
		if(e.getSource()==bexit) 
		{
			this.dispose();
		}
		
		
	}

}
