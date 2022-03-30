
import java.sql.Date;

import java.util.Scanner;

public class DatosMain {

    public static void main(String[] args) {
        String DPersonales;
        double tEmpleado;
        String DatosEdificio;
        String datArea;

        Empleado empleado = new Empleado();
        //Edificio Edificio = new Edificio();
        // Area area = new Area();
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba el nombre del empleado: ");
        empleado.setNombre(leer.nextLine());
        System.out.println("Digite el codigo del empleado: ");
        empleado.setCodigo(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite la edad del empleado: ");
        empleado.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la direccion del empledo: ");
        empleado.setDireccionED(leer.nextLine());
        System.out.println("Escriba el cargo a desempeñar: ");
        empleado.setCargoD(leer.nextLine());
        System.out.println("Digite el dia de ingreso: ");
        empleado.setDd(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el mes de ingreso: ");
        empleado.setMm(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el año de ingreso: ");
        empleado.setAn(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba el sueldo base/bruto del empleado: ");
        empleado.setSueldo(Double.parseDouble(leer.nextLine()));
        System.out.println("Tipo contrato: 1 = Permanente y 2 = Contato :");
        empleado.setTipo(leer.nextInt());
        System.out.println("");
        System.out.println("Digite el nombre del area :");
        empleado.setNombre(leer.nextLine());
        System.out.println("Digite el codigo de Area : ");
        empleado.setCodArea(leer.nextInt());
        System.out.println("Digite la cantidad de empleados: ");
        empleado.setCantEmpleado(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el numero de edificios: ");
        empleado.setNumEdificio(Integer.parseInt(leer.nextLine()));
        System.out.println("El contrato del empleado es:");
        empleado.setTipo(leer.nextDouble());

        System.out.println("-------------------------------------------");

        DPersonales = empleado.DatosP(empleado);
        System.out.println(DPersonales);
        tEmpleado = empleado.tipoEmpleo();
        System.out.println(tEmpleado);
        System.out.println("-----------Datos del edificio-----------");

        DatosEdificio = empleado.datoEdificio();
        System.out.println(DatosEdificio);

        System.out.println("---------------Datos de Area-----------------");

        datArea = empleado.datArea();
        System.out.println(datArea);

    }

}
