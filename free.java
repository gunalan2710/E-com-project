import java.util.Scanner;

class free{
     
public static void main(String[] args) {
    // for(int i=0;i<=10;i=i+2){
    //     // if(i%2==0){
    //     //     System.out.println(i);
    //     // }
    //     System.out.println(i);
        
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("num1");
    int a = scanner.nextInt();
    System.out.println("num2");
    int b= scanner.nextInt();

    for(int i=a;i<=b;i++){
        System.out.println(i);
    }

    
}
}