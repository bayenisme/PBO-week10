package week10;

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi (double sisi) {
        this.sisi = sisi;
    }

    void luas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
    void keliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }
}
