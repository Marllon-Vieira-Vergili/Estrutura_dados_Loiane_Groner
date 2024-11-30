package Pilhas.Definicoes.ExerciciosCorrigidos;

public class Livro {

    private String isbn;
    private String autor;
    private int anolancamento;
    private String nome;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro(){

    }
    public Livro(String isbn, String autor, int anolancamento, String nome) {
        this.isbn = isbn;
        this.autor = autor;
        this.anolancamento = anolancamento;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", anolancamento=" + anolancamento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
