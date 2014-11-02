package br.ufg.inf.fabrica.muralufg.central.resource;

import br.ufg.inf.fabrica.muralufg.central.organizacao.Aluno;
import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Entity;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

@Path("/ar")
public class AlunoResource {
    @GET
    @Path("/alunos")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAlunos() {

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos = getListaDeAlunos();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(alunos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static List<Aluno> getListaDeAlunos() {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query q = new Query("Aluno").addSort("nome", Query.SortDirection.ASCENDING);
        PreparedQuery pq = datastore.prepare(q);
        List<Entity> alunos = pq.asList(FetchOptions.Builder.withDefaults());
        List<Aluno> alunoList = new ArrayList<Aluno>();

        for (Entity entity : alunos) {
            Aluno aluno = new Aluno();
            alunoList.add(new Aluno(entity.getProperty("nome").toString(), entity.getProperty("matricula").toString()));
        }
        return alunoList;
    }





}