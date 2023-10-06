import java.util.Random;

public class parcial_2 {
    public static void main(String[] args) {

        Random random = new Random();

        double halogena = 0.25;
        double led = 0.50;
        double multiled = 1;

        // random.nextInt(23);
        int nro_hoteles = random.nextInt(1, 7);

        // declarar
        int tipo_luz[] = new int[nro_hoteles];
        int cantidadHoras[] = new int[nro_hoteles];
        int cantidadPisos[] = new int[nro_hoteles];

        // llenar arreglos
        for (int i = 0; i < nro_hoteles; i++) {
            tipo_luz[i] = tipo_luz[random.nextInt(3)]; //
            cantidadHoras[i] = random.nextInt(24);
            cantidadPisos[i] = random.nextInt(3, 15);
        }

        // recorrer arreglos
        for (int i = 0; i < nro_hoteles; i++) {
            if (tipo_luz[i] == 0) {
                System.out.println("hotel " + (i+1));
                System.out.println("La cantidad de horas encendidas es " + cantidadHoras[i]);
                int calculoGasto = (int) (((cantidadHoras[i] * halogena) * (3 * cantidadPisos[i])));
                System.out.println("La cantidad de gastos del hotel " + (i+1) + " Es de " + calculoGasto);
            }

        }
    }
}
