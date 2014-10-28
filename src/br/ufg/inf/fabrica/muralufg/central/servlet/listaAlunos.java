package br.ufg.inf.fabrica.muralufg.central.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Eurismar on 27/10/2014.
 */
public class listaAlunos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Listagem de Alunos Post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        htmlListagemAlunos(request,response);


    }
    private void htmlListagemAlunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.addHeader("contentType","text/html;charset=UTF-8");
        response.addHeader("language","java");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Menu Horizontal</title>");
        out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<a href=\"..\\aluno.jsp\">Voltar</a>");
        out.print("<h1>Listagem de Alunos</h1>");
        out.print("</body");
        out.print("</html>");
    }
}
