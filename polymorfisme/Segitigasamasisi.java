package polymorfisme;

public class Segitigasamasisi extends BangunDatar{
    private double sisi;
    private double tinggi;

    public Segitigasamasisi(final double sisi, final double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * sisi * tinggi;
    }

    @Override
    public double keliling() {
        return 3 * sisi;
    }
}
