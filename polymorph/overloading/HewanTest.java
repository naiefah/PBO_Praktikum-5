public class HewanTest {
    
    public static void main(String[] args) {
        //instansiasi class kucing garong
        Kucing kucing1 = new Kucing(3 );
        kucing1.berkomunikasi();

        Hewan hewan1 = new Hewan("alda ");
        hewan1.berkomunikasi();

        Hewan hewan2 = new Hewan("Bunga ", 10 );
        hewan2.berkomunikasi();

        Hewan hewan3 = new Hewan(1 , "Kelinci ");
        hewan3.berkomunikasi();

        Hewan hewan4 = new Hewan(90000 );
        hewan4.berkomunikasi();
    }
}
