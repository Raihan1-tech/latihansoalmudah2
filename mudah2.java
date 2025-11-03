import java.util.Scanner;

public class mudah2 {
    public static void main(String[] args) {
    double angka;
        Scanner input = new Scanner (System.in);
        System.out.println("masukkan angka :");
          angka = input.nextDouble();
        if (angka % 2 == 0){
            System.out.println("angka"+angka+"adalah bilangan genap");
           }else{
            System.out.println("angka"+angka+"adalah bilangan ganjil");
          }
       }
    }
