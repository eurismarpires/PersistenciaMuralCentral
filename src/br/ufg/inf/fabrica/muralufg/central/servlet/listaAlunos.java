package br.ufg.inf.fabrica.muralufg.central.servlet;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Entity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eurismar on 27/10/2014.
 */
public class listaAlunos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Listagem de Alunos Post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        htmlListagemAlunos(request, response);


    }

    private void htmlListagemAlunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.addHeader("contentType", "text/html;charset=UTF-8");
        response.addHeader("language", "java");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Menu Horizontal</title>");
        out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<a href=\"..\\aluno.jsp\">Voltar</a>");
        out.print("<h1>Listagem de Alunos</h1>");
        buscarListaNoBanco(request, response);
        out.print("</body");
        out.print("</html>");
    }

    private void buscarListaNoBanco(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<ul>");
        List<Entity> alunos = getListaDeAlunos();
        for (Entity entity : alunos) {
            resp.getWriter().println("<li>" + entity.getProperty("matricula") + " - " +  entity.getProperty("nome") + "</li>");
        }
        resp.getWriter().println("</ul>");
    }

    public static List<Entity> getListaDeAlunos() {
        DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
        Query q = new Query("Aluno").addSort("nome", Query.SortDirection.ASCENDING);
        PreparedQuery pq = datastore.prepare(q);
        return pq.asList(FetchOptions.Builder.withDefaults());
    }

}
