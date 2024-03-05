package ejercicio3;

public class Libro {
    private String titulo,autor;
    private int paginas;

    public Libro(String titulo,String autor,int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public java.lang.String getTitulo() {

        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {

        this.titulo = titulo;
    }

    public java.lang.String getAutor() {

        return autor;
    }

    public void setAutor(java.lang.String autor) {

        this.autor = autor;
    }

    public int getPaginas() {

        return paginas;
    }

    public void setPaginas(int paginas) {

        this.paginas = paginas;
    }

}
