package clinicaMedica.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ManusearBotoesPrincipais implements ActionListener {

	private JButton atendimento;
	
	public ManusearBotoesPrincipais(JButton atendimento) {
		this.atendimento = atendimento;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == atendimento){
			GUI_Atendimento cadastro = new GUI_Atendimento();
			cadastro.atendimento();
		}
	}
}
