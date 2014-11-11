package br.ufg.inf.fabrica.muralufg.central.resource;

import br.ufg.inf.fabrica.muralufg.central.organizacao.Aluno;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Path("/alunos/turmaid")
public class Alunos {
    @GET
    @Path("{turmaId}")
    @Produces(MediaType.APPLICATION_JSON)
    public String alunos(@PathParam("turmaId") String turmaId) {
        Set<Aluno> alunos = new HashSet<Aluno>();
        Aluno aluno1 = new Aluno("Alice","123456");

        Set<String> reg1 = new HashSet<String>();
        reg1.add("3293029023");
        aluno1.setRegistrationIds(reg1);


        Aluno aluno2 = new Aluno("Bob","4994393");
        Set<String> reg2 = new HashSet<String>();
        reg2.add("4499393993");
        reg2.add("69593949439");
        reg2.add("39943949999");
        aluno2.setRegistrationIds(reg2);

        alunos.add(aluno1);
        alunos.add(aluno2);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = "";
        try {
            json = objectMapper.writeValueAsString(alunos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }
}
