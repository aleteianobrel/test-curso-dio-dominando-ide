package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

        /* int a = 5;
        int b = 3;
        System.out.println("Hellow World!" + (a+b));*/
    }
}

class  Livro {
    private  String nome;
    private  String numPaginas;

    public Livro(String nome, String numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public Livro(String nome, int i) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}

