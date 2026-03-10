public class Christian {

    private String titulo;
    private String autor;
    private String ISBN;
    private int numPaginas;

    // Constructor con todos los atributos
    public Christian(String titulo, String autor, String ISBN, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    // Constructor sin ISBN
    public Christian(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.ISBN = "No asignado";
    }
}