package ejercicio4;

public class Concesionario {
    private String nombre;
    private String direccion;
    private int cantidadCarros;

    public Concesionario(String nombre, String direccion, int cantidadCarros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadCarros = cantidadCarros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadCarros() {
        return cantidadCarros;
    }

    public void setCantidadCarros(int cantidadCarros) {
        this.cantidadCarros = cantidadCarros;
    }

    public void agregarCarro() {
        this.cantidadCarros++;
        System.out.println("Se ha agregado");
    }

    public void eliminarCarro(int cantidad) {
        if (cantidad > 0) {
            if (this.cantidadCarros >= cantidad) {
                this.cantidadCarros -= cantidad;
            } else {
                System.out.println("No hay suficientes carros para eliminar.");
            }
        } else {
            System.out.println("La cantidad de carros a eliminar debe ser mayor a 0.");
        }
    }
    public String getInfo(){
        return "Nombre "+ this.nombre +"\n"+ "Direccion "+ this.direccion+ "\n"+ "Cantidad de carros "+ this.cantidadCarros;
    }
    public boolean venderCarro(int cantidad){
        if (cantidad > 0) {
            if (this.cantidadCarros >= cantidad) {
                this.cantidadCarros -= cantidad;
                return true;
            } else {
                System.out.println("No hay suficientes carros para vender.");
                return false;
            }
        } else {
            System.out.println("La cantidad de carros a vender debe ser mayor a 0.");
            return false;
        }
    }
    public void mostrarCarros(){
        System.out.println("Cantidad de carros disponibles en el concesionario: " + this.cantidadCarros);
    }
}
