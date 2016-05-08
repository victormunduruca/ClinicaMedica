package clinicaMedica.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GUI_Principal {

	private JButton botaoAtendimento;
	private JButton botaoAtualizar;
	private JButton botaoPesquisar;
	private JButton botaoExcluir;
	private JButton botaoSair;
	private JMenuBar menu;
	private JMenu cadastro;
	private JMenuItem atendimento, sair;

	public GUI_Principal(){

	}

	public void interfaceGrafica(){
		botaoAtendimento = new JButton("Atendimento");
		botaoAtualizar = new JButton("Paciente");
		botaoPesquisar = new JButton("Pesquisar");
		botaoExcluir = new JButton("Excluir");
		botaoSair = new JButton("Sair");
		
		/*Dimensiono os botões e posição*/
		botaoAtendimento.setBounds(10, 110, 120, 30);
		botaoAtualizar.setBounds(10, 150, 120, 30);
		botaoPesquisar.setBounds(10, 190, 120, 30);
		botaoExcluir.setBounds(10, 230, 120, 30);
		botaoSair.setBounds(10, 270, 120, 30);

		atendimento = new JMenuItem("Atendimento");
		sair = new JMenuItem("Sair");
		cadastro = new JMenu("Cadastrar");
		cadastro.add(atendimento);
		cadastro.add(sair);
		menu = new JMenuBar();
		menu.add(cadastro);
		
		ImageIcon icon = new ImageIcon("imagem/clinica.png");
		JLabel label = new JLabel();
		label.setIcon(icon);
		label.setLocation(250, 75);
		label.setSize(icon.getIconWidth(), icon.getIconHeight());

		//Crio um painel e faço as configurações
		JPanel painel = new JPanel();
		painel.add(label);
		painel.setLayout(null);
		painel.setBackground(Color.white);
		painel.add(botaoAtendimento);
		painel.add(botaoAtualizar);
		painel.add(botaoExcluir);
		painel.add(botaoPesquisar);
		painel.add(botaoSair);

		//Crio a janela e faço as configurações
		JFrame janela = new JFrame();
		janela.setSize(640, 480);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setJMenuBar(menu);
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);//Torno visivel a tela
		
		ManusearBotoesPrincipais manusearBotao = new ManusearBotoesPrincipais(botaoAtendimento);
		botaoAtendimento.addActionListener(manusearBotao);
		
		ManusearMenu manusearMenu = new ManusearMenu(sair, atendimento, janela);
		atendimento.addActionListener(manusearMenu);
		sair.addActionListener(manusearMenu);
		
	}
}
