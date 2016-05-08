package clinicaMedica.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import clinicaMedica.model.Atendimento;
import clinicaMedica.model.Endereco;
import clinicaMedica.model.Paciente;

public class GUI_Atendimento {

	private JPanel painel;
	
	public GUI_Atendimento(){
		painel = new JPanel();
		painel.setLayout(null);
		painel.setBackground(Color.WHITE);
	}
	
	public void atendimento(){
		JLabel titulo = new JLabel("Cadastro de Atendimento");
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
		
		JLabel l1 = new JLabel("Nome do Médico");
		l1.setBounds(300, 60, 100, 20);
		JLabel l2 = new JLabel("Especialidade");
		l2.setBounds(300, 90, 80, 20);
		JLabel l3 = new JLabel("Data atual");
		l3.setBounds(300, 120, 80, 20);
		JLabel l4 = new JLabel("Valor");
		l4.setBounds(300, 150, 50, 20);

		JTextField nome = new JTextField();
		nome.setBounds(400, 60, 150, 25);
		JTextField area = new JTextField();
		area.setBounds(400, 90, 150, 25);
		JTextField data = new JTextField();
		data.setBounds(400, 120, 150, 25);
		JTextField valor = new JTextField();
		valor.setBounds(400, 150, 150, 25);
		
		painel.add(l1);
		painel.add(l2);
		painel.add(l3);
		painel.add(l4);
		painel.add(nome);
		painel.add(area);
		painel.add(data);
		painel.add(valor);	
		
		Paciente paciente = paciente();
		Endereco end = endereco();
		Atendimento atendimento = new Atendimento();
		atendimento.setPaciente(paciente);
		atendimento.setNomeMedico(nome.getText());
				
		JFrame novaJanela = new JFrame("Cadastro");
		novaJanela.setSize(640, 550);
		novaJanela.setLocationRelativeTo(null);
		novaJanela.setResizable(false);
		novaJanela.add(painel);
		novaJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		novaJanela.setVisible(true);
		
		ManusearBotoesSecundarios manusearBotao = new ManusearBotoesSecundarios(cadastrar, cancelar, limpar, visualizar, atendimento, novaJanela, painel);
		cadastrar.addActionListener(manusearBotao);
		limpar.addActionListener(manusearBotao);
		cancelar.addActionListener(manusearBotao);
		visualizar.addActionListener(manusearBotao);
	}
		
	public Paciente paciente(){
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
		
		JTextField nome = new JTextField();
		nome.setBounds(130, 60, 150, 25);
		JTextField dataNascimento = new JTextField();
		dataNascimento.setBounds(130, 90, 150, 25);
		JTextField cpf = new JTextField();
		cpf.setBounds(130, 120, 150, 25);
		JTextField rg = new JTextField();
		rg.setBounds(130, 150, 150, 25);
		JTextField telefone = new JTextField();
		telefone.setBounds(130, 180, 150, 25);
		JTextField profissao = new JTextField();
		profissao.setBounds(130, 210, 150, 25);
		JTextField cep = new JTextField();
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
		return paciente;
	}
	
	public Endereco endereco(){
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
		JTextField estado = new JTextField();
		estado.setBounds(130, 300, 150, 25);
		JTextField cidade = new JTextField();
		cidade.setBounds(130, 330, 150, 25);
		JTextField bairro = new JTextField();
		bairro.setBounds(130, 360, 150, 25);
		JTextField rua = new JTextField();
		rua.setBounds(130, 390, 150, 25);
		JTextField numeroCasa = new JTextField();
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
		
		Endereco end = new Endereco();
		end.setPais(pais.getText());
		end.setEstado(estado.getText());
		end.setCidade(cidade.getText());
		end.setBairro(bairro.getText());
		end.setRua(rua.getText());
		//int num = Integer.parseInt(numeroCasa.getText());
		//end.setNumeroCasa(num);
		
		return end;
	}
}
