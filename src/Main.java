import Controlador.ControllerOperaciones;
import Vista.VCalculadora;

public class Main {
    public static void main(String[] args) throws Exception {

        ControllerOperaciones.getInstances();
        VCalculadora calculadora = new VCalculadora();
    }
}