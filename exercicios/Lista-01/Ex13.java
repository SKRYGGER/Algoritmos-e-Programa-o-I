import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Digite três números");
        n1=e.nextInt();
        n2=e.nextInt();
        n3=e.nextInt();
        if (n1<n2&&n2<n3) {
            System.out.println(n1 + ("\n") + n2 + ("\n") + n3);
        } else if (n1<n3&&n3<n2){
            System.out.println(n1+("\n")+n3+ ("\n") +n2);
        } else if (n3<n1&&n1<n2){
            System.out.println(n3+("\n")+n1+ ("\n") +n1);
        } else if (n3<n1&&n2<n3){
            System.out.println(n2+("\n")+n3+ ("\n") +n1);
        } else if (n3<n2&&n2<n1){
            System.out.println(n3+("\n")+n2+ ("\n") +n1);
        }
    }
}