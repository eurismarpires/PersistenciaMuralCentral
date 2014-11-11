package br.ufg.inf.fabrica.muralufg.central.resource;


import br.ufg.inf.fabrica.muralufg.central.organizacao.Aluno;
import br.ufg.inf.fabrica.muralufg.central.organizacao.Dispositivo;
import br.ufg.inf.fabrica.muralufg.central.organizacao.Docente;
import br.ufg.inf.fabrica.muralufg.central.organizacao.Turma;
import com.google.appengine.api.datastore.*;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.*;

@Path("/dispositivos_turma/turmaid")
public class DispositivosTurma {

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

