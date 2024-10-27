package membuatobjekpertama;

public class Mobil {
    String warna;
    String merek;
    int KecepatanMaks;

    // Konstruktor adalah method yang pertama kali dipanggil pada saat pembuatan objek
    public Mobil(String warna, String merek, int KecepatanMaks){
        this.warna = warna;
        this.merek = merek;
        this.KecepatanMaks = KecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("Mobil Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maks: " + KecepatanMaks);
    }

    public void berjalan(){
        System.out.println("Mobil " + merek + " sedang berjalan");
    }
    public void berhenti(){
        System.out.println("Mobil " + merek + " sedang berhenti");
    }
}
