import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result = 0;
        System.out.println("------------------------------");
        System.out.println("Program kalkulator sederhana");
        System.out.println("------------------------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Pekalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("------------------------------");

        // input data
        System.out.print("Masukkan angka pertama: ");
        numbers1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        numbers2 = input.nextInt();

        // pilihan operasi kalkulator
        System.out.print("Masukkan operasi : ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = Addition.add(numbers1, numbers2);
                break;
            case 2:
                result = Subtraction.subtract(numbers1, numbers2);
                break;
            case 3:
                result = Division.divide(numbers1, numbers2);
                break;
            case 4:
                result = Multiplication.multiply(numbers1, numbers2);
                break;
            case 5:
                result = Modulus.modulus(numbers1, numbers2);
                break;
            default:
                System.out.println("Salah memasukkan pilihan");
        }

        System.out.println("Hasil :" + result);
        input.close();
    }
}
