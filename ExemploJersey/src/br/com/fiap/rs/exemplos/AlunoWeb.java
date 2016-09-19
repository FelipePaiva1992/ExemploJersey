package br.com.fiap.rs.exemplos;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("alunos")
public class AlunoWeb {

	static private List<Aluno> alunos;
	
	static{
		alunos = new ArrayList<>();
		alunos.add(new Aluno("felipe1","27scj",10));
		alunos.add(new Aluno("felipe2","27scj",9));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	
	@GET
	@Path("{indice}")
	@Produces(MediaType.APPLICATION_XML)
	public Aluno getAluno(@PathParam("indice") int indice){
		return alunos.get(indice);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Retorno novo(Aluno a){
		alunos.add(a);
		return new Retorno("Inseriu, SHABLAU!");
	}
	
	@DELETE
	@Path("{indice}")
	@Produces(MediaType.APPLICATION_XML)
	public Retorno remover(@PathParam("indice") int indice){
		alunos.remove(indice);
		return new Retorno("Apagou, SHABLAU!");
	}
	
	@PUT
	@Path("{indice}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Retorno atualizar(Aluno aluno, @PathParam("indice") int indice){
		alunos.set(indice, aluno);
		return new Retorno("Alterou, SHABLAU!");
	}
	
}
