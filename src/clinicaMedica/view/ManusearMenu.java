package clinicaMedica.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;



public class ManusearMenu implements ActionListener {
	
	private JMenuItem atendimento;
	private JMenuItem sair;
	private JFrame janela;

	public ManusearMenu(JMenuItem sair, JMenuItem atendimento, JFrame janela){
		this.atendimento = atendimento;
		this.sair = sair;
		this.janela = janela;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == atendimento){
	
		}
		if(e.getSource() == sair){
			janela.dispose();
		}
	}
}
