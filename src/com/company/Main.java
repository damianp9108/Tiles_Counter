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
            System.out.println("Prosze podac dlugosc pomieszczenia w metrach");

            try {
                l = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (shouldContinue) {
            System.out.println("Prosze podac szerokosc pomieszczenia w metrach");

            try {
                w = Double.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Prosze podac wysokosc pomieszczenia w metrach");

            try {
                h = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }



        while (shouldContinue) {
            System.out.println("Prosze podac liczbe otworow drzwiowych");

            try {
                liczbaDrzwi = Integer.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Prosze podac liczbe otworow okiennych");

            try {
                liczbaOkien = Integer.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }



        while (shouldContinue) {
            System.out.println("Prosze podac wysokosc otworu drzwiowego w metrach");

            try {
                wysokoscDrzwi = Double.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Prosze podac szerokosc otworu drzwiowego w metrach");

            try {
                szerokoscDrzwi = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (shouldContinue) {
            System.out.println("Prosze podac wysokosc otworu okiennego w metrach");

            try {
                wysokoscOkna = Double.valueOf(scanner.nextLine());
                shouldContinue = false;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }

        while (!shouldContinue) {
            System.out.println("Prosze podac szerokosc otworu okiennego w metrach");

            try {
                szerokoscOkna = Double.valueOf(scanner.nextLine());
                shouldContinue = true;
            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }
        }


        while (userWantChoose) {
            System.out.println();
            System.out.println("Wymiary plytki podlogowej: 50 cm x 50 cm");
            System.out.println("Wymiary plytki sciennej: 50 cm x 35 cm");
            System.out.println("Szerokosc fugi: 0.6 cm");
            System.out.println("Wysokosc fugi: 1 cm");
            System.out.println("Waga fugi dla 1 dm3: 2 kg");
            System.out.println();
            System.out.println("Wybierz opcje (Wpisz cyfre 1-5)");
            System.out.println("1. Oblicz ilosc potrzebnych plytek podlogowych oraz wage potrzebnej fugi dla wzoru klasycznego");
            System.out.println("2. Oblicz ilosc potrzebnych plytek podlogowych oraz wage potrzebnej fugi dla wzoru karo");
            System.out.println("3. Oblicz ilosc potrzebnych plytek sciennych oraz wage potrzebnej fugi dla wzoru klasycznego");
            System.out.println("4. Oblicz ilosc potrzebnych plytek sciennych oraz wage potrzebnej fugi dla wzoru karo");
            System.out.println("5. Wyjscie");
            System.out.println();


            try {
                userChoise = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("To nie jest liczba!");
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
