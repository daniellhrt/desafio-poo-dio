import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
            cursoJava.setTitulo("Curso Java");
            cursoJava.setDescricao("Descrição curso Java");
            cursoJava.setCargaHoraria(6);

        Curso cursoJS = new Curso();
            cursoJS.setTitulo("Curso Java Script");
            cursoJS.setDescricao("Descrição curso Java Script");
            cursoJS.setCargaHoraria(4);
            Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java");
            mentoria.setDescricao("Mentoria de Java");
            mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devDaniel.getConteudosInscritos() );
        devDaniel.progredir();
        System.out.println("Conteudos inscritos " + devDaniel.getConteudosInscritos() );
        System.out.println("Conteudos concluidos " + devDaniel.getConteudosConcluidos() );
        System.out.println("XP " + devDaniel.calculcarTotalXp());

        System.out.println();

        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devFernanda.getConteudosInscritos() );
        devFernanda.progredir();
        System.out.println("Conteudos inscritos " + devFernanda.getConteudosInscritos() );
        System.out.println("Conteudos concluidos " + devFernanda.getConteudosConcluidos() );
        System.out.println("XP " + devFernanda.calculcarTotalXp());


    }
}
