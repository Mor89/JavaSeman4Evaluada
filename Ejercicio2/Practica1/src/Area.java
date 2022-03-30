
public class Area  {

    String nombre;
    int codArea, cantEmpleado, numEdificio;

    public Area() {
    }

    public Area(String nombre, int codArea, int cantEmpleado, int numEdificio) {
        this.nombre = nombre;
        this.codArea = codArea;
        this.cantEmpleado = cantEmpleado;
        this.numEdificio = numEdificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public int getCantEmpleado() {
        return cantEmpleado;
    }

    public void setCantEmpleado(int cantEmpleado) {
        this.cantEmpleado = cantEmpleado;
    }

    

    public int getNumEdificio() {
        return numEdificio;
    }

    public void setNumEdificio(int numEdificio) {
        this.numEdificio = numEdificio;
    }
    
    
    String datArea() {
        String Inf = "";
        Inf += "El nombre del Area es:" + nombre + "\n";
        Inf += "El codigo de Area es:" + codArea + "\n";
        Inf += "La cantidad de empleados es:" + cantEmpleado + "\n";
        Inf += "La cantidad de edificios es: " + numEdificio + "\n";
        return Inf;
    }

}
