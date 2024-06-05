package week10;

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    void luas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
    }
    
    void keliling() {
        double keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling Segitiga: " + keliling);
    }
}