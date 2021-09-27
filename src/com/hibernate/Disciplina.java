package com.hibernate;

@Entity
@Table(name="tb_disciplina", uniqueConstraints = {@UniqueConstraint(columnNames="cl_codigo")})
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cl_codigo", unique = true, nullable = false, length = 5)
    private int codigo;

    @Column(name="cl_descricao", unique = false, nullable = false, length = 100)
    private String descricao;

    @Column(name="cl_cargaHoraria", unique = false, nullable = false, length = 100)
    private int cargaHoraria;

    public Disciplina(int codigo, String descricao, int cargaHoraria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}