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
        System.out.println("-");
        devRinaldo.setNome("Rinaldo");
        devRinaldo.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Rinaldo: "+devRinaldo.getConteudosInscritos());

        devRinaldo.progredir();
        devRinaldo.progredir();
        devRinaldo.progredir();
        System.out.println("-");

        System.out.println("Conteudos inscritos Rinaldo: "+devRinaldo.getConteudosInscritos());
        System.out.println("Conteudos concluidos Rinaldo: "+devRinaldo.getConteudosConcluidos());
        System.out.println("XP:"+devRinaldo.calcularXpTotal());


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXpTotal());

        System.out.println("-------");


    }
}