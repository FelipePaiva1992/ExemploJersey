package br.com.fiap.rs.exemplos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Retorno {
	
	public Retorno() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Retorno(String mensagem) {
		super();
		this.mensagem = mensagem;
	}



	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
