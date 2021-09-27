package com.hibernate;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Aluno aluno = new Aluno(0001, "Alguem");
        Aluno aluno1 = new Aluno(0002, "Alguem1");
        Aluno aluno2 = new Aluno(0003, "Alguem2");
        Disciplina disciplina = new Disciplina(00001,"", 1800);
        Disciplina disciplina1 = new Disciplina(00002,"Disciplina de Linguagem de Programação Multiplataforma tem o intuito de ensinar a linguagem escolhida em suas mais diversas aplicações", 2600);
        Disciplina disciplina2 = new Disciplina(00002,"Disciplina de Linguagem de Programação Multiplataforma tem o intuito de ensinar a linguagem escolhida em suas mais diversas aplicações", 2800);
        Professor professor = new Professor(12345, "Tania", "taniabasso@cotil.unicamp.br", 100000000);
        Professor professor1 = new Professor(12345, "Outro Professor", "outroprofessor@cotil.unicamp.br", 100000000);

        session.save(aluno);
        session.save(aluno1);
        session.save(aluno2);
        session.save(professor);
        session.save(professor1); //id repete!
        session.save(disciplina); //com erro
        session.save(disciplina1); //save sem erro
        session.update(disciplina2); //update
        session.delete(professor); //delete

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
