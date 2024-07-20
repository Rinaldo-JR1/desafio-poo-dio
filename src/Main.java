import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRinaldo = new Dev();
        devRinaldo.setNome("Rinaldo");
        devRinaldo.inscreverEmBootcamp(bootcamp);
        devRinaldo.progredir();

        System.out.println("Conteudos inscritos "+devRinaldo.getConteudosInscritos());

        System.out.println("Conteudos concluidos "+devRinaldo.getConteudosConcluidos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos concluidos "+devCamila.getConteudosConcluidos());

    }
}