package br.ufg.inf.fabrica.muralufg.central.resource;



import br.ufg.inf.fabrica.muralufg.central.organizacao.Aluno;
import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Entity;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.text.html.parser.*;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/ar")
public class AlunoResource {
    @GET
    @Path("/aluno")
    @Produces(MediaType.APPLICATION_XML)
    public AlunoConverter getAluno() {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query q = new Query("Aluno").addSort("nome", Query.SortDirection.ASCENDING);
        PreparedQuery pq = datastore.prepare(q);
        List<Entity> entityList =  pq.asList(FetchOptions.Builder.withDefaults());

        for (Entity entity : entityList) {
            Aluno aluno = new Aluno(entity.getProperty("nome").toString(),entity.getProperty("matricula").toString());
            List<Aluno> alunos = new ArrayList<Aluno>();
            alunos.add(aluno);
        }
        JSONObject alunoJson = new JSONObject();
        try {
            alunoJson.put("alunos",alunoJson);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Aluno aluno = new Aluno("Eurismar","039923");
        AlunoConverter converter = new AlunoConverter(aluno);

        return converter;
    }
    @GET
    @Path("/alunos")
    @Produces(MediaType.APPLICATION_XML)
    public List<AlunoConverter> getAlunos() {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query q = new Query("Aluno").addSort("nome", Query.SortDirection.ASCENDING);
        PreparedQuery pq = datastore.prepare(q);
        List<Entity> entityList =  pq.asList(FetchOptions.Builder.withDefaults());

        List<AlunoConverter> alunos = new ArrayList<AlunoConverter>();
        for (Entity entity : entityList) {
            AlunoConverter aluno = new AlunoConverter();


            //entity.getProperty("nome").toString(),entity.getProperty("matricula").toString()


            alunos.add(aluno);
        }
        return alunos;
    }







}