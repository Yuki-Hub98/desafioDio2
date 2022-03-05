package br.com.dio.desafio.dominio;

public class Mentoria extends Conteudos {


    //private  localDate data;
    public Mentoria() {

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "titulo='" + getTitulo() +
                ", descricao='" + getDescricao() +
                '}';
    }

    /*public localDate getData() {
        return data;
    }

    public void setData(localDate data) {
        this.data = data;
    }*/

}