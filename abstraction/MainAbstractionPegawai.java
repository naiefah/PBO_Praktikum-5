package abstraction;

public class MainAbstractionPegawai {
    public static void main(String[] args) {
        Pegawai p1 = new PegawaiTetap("Naiefah", "P001", 5000000);
        Pegawai p2 = new PegawaiHonorer("Fian", "P002", 25000, 120);

        System.out.println("Nama: " + p1.nama + " | Gaji: Rp " + p1.hitungGaji());
        System.out.println("Nama: " + p2.nama + " | Gaji: Rp " + p2.hitungGaji());
    }
}