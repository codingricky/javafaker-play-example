import com.avaje.ebean.Ebean;
import com.github.javafaker.Faker;
import models.Customer;
import play.Application;
import play.GlobalSettings;
import play.Logger;

import java.util.List;

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        final List<Object> customerIds = Ebean.find(Customer.class).findIds();
        if (customerIds.isEmpty()) {
            Logger.info("inserting customers as none exist at the moment");

            Faker faker = new Faker();

            for (int i = 0; i < 20; i++) {
                Customer customer = new Customer();
                customer.firstName = faker.name().firstName();
                customer.lastName = faker.name().lastName();
                customer.title = faker.name().prefix();
                customer.streetAddress = faker.address().streetAddress(true);
                Ebean.save(customer);
            }
        } else {
            Logger.info("not inserting any customers");
        }
    }
}
