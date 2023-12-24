import java.util.Scanner;
public class Greater_Number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
       int a = sc.nextInt();
        System.out.println("Enter B value:");
       int b = sc.nextInt();
        System.out.println("Enter C value:");
       int c=sc.nextInt();
       if(a<0 || b<0 || c <0){
           System.out.println("Negative number");
       }
       else if(a>b && a>c){
             System.out.println("a is greater:"+a);
       }
       else if(b>a && b>c){
              System.out.println("B is greater:"+b);
       }
       else if(c>a && c>b){
           System.out.println("C is greater:"+c);
       }
       else if(a==b && b==c && c==a){
           System.out.println("all are same");
       }
       else if(a==b && (a>c && b>c)){
           System.out.println("A and B are greater");
       }
       else if(b==c && (b>a && c>a)){
           System.out.println("B and C are greater");
       }
       else if(c==a && (c>b && a>b)){
           System.out.println("C and A are Greater");
       }   
}
}
