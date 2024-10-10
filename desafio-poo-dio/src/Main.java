import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Java para iniciantes", 200);
        Curso curso2 = new Curso("HTML", "Primeiro HTML", 140);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Praticando Java", LocalDate.now());

        Set<Conteudo> conteudosBootcamp = new HashSet<>();
        conteudosBootcamp.add(curso1);
        conteudosBootcamp.add(curso2);
        conteudosBootcamp.add(mentoria);

        Bootcamp bootcamp = new Bootcamp("Aprenda Java", "Java para iniciantes", conteudosBootcamp);

        Dev joao = new Dev("Joao");
        Dev camila = new Dev("Camila");

        joao.inscreverBootcamp(bootcamp);
        camila.inscreverBootcamp(bootcamp);



        System.out.println(bootcamp);
    }
}