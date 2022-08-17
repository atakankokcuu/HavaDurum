import java.util.Scanner;

public class hava {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("hava durumunu girin");
        int a=scanner.nextInt();
        if(a<5){
            System.out.print("kayak yapabilirsin");

        } else if (a>=5 && a<25) {
            System.out.print("piknik yapabilriisn");


        } else if (a>=25) {
            System.out.print("yüzmeye gidebilirsin");
        }


    }
}
