package clinicaMedica.view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import clinicaMedica.controller.Controller;
import clinicaMedica.model.Atendimento;

public class ManusearBotoesSecundarios implements ActionListener {

	private JButton cadastrar;
	private JButton cancelar;
	private JButton limpar;
	private JButton visualizar;
	private Atendimento atendimento;
	private JFrame janela;
	private JPanel painel;

	public ManusearBotoesSecundarios(JButton cadastrar, JButton cancelar, JButton limpar, JButton visualizar, Atendimento atendimento, JFrame janela, JPanel painel){
		this.cadastrar = cadastrar;
		this.cancelar = cancelar;
		this.limpar = limpar;
		this.visualizar = visualizar;
		this.atendimento = atendimento;
		this.janela = janela;
		this.painel = painel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cadastrar){
			Controller controller = new Controller();
			controller.escreverArquivo(atendimento);
			JOptionPane.showMessageDialog(null, "Cadastro efetuao com sucesso!");
		}
		if(e.getSource() == cancelar){
			janela.dispose();
		}
		if(e.getSource() == limpar){
			Component[] componentes = painel.getComponents();
			for(int i = 0; i < componentes.length; i++){
				if(componentes[i] instanceof JTextField){
					JTextField text = (JTextField) componentes[i];
					text.setText(null);
				}
			}
		}
		if(e.getSource() == visualizar){
		}
	}
}
