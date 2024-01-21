class Hewan {
    String jenis;

//    Kostruktor kelas dasar
    public Hewan(String jenis) {this.jenis = jenis;}

//    Metode kelas dasar
    void bersuara() {System.out.println("Sebuah hewan bersuara: ");}
}

class Kucing extends Hewan {
//    Konstruksi kelas turunan
    public Kucing(String jenis) {super(jenis);}; //Memanggil kosntruktor kelas dasar]

    //metode kelas turunan yang meng-overide metode kelas dasar

    @Override
    void bersuara() {System.out.println("Meow");}

    //metode kelas turunan tambahan
    void tidur() {System.out.println("Kucing Tidur...");}
    }

    class ContohPewarisan {
        public static void main(String[] args) {
            //membuat objek dari turunan
            Kucing kucing = new Kucing("persia");

            //mengakses atribut dari kelas dasar
            System.out.println("Jenis Kucing: " + kucing.jenis);

            //memanggil metode dari kelas turunan yang meng-overide metode kelas dasar
            kucing.bersuara();

            //memanggil metode tambahan dari kelsa turunan
            kucing.tidur();
        }
    }
