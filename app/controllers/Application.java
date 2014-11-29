package controllers;

import com.avaje.ebean.Ebean;
import models.Customer;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        List<Customer> customers = Ebean.find(Customer.class).findList();
        return ok(index.render(customers));
    }

}
