package example.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;


    @ManyToMany
    @JoinTable(name = "role_user", joinColumns = @JoinColumn(name = "roleid", referencedColumnName = "roleid"), inverseJoinColumns = @JoinColumn(name = "userid", referencedColumnName = "userid"
    ))

    private UserEntity userEntity;

    @OneToOne
    @JoinColumn(name = "employee")

    private EmployeeEntity employeeEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
