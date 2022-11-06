//Membuat class VirtualDemo untuk mengetes class-class yang telah dibuat
public class VirtualDemo { 
    public static void main(String[] args) {
        
        Gaji s = new Gaji("Wahyu ", "KUBAR ", 3, 5000.00); //Membuat objek Gaji (POLIMORFISME)
        Pegawai e = new Gaji("Ini Nama ", "Samarinda ", 2, 2500.00); //Membuat objek Gaji kedua (POLIMORFISME)
        
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}

        // Polimorfisme terdapat pada objek Gaji, yang mana terdiri dari 2 objek gaji. 
        // Pertama, menggunakan referensi Gaji dan yang kedua menggunakan referensi Pegawai e
