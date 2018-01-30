package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.10​. Sukurti skaičiuotuvo klasę, kurioje realizuoti statinius metodus sumai, skirtumui,
        // sandaugai. Per parametrus bus naudojami sveiko tipo skaičiai.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pirmaji skaiciu: ");
        int sk1 = sc.nextInt();
        System.out.println("Iveskite antraji skaiciu: ");
        int sk2 = sc.nextInt();
        Veiksmai.suma(sk1, sk2);
        Veiksmai.skirtumas(sk1, sk2);
        Veiksmai.sandauga(sk1, sk2);

    }
}
