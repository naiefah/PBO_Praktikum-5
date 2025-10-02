package polymorph.overriding;

class Kucing extends Hewan {
    // atribut tambahan
    String jenis = "Anggora";

    @Override
    void suara() {
        System.out.println("Meong...");
    }
}