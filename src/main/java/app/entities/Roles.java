package app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "roleName")
    private String roleName;

    @ManyToMany(mappedBy = "roles")
    private List<Users> users;

    protected Roles(){};
}
