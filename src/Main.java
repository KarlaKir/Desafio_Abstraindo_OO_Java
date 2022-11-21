import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHorária(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JS");
        curso2.setCargaHorária(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("Descrição Mentoria SJ");
        mentoria2.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);


        Dev dev1 = new Dev();
        dev1.setNome("Karla");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Iniciais Karla" + dev1.getConteudosInscritos());

        System.out.println("             ");

        dev1.progredir();
        System.out.println("Conteúdos a cursar Karla" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Karla" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("             ");
        System.out.println("             ");

        Dev dev2 = new Dev();
        dev2.setNome("Daniel");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Iniciais Daniel" + dev2.getConteudosInscritos());

        System.out.println("             ");

        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos a cursar Daniel" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniel" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());



    }
}
