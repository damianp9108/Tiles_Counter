package com.company;

public class Fuga {
    private final double szerokoscFugi = 0.006;
    private final double wysokoscFugi = 0.01;
    private final double wagaFugiDla1dm3 = 2;
    Podloga podloga = new Podloga();
    Sciana sciana = new Sciana();

    public double getSzerokoscFugi() {
        return szerokoscFugi;
    }



    public double objetoscFugiDlaPlytkiPodlogowej(double dlugoscPlytkiPodlogowej, double szerokoscPlytkiPodlogowej, double szerokoscFugi, double wysokoscFugi){
        return (dlugoscPlytkiPodlogowej*szerokoscFugi*wysokoscFugi) + (szerokoscPlytkiPodlogowej*szerokoscFugi*wysokoscFugi);
    }

    public double objetoscFugiDlaPlytkiSciennej(double dlugoscPlytkiSciennej, double szerokoscPlytkiSciennej, double szerokoscFugi, double wysokoscFugi){
        return (dlugoscPlytkiSciennej*szerokoscFugi*wysokoscFugi) + (szerokoscPlytkiSciennej*szerokoscFugi*wysokoscFugi);
    }

    public double wagaPotrzebnejFugiDlaPlytekPodlogowych(int liczbaPotrzebnychPlytek){
        double objetoscFugiDlaWszystkichPlytek = liczbaPotrzebnychPlytek * objetoscFugiDlaPlytkiPodlogowej(podloga.getDlugoscPlytkiPodlogowej(), podloga.getSzerokoscPlytkiPodlogowej(), szerokoscFugi, wysokoscFugi);
        double objetoscFugiDlaWszystkichPlytekWdm3 = objetoscFugiDlaWszystkichPlytek * 1000;
        return objetoscFugiDlaWszystkichPlytekWdm3 * wagaFugiDla1dm3;
    }

    public double wagaPotrzebnejFugiDlaPlytekSciennych(int liczbaPotrzebnychPlytek){
        double objetoscFugiDlaWszystkichPlytek = liczbaPotrzebnychPlytek * objetoscFugiDlaPlytkiSciennej(sciana.getDlugoscPlytkiSciennej(), sciana.getSzerokoscPlytkiSciennej(), szerokoscFugi, wysokoscFugi);
        double objetoscFugiDlaWszystkichPlytekWdm3 = objetoscFugiDlaWszystkichPlytek * 1000;
        return objetoscFugiDlaWszystkichPlytekWdm3 * wagaFugiDla1dm3;
    }
}
