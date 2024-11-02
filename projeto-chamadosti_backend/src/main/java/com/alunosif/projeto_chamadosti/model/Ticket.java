package com.alunosif.projeto_chamadosti.model;

import com.alunosif.projeto_chamadosti.model.enuns.Severity;
import com.alunosif.projeto_chamadosti.model.enuns.TicketStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = 0;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userOwner;
    @Enumerated(EnumType.STRING)
    private Severity severity = Severity.LOWER;
    @Enumerated(EnumType.STRING)
    private TicketStatus status = TicketStatus.OPEN;

    public Ticket(Integer id, String title, String description, User userOwner, Severity severity, TicketStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.userOwner = userOwner;
        this.severity = severity;
        this.status = status;
    }

    public Ticket(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public User getUserOwner() {
        return userOwner;
    }

    public void setUserOwner(User userOwner) {
        this.userOwner = userOwner;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", severity=" + severity +
                '}';
    }
}
