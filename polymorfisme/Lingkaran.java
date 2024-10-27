package polymorfisme;

import abstraksi.Main;

public class Lingkaran extends BangunDatar{
    private double jarijari;

    public Lingkaran(final double jarijari){
        this.jarijari = jarijari;
    }

    @Override
    public double luas() {
        return Math.PI * jarijari * jarijari;
    }

    @Override
    public double keliling() {
        return Math.PI * jarijari;
    }
}
