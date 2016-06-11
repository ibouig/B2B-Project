package ma.jemla.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;


@NamedQuery(name="findManagerByEmail",query="select m from Manager m where m.email=:email1 and m.password=:pass1")
@Entity
public class Manager extends Account{

}
