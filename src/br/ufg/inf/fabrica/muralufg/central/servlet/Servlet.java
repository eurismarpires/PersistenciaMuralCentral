package br.ufg.inf.fabrica.muralufg.central.servlet;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Eurismar on 27/10/2014.
 */
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String matricula = request.getParameter("matricula");
        response.getWriter().print("Nome:" + nome + "\nMatricula:" + matricula);

        gravarAluno(nome, matricula);
        response.getWriter().print("Nome:" + nome + "\nMatricula:" + matricula);
    }

    private void gravarAluno(String nome, String matricula) {
        Entity aluno = new Entity("Aluno",matricula);
        aluno.setProperty("nome", nome);
        aluno.setProperty("matricula", "matricula");
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        datastore.put(aluno);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Olá gravou doGet");
    }
}
