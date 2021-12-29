package com.company;

public class Podloga {

    private final double dlugoscPlytkiPodlogowej = 0.5;
    private final double szerokoscPlytkiPodlogowej = 0.5;


    public double getDlugoscPlytkiPodlogowej() {
        return dlugoscPlytkiPodlogowej;
    }

    public double getSzerokoscPlytkiPodlogowej() {
        return szerokoscPlytkiPodlogowej;
    }



    public double polePodlogiWzorKlasyczny(double l, double w){
        return 1.05*l*w;
    }

    public double polePlytkiPodlogowej(double dlugoscPlytkiPodlogowej, double szerokoscPlytkiPodlogowej, double szerokoscFugi){
        return (dlugoscPlytkiPodlogowej + szerokoscFugi)*(szerokoscPlytkiPodlogowej + szerokoscFugi);
    }

    public double polePodlogiWzorKaro(double l, double w){
        return 1.1*l*w;
    }



}
