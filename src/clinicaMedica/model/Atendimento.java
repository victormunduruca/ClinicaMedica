package clinicaMedica.model;

public class Atendimento {
	
	private Paciente paciente;
	private String nomeMedico;
	private String areaAtendimento;
	private String data;
	private double valor;
	
	public Atendimento(){
		
	}
	
	public void imprimeDados() {

	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getAreaAtendimento() {
		return areaAtendimento;
	}

	public void setAreaAtendimento(String areaAtendimento) {
		this.areaAtendimento = areaAtendimento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
