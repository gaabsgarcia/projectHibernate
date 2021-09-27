package com.hibernate;

@Entity
@Table(name="tb_aluno",uniqueConstraints = {@UniqueConstraint(columnNames="cl_id")})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cl_id",unique = true, nullable = false, length = 4)
    private int ra;

    @Column(name="cl_nome", unique = false, nullable = false, length = 100)
    private String nome;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
