package clinicaMedica.view;

import clinicaMedica.model.Atendimento;
import clinicaMedica.model.Paciente;

public class Principal {

	public static void main(String [] args){
		
		Paciente paciente = new Paciente();
		paciente.setNome("Diego");
		paciente.setProfissao("Engenheiro de Computação");
		
		Atendimento atendimento = new Atendimento();
		atendimento.setPaciente(paciente);
		atendimento.imprimeDados();
	}
}
