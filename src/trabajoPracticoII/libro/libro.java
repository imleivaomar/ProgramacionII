package trabajoPracticoII.libro;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo,String autor,String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public void prestar () {
        if (disponible){
            disponible=false;
            System.out.println("El libro\"" + titulo+ "\" fue prestado.");

        }else System.out.println("El libro \"" + titulo + "\" ya está prestado");

    }
    public void devolver () {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto");
    }
    public void mostrarInformacion() {
        System.out.println("Titulo:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("ISBN:" + isbn);
        System.out.println("Estado:" + (disponible? "Disponible" : "prestado"));
        System.out.println("-------------");
    }

}
