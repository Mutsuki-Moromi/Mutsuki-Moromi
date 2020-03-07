import java.util.Scanner;

public class taskprts  {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("数字を入力してください：");
        int n = stdIn.nextInt();

        int keta = 0;
        while(n > 0){
            keta ++;
            n = n / 10;
        }
        System.out.println("桁数：" + keta);

    }
}
