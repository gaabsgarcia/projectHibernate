package com.hibernate;

@Entity
@Table(name="tb_professor", uniqueConstraints = {@UniqueConstraint(columnNames="cl_matricula"),@UniqueConstraint(columnNames="cl_email")})
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cl_matricula", unique = true, nullable = false, length = 5)
    private int matricula;

    @Column(name="cl_nome", unique = false, nullable = false, length = 100)
    private String nome;

    @Column(name="cl_email", unique = true, nullable = false, length = 40)
    private String email;

    @Column(name="cl_salario", nullable = false, unique = false, length = 15)
    private float salario;

    public Professor(int matricula, String nome, String email, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}