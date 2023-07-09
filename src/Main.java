import Controlador.ControllerOperaciones;
import Vista.VCalculadora;

public class Main {
    public static void main(String[] args) throws Exception {

        ControllerOperaciones.getInstances();
        new VCalculadora();
    }
}