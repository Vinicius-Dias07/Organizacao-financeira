package br.com.organizacao_financeira.demo.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "names", nullable = false)
    private String name;

    @Column(name = "emails", nullable = false)
    private String email;

    @Column(name="Passwords", nullable = false)
    private String password;

    private double monthlyIncome;

    public User() {
    }

    public User(Long id, String name, String email, String password, double monthlyIncome) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.monthlyIncome = monthlyIncome;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
