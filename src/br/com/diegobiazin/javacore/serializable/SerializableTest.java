package br.com.diegobiazin.javacore.serializable;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        gravarObjeto();
        lerObjeto();
    }

    private static void gravarObjeto() {
        Turma turma = new Turma("Turma do JAVA");
        Aluno aluno = new Aluno(3L, "Diego Biazin", "123456");
        aluno.setTurma(turma);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
