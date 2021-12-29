package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean shouldContinue = false;
        double l = 0;
        double w = 0;
        double h = 0;
        int liczbaDrzwi = 0;
        int liczbaOkien = 0;
        double wysokoscDrzwi = 0;
        double szerokoscDrzwi = 0;
        double wysokoscOkna = 0;
        double szerokoscOkna = 0;
        int wzorPodlogi = 0;
        int wzorSciany = 0;
        Scanner scanner = new Scanner(System.in);
        Podloga podloga = new Podloga();
        Sciana sciana = new Sciana();
        Fuga fuga = new Fuga();


        // Pobranie wymiarów pomieszczenia od użytkownika.

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


        // Pobranie od uzytkownika liczby okien i drzwi

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

        // Pobranie od użytkownika wymiarów okien i drzwi.

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

        while (shouldContinue) {
            System.out.println("Proszę wybrać wzór ułożenia płytek dla podłogi. Wpisz '1' dla wzoru klasyczego lub '2' dla wzoru karo");
            try {
                wzorPodlogi = Integer.valueOf(scanner.nextLine());
                if (wzorPodlogi != 1 && wzorPodlogi != 2) {
                    System.out.println("Masz tylko dwie cyfry do wyboru!");
                } else shouldContinue = false;

            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }

        }

        while (!shouldContinue) {
            System.out.println("Proszę wybrać wzór ułożenia płytek dla ścian. Wpisz '1' dla wzoru klasyczego lub '2' dla wzoru karo");
            try {
                wzorSciany = Integer.valueOf(scanner.nextLine());
                if (wzorSciany != 1 && wzorSciany != 2) {
                    System.out.println("Masz tylko dwie cyfry do wyboru!");
                } else shouldContinue = true;

            } catch (NumberFormatException exception) {
                System.out.println("Niepoprawne dane");
            }

        }

        double polePlytkiPodlogowej = podloga.polePlytkiPodlogowej(podloga.getDlugoscPlytkiPodlogowej(), podloga.getSzerokoscPlytkiPodlogowej(), fuga.getSzerokoscFugi());

        if (wzorPodlogi == 1) {
            double polePodlogi = podloga.polePodlogiWzorKlasyczny(l, w);
            double n = polePodlogi / polePlytkiPodlogowej;
            int liczbaPotrzebnychPlytek = (int) n + 1;

            System.out.println();
            System.out.println("Liczba potrzebnych płytek podłogowych dla wzoru klasycznego: " + liczbaPotrzebnychPlytek);
            double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekPodlogowych(liczbaPotrzebnychPlytek);
            System.out.println("Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek podłogowych dla wzoru klasycznego: " + wagaPotrzebnejFugi + " kg");
            System.out.println();

        } else if (wzorPodlogi == 2) {
            double polePodlogi = podloga.polePodlogiWzorKaro(l, w);
            double n = polePodlogi / polePlytkiPodlogowej;
            int liczbaPotrzebnychPlytek = (int) n + 1;

            System.out.println();
            System.out.println("Liczba potrzebnych płytek podłogowych dla wzoru karo: " + liczbaPotrzebnychPlytek);
            double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekPodlogowych(liczbaPotrzebnychPlytek);
            System.out.println("Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek podłogowych dla wzoru karo: " + wagaPotrzebnejFugi + " kg");
            System.out.println();
        }

        double polePlytkiSciennej = sciana.polePlytkiSciennej(sciana.getDlugoscPlytkiSciennej(), sciana.getSzerokoscPlytkiSciennej(), fuga.getSzerokoscFugi());
        double poleWszystkichOtworowSciennych = sciana.poleWszystkichOtworowSciennych(liczbaDrzwi, liczbaOkien, wysokoscDrzwi, szerokoscDrzwi, wysokoscOkna, szerokoscOkna);

        if (wzorSciany == 1) {
            double poleScianBezOtworow = sciana.poleScianBezOtworowWzorKlasyczny(w, l, h);
            double poleScianZotworami = poleScianBezOtworow - poleWszystkichOtworowSciennych;

            double n = poleScianZotworami / polePlytkiSciennej;
            int liczbaPotrzebnychPlytek = (int) n + 1;

            System.out.println("Liczba potrzebnych płytek ściennych dla wzoru klasycznego: " + liczbaPotrzebnychPlytek);
            double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekSciennych(liczbaPotrzebnychPlytek);
            System.out.println("Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek ściennych dla wzoru klasycznego: " + wagaPotrzebnejFugi + " kg");

        } else if (wzorSciany == 2) {
            double poleScianBezOtworow = sciana.poleScianBezOtworowWzorKaro(w, l, h);
            double poleScianZotworami = poleScianBezOtworow - poleWszystkichOtworowSciennych;
            double n = poleScianZotworami / polePlytkiSciennej;
            int liczbaPotrzebnychPlytek = (int) n + 1;

            System.out.println("Liczba potrzebnych płytek ściennych dla wzoru karo: " + liczbaPotrzebnychPlytek);
            double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekSciennych(liczbaPotrzebnychPlytek);
            System.out.println("Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek ściennych dla wzoru karo: " + wagaPotrzebnejFugi + " kg");
        }


    }
}
