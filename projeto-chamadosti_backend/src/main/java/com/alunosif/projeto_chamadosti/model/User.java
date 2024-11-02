package com.alunosif.projeto_chamadosti.model;


import com.alunosif.projeto_chamadosti.model.enuns.Severity;
import com.alunosif.projeto_chamadosti.model.enuns.TypeUser;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = 0;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;

    @OneToMany(mappedBy = "userOwner")
    private List<Ticket> tickets;


    public User(){}

    public User(Integer id, String username, String password, TypeUser typeUser) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.typeUser = typeUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", typeUser=" + typeUser +
                '}';
    }
}

