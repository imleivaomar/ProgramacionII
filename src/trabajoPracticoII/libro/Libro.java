class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible; // true si está disponible, false si está prestado


    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Por defecto, un libro nuevo está disponible
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado exitosamente.");
        } else {
            System.out.println("Lo sentimos, el libro '" + titulo + "' ya se encuentra prestado.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto y ahora está disponible.");
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba en la biblioteca.");
        }
    }

    public void mostrarInformacion() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("------------------------------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor:  " + autor);
        System.out.println("ISBN:   " + isbn);
        System.out.println("Estado: [" + estado + "]");
        System.out.println("------------------------------");
    }
}

 class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");

        libro1.mostrarInformacion();

        libro1.prestar();

        libro1.prestar();

        libro1.mostrarInformacion();

        libro1.devolver();

        libro1.mostrarInformacion();
    }
}