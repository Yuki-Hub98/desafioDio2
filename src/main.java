import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class main {
    public static void main(String[] args) {
        //Criaçaõ de curso
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        //criação de mentoria
        Mentoria mentoria = new Mentoria();

        //Adicionando curso
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java, aprendendo sobre ide e logica de programação");
        curso1.setCargahoraria(10);
        //adicionando mentoria

        mentoria.setTitulo("Professora Camila");
        mentoria.setDescricao("Professora Camila ensina sobre logica de programação Java");



        //criando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java, para aprender POO.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        //Crição dos Devs que vão inscrever no bootcamp.

        Dev devWellyson = new Dev();
        devWellyson.setNome("Wellyson Yago Monteiro da Silva");
        devWellyson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ devWellyson.getConteudosInscritos());
        //Concluindo Bootcamp

        devWellyson.progredir();
        System.out.println("Conteudos Concluidos: "+ devWellyson.getConteudosConcluidos());
        System.out.println("XP adquirido: "+ devWellyson.calcularTotalXp());
    }
}
