package week10;

class Lingkaran extends BangunDatar {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    void luas() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    void keliling() {
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}