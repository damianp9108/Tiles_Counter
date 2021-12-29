package com.company;

public class Sciana {
    private final double dlugoscPlytkiSciennej = 0.5;
    private final double szerokoscPlytkiSciennej = 0.35;

    public double getDlugoscPlytkiSciennej() {
        return dlugoscPlytkiSciennej;
    }

    public double getSzerokoscPlytkiSciennej() {
        return szerokoscPlytkiSciennej;
    }



    public double poleScianBezOtworowWzorKlasyczny(double w, double l, double h){
        return 1.05*(2*w*h + 2*l*h);
    }

    public double poleWszystkichOtworowSciennych(int liczbaDrzwi, int liczbaOkien, double wysokoscDrzwi, double szerokoscDrzwi, double wysokoscOkna, double szerokoscOkna){
        return liczbaDrzwi*wysokoscDrzwi*szerokoscDrzwi + liczbaOkien*wysokoscOkna*szerokoscOkna;
    }

    public double poleScianBezOtworowWzorKaro(double w, double l, double h){
        return 1.1*(2*w*h + 2*l*h);
    }

    public double polePlytkiSciennej(double dlugoscPlytkiSciennej, double szerokoscPlytkiSciennej, double szerokoscFugi){
        return (dlugoscPlytkiSciennej + szerokoscFugi)*(szerokoscPlytkiSciennej + szerokoscFugi);
    }
}
