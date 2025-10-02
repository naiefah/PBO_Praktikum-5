package abstraction;

class PegawaiHonorer extends Pegawai {
    double upahPerJam;
    int jumlahJamKerja;

    PegawaiHonorer(String nama, String id, double upahPerJam, int jumlahJamKerja) {
        this.nama = nama;
        this.idPegawai = id;
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    double hitungGaji() {
        return upahPerJam * jumlahJamKerja;
    }
}