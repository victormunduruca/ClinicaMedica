package clinicaMedica.controller;

import clinicaMedica.model.Atendimento;

public class Controller {

	public Controller(){
		
	}
	
	public void escreverArquivo(Atendimento atendimento){
		System.out.println(atendimento.getNomeMedico());
	}
}
