package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean shouldContinue = false;
        boolean userWantChoose = true;
        double l = 0;
        double w = 0;
        double h = 0;
        int liczbaDrzwi = 0;
        int liczbaOkien = 0;
        double wysokoscDrzwi = 0;
        double szerokoscDrzwi = 0;
        double wysokoscOkna = 0;
        double szerokoscOkna = 0;
        int userChoise = 0;
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();



        while (!shouldContinue) {
            System.out.println("Proszę podać długość pomieszczenia w metrach");

            try {
                l = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (shouldContinue) {
            System.out.println("Proszę podać szerokość pomieszczenia w metrach");

            try {
                w = Double.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Proszę podać wysokość pomieszczenia w metrach");

            try {
                h = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }



        while (shouldContinue) {
            System.out.println("Proszę podać liczbę otworów drzwiowych");

            try {
                liczbaDrzwi = Integer.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Proszę podać liczbę otworów okiennych");

            try {
                liczbaOkien = Integer.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }



        while (shouldContinue) {
            System.out.println("Proszę podać wysokość otworu drzwiowego w metrach");

            try {
                wysokoscDrzwi = Double.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Proszę podać szerokość otworu drzwiowego w metrach");

            try {
                szerokoscDrzwi = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (shouldContinue) {
            System.out.println("Proszę podać wysokość otworu okiennego w metrach");

            try {
                wysokoscOkna = Double.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Proszę podać szerokość otworu okiennego w metrach");

            try {
                szerokoscOkna = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }


        while (userWantChoose) {
            System.out.println();
            System.out.println("Wymiary płytki podłogowej: 50 cm x 50 cm");
            System.out.println("Wymiary płytki ściennej: 50 cm x 35 cm");
            System.out.println("Szerokość fugi: 0.6 cm");
            System.out.println("Wysokość fugi: 1 cm");
            System.out.println("Waga fugi dla 1 dm3: 2 kg");
            System.out.println();
            System.out.println("Wybierz opcję:");
            System.out.println("1. Oblicz ilość potrzebnych płytek podłogowych oraz wagę potrzebnej fugi dla wzoru klasycznego");
            System.out.println("2. Oblicz ilość potrzebnych płytek podłogowych oraz wagę potrzebnej fugi dla wzoru karo");
            System.out.println("3. Oblicz ilość potrzebnych płytek ściennych oraz wagę potrzebnej fugi dla wzoru klasycznego");
            System.out.println("4. Oblicz ilość potrzebnych płytek ściennych oraz wagę potrzebnej fugi dla wzoru karo");
            System.out.println("5. Wyjście");
            System.out.println();


            try {
                userChoise = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("To nie jest liczba");
            }


            if (userChoise < 1 || userChoise > 5) {
                System.out.println("Podaj cyfre od 1 do 5!");
            } else {
                switch (userChoise) {
                    case 1 -> System.out.println(service.method1(w, l));
                    case 2 -> System.out.println(service.method2(w, l));
                    case 3 -> System.out.println(service.method3(w, l, h, liczbaDrzwi, liczbaOkien, wysokoscDrzwi, szerokoscDrzwi, wysokoscOkna, szerokoscOkna));
                    case 4 -> System.out.println(service.method4(w, l, h, liczbaDrzwi, liczbaOkien, wysokoscDrzwi, szerokoscDrzwi, wysokoscOkna, szerokoscOkna));
                    case 5 -> userWantChoose = false;
                }


            }

        }


    }
}
