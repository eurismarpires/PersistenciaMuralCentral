package br.ufg.inf.fabrica.muralufg.central.servlet;


import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;





/**
 * Created by Eurismar on 02/11/2014.
 */
public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        criarEntidade();

    }
    private void criarEntidade(){
        DatastoreService  service = DatastoreServiceFactory.getDatastoreService();


        Entity person = new Entity("Person","tom");

        Entity weddingPhoto = new Entity("Photo",person.getKey());
        weddingPhoto.setProperty("imageURL","http://helpcasamentos.com/wp-content/uploads/2014/03/Estudo-comprova-que-casamento-engorda0.jpg");
        Entity babyPhoto = new Entity("Photo",person.getKey());
        babyPhoto.setProperty("imageURL","http://ei.marketwatch.com//Multimedia/2014/04/11/Photos/MG/MW-BZ111_cute_b_20140411074006_MG.jpg?uuid=15c26634-c16e-11e3-9750-00212803fad6");

        service.put(Arrays.asList(person,weddingPhoto,babyPhoto));

    }

}
