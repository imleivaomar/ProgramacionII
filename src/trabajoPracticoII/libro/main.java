package trabajoPracticoII.libro;

public class main {
    public static void main(String[] args) {


        Libro miLibro = new Libro("El Tunel", "Ernesto Sabato","9789875806023");

        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}