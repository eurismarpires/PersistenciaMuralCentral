package br.ufg.inf.fabrica.muralufg.central.resource;



import br.ufg.inf.fabrica.muralufg.central.organizacao.Aluno;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/hr/")
public class EmployeeResource {
    @GET
    @Path("/employee")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEmployee() {
        Aluno aluno = new Aluno("Eurismar","110227");
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(aluno);

        JSONObject alunoJson = new JSONObject();
        try {
            alunoJson.put("nome",aluno.getNome());
            alunoJson.put("matricula",aluno.getMatricula());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return alunoJson.toString();
    }
}