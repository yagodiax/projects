package ex5;

import java.util.Scanner;

public class ConsumoMedioCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas viagens foram feitas? ");
        int viagens = sc.nextInt();

        double somaConsumo = 0;

        for (int i = 1; i <= viagens; i++) {
            System.out.println("Viagem " + i + ":");
            System.out.print("  Litros de combustível: ");
            double litros = sc.nextDouble();
            System.out.print("  Distância percorrida (km): ");
            double km = sc.nextDouble();

            if (litros > 0) {
                somaConsumo += (km / litros);
            }
        }

        double media = somaConsumo / viagens;
        System.out.println("Consumo médio (km/l): " + media);
    }
}
