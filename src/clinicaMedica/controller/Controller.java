package clinicaMedica.controller;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;


import clinicaMedica.model.Paciente;

public class Controller {
	
	private ArrayList<Paciente> pacientes = new ArrayList<>();
	private BufferedWriter bw;
	
	public Controller(){

	}
	
	
	public void cadastrar(Paciente paciente) {
		pacientes.add(paciente);
	}
	
	public void escreverArquivo() throws IOException{
		FileWriter fw = new FileWriter("data/cadastro.txt");  
		bw = new BufferedWriter(fw); 
		
		Iterator<Paciente> i =  pacientes.iterator();
		while(i.hasNext()) {
			Paciente paciente = (Paciente) i.next();
			String txtSalvar = paciente.toString() + paciente.getEndereco().toString();
			txtSalvar = txtSalvar.replaceAll("\n", System.lineSeparator()); //deixa o texto do txt legivel
			bw.write(txtSalvar); // salva as informações em txt
			bw.write(System.lineSeparator());
		}
		bw.close();

		
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> atendimentos) {
		this.pacientes = atendimentos;
	}
	
	public Paciente visualizar(String cpf) {
		Iterator<Paciente> i = pacientes.iterator();
		while(i.hasNext()) {
			Paciente paciente = (Paciente) i.next();
			if(paciente.getCpf().equals(cpf))
				return paciente;
		}
		return null;
	}


}

