package ejercicio3;

public class ProcesosDao {
    Libro libro = new Libro("Java Programming", "Jane Doe", 400);

    Alumno alumno = new Alumno("Carlos Pérez", 22, "Ingeniería");

    Profesor profesor = new Profesor("Prof. Rodríguez", 40, "Física");

    public String getInfo() {
        return "Libro: "+this.libro.getTitulo()+", Autor: "+this.libro.getAutor()+", Páginas: "+this.libro.getPaginas()
                +"\n"+"Alumno: "+this.alumno.getNombre()+", Edad: "+this.alumno.getEdad()
                +"\n"+"Profesor: "+this.profesor.getNombre()+", Edad: "+ this.profesor.getEdad()+", Materia: "+this.profesor.getMateria();
    }

}
