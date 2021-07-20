import java.util.Scanner;
import java.io.IOException;
public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất");
        int a = sc.nextInt();
        System.out.println("nHẬP VÀO cạnh thứ hai");
        int b = sc.nextInt();
        System.out.println("Nhập vào cạnh thứ 3");
        int c = sc.nextInt();
        try{
            if(a>0&&b>0&&c>0){
                if((a+b>c)&&(b+c>a)&&(c+a>b)){
                    System.out.println("Đây là 3 cạnh của tam giác");
                }
            }

        }catch (ExceptionInInitializerError  e){
            System.out.println("không phải ba cạnh tam giác");
        }
    }


}
