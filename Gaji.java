//Membuat subclass (turunan dari class Pegawai)
public class Gaji extends Pegawai {  //POLIMORFISME 

    private double salary;

    public Gaji(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {  //Overriding (pendefinisian ulang method mailCheck() oleh subclass Gaji)
        System.out.println("Memeriksa Kelas Gaji dalam Surat "); //UPCASTING (karena method pada class Gaji ini tidak bereferensi pada superclass Pegawai)
        System.out.println("Surat Tertuju Untuk " + getName() + "dengan gaji " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computerPay() {
        System.out.println("Menghitung Pembayaran Gaji Untuk " + getName());
        return salary / 52;
    }

}
