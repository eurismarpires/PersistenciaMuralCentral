package br.ufg.inf.fabrica.muralufg.central.resource;


import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Path("/dispositivos/turmaid")
public class Dispositivos {

    @GET
    @Path("{turmaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public String dispositivosAlunos(@PathParam("turmaId") String turmaId){

        Set<String> dispositivosAlunos = new HashSet<String>();

        if(turmaId.equals("1")){
            dispositivosAlunos.add("93093290239902");
            dispositivosAlunos.add("38832883823888");
            dispositivosAlunos.add("390248284320989");
            dispositivosAlunos.add("39290309239032");
            dispositivosAlunos.add("854938594398588385398583");
        }
        if(turmaId.equals("2")){
            dispositivosAlunos.add("32893892392393");
            dispositivosAlunos.add("32929329392923");
            dispositivosAlunos.add("84884884388348");
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(dispositivosAlunos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

}


/*

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
*/