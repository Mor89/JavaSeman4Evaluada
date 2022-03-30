
public class Edificio extends Area{

    String ubicacion, nombre;
    int cod_Departamen, cod_Depisos;

    public Edificio() {
    }

    public Edificio(String ubicacion, String nombre, int cod_Departamen, int cod_Depisos) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.cod_Departamen = cod_Departamen;
        this.cod_Depisos = cod_Depisos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public int getCod_Departamen() {
        return cod_Departamen;
    }

    public void setCod_Departamen(int cod_Departamen) {
        this.cod_Departamen = cod_Departamen;
    }

    public int getCod_Depisos() {
        return cod_Depisos;
    }

    public void setCod_Depisos(int cod_Depisos) {
        this.cod_Depisos = cod_Depisos;
    }

    
    String datoEdificio (){
       String Info = "";
       
       Info += "La ubicación del Edificio es: Zacatecoluca La Paz" + "\n";
       Info += "El nombre del Departamento es: A" + "\n";
       Info += "La cantidad de Departamentos que alberga son: 1" + "\n"; 
       Info += "La cantidad de pisos son: 10" + "\n";
       
       return Info;  
    }

}
