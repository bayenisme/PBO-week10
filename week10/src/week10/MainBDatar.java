package week10;

public class MainBDatar {
    public static void main(String[] args) {
        BangunDatar persegi = new Persegi(6);
        BangunDatar persegiPanjang = new PersegiPanjang(8, 10);
        BangunDatar lingkaran = new Lingkaran(10);
        BangunDatar segitiga = new Segitiga(5, 10, 3, 4, 5);

        persegi.luas();
        persegi.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        segitiga.luas(); 
        segitiga.keliling();
    }
}