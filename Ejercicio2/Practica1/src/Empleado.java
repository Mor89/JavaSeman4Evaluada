
public class Empleado extends Edificio {

    String nombre, direccion, areaTrab, cargoD, direccionED;
    long Codigo;
    int edad;
    double sueldo, salarioF;
    int dd;
    int mm;
    int an;
    int fecha;
    double tipo;

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, String areaTrab, String cargoD, String direccionED, long Codigo, int edad, double sueldo, double salarioF, int dd, int mm, int an, int fecha, double tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.areaTrab = areaTrab;
        this.cargoD = cargoD;
        this.direccionED = direccionED;
        this.Codigo = Codigo;
        this.edad = edad;
        this.sueldo = sueldo;
        this.salarioF = salarioF;
        this.dd = dd;
        this.mm = mm;
        this.an = an;
        this.fecha = fecha;
        this.tipo = tipo;
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

    public String getAreaTrab() {
        return areaTrab;
    }

    public void setAreaTrab(String areaTrab) {
        this.areaTrab = areaTrab;
    }

    public String getCargoD() {
        return cargoD;
    }

    public void setCargoD(String cargoD) {
        this.cargoD = cargoD;
    }

    public String getDireccionED() {
        return direccionED;
    }

    public void setDireccionED(String direccionED) {
        this.direccionED = direccionED;
    }

    public long getCodigo() {
        return Codigo;
    }

    public void setCodigo(long Codigo) {
        this.Codigo = Codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(double salarioF) {
        this.salarioF = salarioF;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo) {
        this.tipo = tipo;
    }

   
    String DatosP(Empleado h) {

        String Informacion = "";
        Informacion += "El nombre es :" + nombre + "\n";
        Informacion += "El codigo del empleado es :" + Codigo + "\n";
        Informacion += "La edad del empleado es :" + edad + "\n";
        Informacion += "La direccion del empleado es :" + direccionED + "\n";
        Informacion += "El area de trabajo es :" + areaTrab + "\n";
        Informacion += "El cargo a desempeñar es :" + cargoD + "\n";
        Informacion += "La fecha que ingreso el empleado es:" + dd + "/" + mm + "/" + an + "\n";
        Informacion += "El sueldo base es : $" + sueldo + "\n";
        Informacion += "El salario liquido del empleado es: $" + h.Descuentos(h);

        return Informacion;
    }

    double Descuentos(Empleado h) {

        double salario;
        if (this.tipo == 1) {
            double renta = (sueldo * 0.1);
            double afp = (sueldo * 0.725);
            double iss = (sueldo * 0.13);
            salario = (sueldo - (afp - iss - renta));
            return salario;
        } else if (this.tipo == 2) {
            double renta = (sueldo * 0.1);
            salario = (sueldo - renta);

            return salario;
        }
        return this.tipo;
    }

    double tipoEmpleo() {
        double Empld = this.tipo;

        if (Empld == 1) {

            System.out.println("El empleado es permanente");

            return Empld;

        } else {
            System.out.println("El empleado es por contrato");

        }
        return Empld;
    }
}
