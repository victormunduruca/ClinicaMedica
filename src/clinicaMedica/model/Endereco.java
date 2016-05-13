package clinicaMedica.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Endereco implements Comparable<Object>, Serializable{
	
	private String rua;
	private String cidade;
	private String pais;
	private String estado;
	private String bairro;
	private int numeroCasa;
	
	public Endereco(){
		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		return "Rua: " +this.rua+ "\n" + "Cidade: " +this.cidade + "\n" + "Pais: " +this.pais + "\n" + "Estado: " +this.estado +  "\n"+ "Bairro: " +this.bairro + "\n" +"Numero Casa: " +this.numeroCasa + "\n";
	}

}
