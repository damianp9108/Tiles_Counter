package com.company;

public class Service {
    Podloga podloga = new Podloga();
    Sciana sciana = new Sciana();
    Fuga fuga = new Fuga();
    double polePlytkiPodlogowej = podloga.polePlytkiPodlogowej(podloga.getDlugoscPlytkiPodlogowej(), podloga.getSzerokoscPlytkiPodlogowej(), fuga.getSzerokoscFugi());
    double polePlytkiSciennej = sciana.polePlytkiSciennej(sciana.getDlugoscPlytkiSciennej(), sciana.getSzerokoscPlytkiSciennej(), fuga.getSzerokoscFugi());

    public String method1(double w, double l) {

        double polePodlogi = podloga.polePodlogiWzorKlasyczny(w, l);
        double n = polePodlogi / polePlytkiPodlogowej;
        int liczbaPotrzebnychPlytek = (int) n + 1;
        double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekPodlogowych(liczbaPotrzebnychPlytek);

        return "Liczba potrzebnych płytek podłogowych dla wzoru klasycznego: " + liczbaPotrzebnychPlytek + ". Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek podłogowych dla wzoru klasycznego: " + wagaPotrzebnejFugi + " kg";
    }

    public String method2(double w, double l) {

        double polePodlogi = podloga.polePodlogiWzorKaro(l, w);
        double n = polePodlogi / polePlytkiPodlogowej;
        int liczbaPotrzebnychPlytek = (int) n + 1;
        double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekPodlogowych(liczbaPotrzebnychPlytek);

        return "Liczba potrzebnych płytek podłogowych dla wzoru karo: " + liczbaPotrzebnychPlytek + ". Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek podłogowych dla wzoru karo: " + wagaPotrzebnejFugi + " kg";
    }


    public String method3(double w, double l, double h, int liczbaDrzwi, int liczbaOkien, double wysokoscDrzwi, double szerokoscDrzwi, double wysokoscOkna, double szerokoscOkna) {

        double poleScianBezOtworow = sciana.poleScianBezOtworowWzorKlasyczny(w, l, h);
        double poleScianZotworami = poleScianBezOtworow - sciana.poleWszystkichOtworowSciennych(liczbaDrzwi, liczbaOkien, wysokoscDrzwi, szerokoscDrzwi, wysokoscOkna, szerokoscOkna);

        double n = poleScianZotworami / polePlytkiSciennej;
        int liczbaPotrzebnychPlytek = (int) n + 1;
        double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekSciennych(liczbaPotrzebnychPlytek);

        return "Liczba potrzebnych płytek ściennych dla wzoru klasycznego: " + liczbaPotrzebnychPlytek + ". Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek ściennych dla wzoru klasycznego: " + wagaPotrzebnejFugi + " kg";
    }


    public String method4(double w, double l, double h, int liczbaDrzwi, int liczbaOkien, double wysokoscDrzwi, double szerokoscDrzwi, double wysokoscOkna, double szerokoscOkna) {

        double poleScianBezOtworow = sciana.poleScianBezOtworowWzorKaro(w, l, h);
        double poleScianZotworami = poleScianBezOtworow - sciana.poleWszystkichOtworowSciennych(liczbaDrzwi, liczbaOkien, wysokoscDrzwi, szerokoscDrzwi, wysokoscOkna, szerokoscOkna);
        double n = poleScianZotworami / polePlytkiSciennej;
        int liczbaPotrzebnychPlytek = (int) n + 1;

        double wagaPotrzebnejFugi = fuga.wagaPotrzebnejFugiDlaPlytekSciennych(liczbaPotrzebnychPlytek);

        return "Liczba potrzebnych płytek ściennych dla wzoru karo: " + liczbaPotrzebnychPlytek + ". Waga potrzebnej fugi dla " + liczbaPotrzebnychPlytek + " płytek ściennych dla wzoru karo: " + wagaPotrzebnejFugi + " kg";
    }


}
