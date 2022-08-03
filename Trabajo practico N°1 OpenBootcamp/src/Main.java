public class Main {
    public static void main(String[] args) {
        suma(1, 2, 3);

        Coche fiat = new Coche();

        fiat.añadirpuerta();
        System.out.println("El numero de puertas es: " + fiat.puertas);
    }

    public static void suma(int a, int b, int c) {

        System.out.println(a + b + c);
    }
}
    class Coche {
        public int puertas = 4;

        public void añadirpuerta() {
            this.puertas++;

        }
    }






