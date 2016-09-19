package br.com.fiap.rs.exemplos;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resurces")
public class Aplicacao extends ResourceConfig {

	public Aplicacao() {
		packages("br.com.fiap.rs.exemplos");
	}

}
