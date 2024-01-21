import java.util.Scanner;

public class Atm{

    private static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cekSaldo();
                    break;
                case 2:
                    System.out.print("Masukan jumlah deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Masukan jumlah penarikan: ");
                    double withdrawalAmount = scanner.nextDouble();
                    tarikTunai(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Terimakasih telah menggunakan ATM. Sampai jumpa lagi!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan opilih lagi.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Deposit");
        System.out.println("3. Tarik Tunai");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Anda:");
    }

    private static void cekSaldo() {
        System.out.println("Saldo anda sekarang: $" + saldo);
    }

    private static void deposit(double amount) {
        saldo += amount;
        System.out.println("Deposit sejumlah $ "  +  amount  + "berhasil. Saldo anda sekarang: $" + saldo);
    }

    private static void tarikTunai(double amount) {
        if (amount <= saldo) {
            saldo -= amount;
            System.out.println("Penarikan sejumlah $ "  +  amount   + "berhasil. Saldo anda sekarang: $" + saldo);
        } else {
            System.out.println("Saldo tidal mencukupi untuk melakukan penarikan sejumlah $" + amount);
        }
    }
}
