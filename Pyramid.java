 import java.util.Scanner;
public class Pyramid{

    public static void main(String[] args) {
       
       
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    String ans="";
    for(int i=0;i<a;i++){
        for(int k=0;k<2;k++){
            for(int j=i;j<a;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    }

}
