public class Denda {
    private static final int TARIF_DENDA = 10000;
    private int hariTerlambat;

    public Denda(int hariTerlambat) {
        this.hariTerlambat = hariTerlambat;
    }

    public int getHariTerlambat() {
        return hariTerlambat;
    }

    public int getTagihan() {
        return TARIF_DENDA * hariTerlambat;
    }

    public void addAntiDenda() {
        this.hariTerlambat = 0;
    }
}
