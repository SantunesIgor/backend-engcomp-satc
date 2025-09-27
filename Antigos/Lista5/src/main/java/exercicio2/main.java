package exercicio2;

import java.util.*;

public class main {
    public static void main(String[] args) {
        List<barco> barcos = Arrays.asList(
                new barco("Barco 1", 2),
                new barco("Barco 2", 5),
                new barco("Barco 3", 7),
                new barco("Barco 4", 12),
                new barco("Barco 5", 20)
        );

        portoPequeno pequeno = new portoPequeno("porto pequeno");
        portoGrande grande = new portoGrande("porto grande");

        for (barco b : barcos) {
            if (!pequeno.atracarBarco(b)) {
                grande.atracarBarco(b);
            }
        }
    }
}

