package example.persistence.entities;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @Column(name = "employee")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer employeeid;
    @Column(name="fistname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "birthday")
    private Timestamp birthday;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "currentsalary")
    private Integer currentSalary;
    @Column(name = "hiredate")
    private Timestamp hireDate;
    @Column(name = "quitdate")
    private Timestamp quitDate;
    @Column(name = "avatarfile")
    private Blob avatarFile;

    @OneToOne
    @JoinColumn(name = "userid")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "employeeEntity")
    private Set<AssignmentEntity> assignmentEntities;

    private Set<AssignmentEntity> assugnmntEntities;

    public Integer getEmployee() {
        return employeeid;
    }

    public void setEmployee(Integer employee) {

        this.employeeid = employee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Integer currentSalary) {
        this.currentSalary = currentSalary;
    }

    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    public Timestamp getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Timestamp quitDate) {
        this.quitDate = quitDate;
    }

    public Blob getAvatarFile() {
        return avatarFile;
    }

    public void setAvatarFile(Blob avatarFile) {
        this.avatarFile = avatarFile;
    }
}
