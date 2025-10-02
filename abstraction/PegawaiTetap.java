package abstraction;

class PegawaiTetap extends Pegawai {
    double gajiBulanan;

    PegawaiTetap(String nama, String id, double gajiBulanan) {
        this.nama = nama;
        this.idPegawai = id;
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    double hitungGaji() {
        return gajiBulanan;
    }
}
