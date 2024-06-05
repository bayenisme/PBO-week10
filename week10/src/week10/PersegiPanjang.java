package week10;

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }

    void keliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}