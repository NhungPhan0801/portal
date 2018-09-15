package example.persistence.entities;

import org.hibernate.annotations.Table;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity


public class AssignmentEntity {
    @Id
    @Column(name = "assignmentid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer asignmentid;
    @Column(name = "formdate")
    private Timestamp formdate;
    @Column(name = "enddate")
    private Timestamp enddate;
    @Column(name = "workload")
    private Double workload;
    @Column(name = "assigmentcost")
    private Double assigmentcost;
    @Column(name = "rate")
    private Double rate;

    @ManyToOne
    @JoinColumn(name = "employeeid")
    private EmployeeEntity employeeEntity;

    @JoinColumn(name = "ProjectEntity")
    private ProjectEntity projectEntity;

    public Integer getAsignmentid() {
        return asignmentid;
    }

    public void setAsignmentid(Integer asignmentid) {
        this.asignmentid = asignmentid;
    }

    public Timestamp getFormdate() {
        return formdate;
    }

    public void setFormdate(Timestamp formdate) {
        this.formdate = formdate;
    }

    public Timestamp getEnddate() {
        return enddate;
    }

    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    public Double getWorkload() {
        return workload;
    }

    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    public Double getAssigmentcost() {
        return assigmentcost;
    }

    public void setAssigmentcost(Double assigmentcost) {
        this.assigmentcost = assigmentcost;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
