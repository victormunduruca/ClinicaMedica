package clinicaMedica.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import clinicaMedica.controller.Controller;
import clinicaMedica.model.Endereco;
import clinicaMedica.model.Paciente;

public class GUI_Atendimento {
	
	private Controller controller;
	private JPanel painel;
	private JTextField nome;
	private JTextField dataNascimento;
	private JTextField cpf;
	private JTextField rg;
	private JTextField telefone;
	private JTextField profissao;
	private JTextField cep;
	private JTextField pais;
	private JTextField estado;
	private JTextField cidade;		
	private JTextField bairro;
	private JTextField rua;
	private JTextField numeroCasa;

	public GUI_Atendimento(){
		nome = new JTextField();
		dataNascimento = new JTextField();
		cpf = new JTextField();
		rg = new JTextField();
		painel = new JPanel();
		telefone = new JTextField();
		profissao = new JTextField();
		cep = new JTextField();
		pais = new JTextField();
		cidade = new JTextField();
		estado = new JTextField();
		bairro = new JTextField();
		rua = new JTextField();
		numeroCasa = new JTextField();
		
		controller = new Controller();
		painel = new JPanel();
		painel.setLayout(null);
		painel.setBackground(Color.WHITE);
	}

	public void paciente(){
		JLabel titulo = new JLabel("Cadastro de Paciente ");
		titulo.setBounds(230, 10, 200, 30);
		Font font = new Font("Arial", Font.BOLD, 16);
		titulo.setFont(font);

		JButton cadastrar = new JButton("Cadastrar");
		JButton limpar = new JButton("Limpar");
		JButton cancelar = new JButton("Cancelar");
		JButton visualizar = new JButton("Visualizar");

		/*Dimensiono os botões e posição*/
		cadastrar.setBounds(120, 470, 100, 30);
		limpar.setBounds(230, 470, 100, 30);
		cancelar.setBounds(340, 470, 100, 30);
		visualizar.setBounds(450, 470, 100, 30);

		painel.add(titulo);
		painel.add(cadastrar);
		painel.add(cancelar);
		painel.add(limpar);
		painel.add(visualizar);


		preparaPaciente();
		preparaEndereco();


		JFrame novaJanela = new JFrame("Cadastro");
		novaJanela.setSize(640, 550);
		novaJanela.setLocationRelativeTo(null);
		novaJanela.setResizable(false);
		novaJanela.add(painel);
		novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		novaJanela.setVisible(true);


		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Paciente paciente = new Paciente();
					
					paciente.setNome(nome.getText());
					System.out.println("Nome: " +nome.getText());
					paciente.setCep(cep.getText());
					paciente.setCpf(cpf.getText());
					paciente.setDataNascimento(dataNascimento.getText());
					paciente.setProfissao(profissao.getText());
					paciente.setRg(rg.getText());
					paciente.setTelefone(telefone.getText());
					
					Endereco end = new Endereco();
					
					end.setPais(pais.getText());
					end.setEstado(estado.getText());
					end.setCidade(cidade.getText());
					end.setBairro(bairro.getText());
					end.setRua(rua.getText());
					
					paciente.setEndereco(end);
					
					controller.cadastrar(paciente);
					controller.escreverArquivo();
					JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Desculpe, um erro aconteceu");
					e1.printStackTrace();
				}
			}
		}	);
		
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component[] componentes = painel.getComponents();
				for(int i = 0; i < componentes.length; i++){
					if(componentes[i] instanceof JTextField){
						JTextField text = (JTextField) componentes[i];
						text.setText(null);
					}
				}
			}
		}	);
		
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				novaJanela.dispose();
			}
		}	);
		
		visualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String cpfBusca = JOptionPane.showInputDialog("Digite o nome do usuario que deseja visualizar");
					Paciente pacienteEncontrado = controller.visualizar(cpfBusca);
					JOptionPane.showMessageDialog(null, pacienteEncontrado.toString() + pacienteEncontrado.getEndereco().toString());
			}
		}	); 
		

	}
	
	public void preparaPaciente(){
		
		JLabel l1 = new JLabel("Nome do Paciente");
		l1.setBounds(10, 60, 120, 20);
		JLabel l2 = new JLabel("Data de Nascimento");
		l2.setBounds(10, 90, 120, 20);
		JLabel l3 = new JLabel("CPF");
		l3.setBounds(10, 120, 120, 20);
		JLabel l4 = new JLabel("RG");
		l4.setBounds(10, 150, 120, 20);
		JLabel l5 = new JLabel("Telefone");
		l5.setBounds(10, 180, 120, 20);
		JLabel l6 = new JLabel("Profissão");
		l6.setBounds(10, 210, 120, 20);
		JLabel l7 = new JLabel("CEP");
		l7.setBounds(10, 240, 120, 20);

		nome.setBounds(130, 60, 150, 25);
		dataNascimento.setBounds(130, 90, 150, 25);
		cpf.setBounds(130, 120, 150, 25);
		rg.setBounds(130, 150, 150, 25);
		telefone.setBounds(130, 180, 150, 25);
		profissao.setBounds(130, 210, 150, 25);
		cep.setBounds(130, 240, 150, 25);

		painel.add(l1);
		painel.add(l2);
		painel.add(l3);
		painel.add(l4);
		painel.add(l5);
		painel.add(l6);
		painel.add(l7);
		painel.add(nome);
		painel.add(dataNascimento);
		painel.add(cpf);
		painel.add(rg);
		painel.add(telefone);
		painel.add(profissao);
		painel.add(cep);

		Paciente paciente = new Paciente();
		paciente.setNome(nome.getText());
		
	}
	






	public void preparaEndereco(){
		JLabel l8 = new JLabel("País");
		l8.setBounds(10, 270, 120, 20);
		JLabel l9 = new JLabel("Estado");
		l9.setBounds(10, 300, 120, 20);
		JLabel l10 = new JLabel("Cidade");
		l10.setBounds(10, 330, 120, 20);
		JLabel l11 = new JLabel("Bairro");
		l11.setBounds(10, 360, 120, 20);
		JLabel l12 = new JLabel("Rua");
		l12.setBounds(10, 390, 120, 20);
		JLabel l13 = new JLabel("Nº");
		l13.setBounds(10, 420, 120, 20);
		JLabel l14 = new JLabel("Nº");
		l14.setBounds(10, 420, 120, 20);

		JTextField pais = new JTextField();
		pais.setBounds(130, 270, 150, 25);
		estado.setBounds(130, 300, 150, 25);
		cidade.setBounds(130, 330, 150, 25);
		bairro.setBounds(130, 360, 150, 25);
		rua.setBounds(130, 390, 150, 25);
		numeroCasa.setBounds(130, 420, 150, 25);

		painel.add(l8);
		painel.add(l9);
		painel.add(l10);
		painel.add(l11);
		painel.add(l12);
		painel.add(l13);
		painel.add(pais);
		painel.add(estado);
		painel.add(cidade);
		painel.add(bairro);
		painel.add(rua);
		painel.add(numeroCasa);

		

		
	}
}
