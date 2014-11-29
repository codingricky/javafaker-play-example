package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends Model {
    @Id
    @Constraints.Min(10)
    public Long id;

    @Constraints.Required
    public String firstName;
    @Constraints.Required
    public String lastName;
    @Constraints.Required
    public String title;
    @Constraints.Required
    public String streetAddress;
}
