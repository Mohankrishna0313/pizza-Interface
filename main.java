
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        impl p = new impl();
        System.out.println("Welcome to pizza hub.");
        System.out.print("Select your pizza(Veg or Non-veg): ");
        String s = sc.next();
        if("veg".equals(s)){
            p.pizza(true);
            while (true) { 
            System.out.println("1.Add Extra cheese\n2.Add extra Topping\n3.Take away\n4.Total bill");
            System.out.print("Select your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    p.cheese();
                    break;
                case 2:
                    p.topping();
                    break;
                case 3:
                    p.takeaway();
                    System.out.println("Please wait Your order will be ready in 5min.!");
                    System.exit(choice);
                case 4:
                    p.bill();
                    System.exit(choice);
                
                }
            }
        }
        else{
            p.pizza(false);
            while (true) { 
            System.out.println("\n\n1.Add Extra cheese\n2.Add extra Topping\n3.Take away");
            System.out.print("Select your choice: ");
            int choice1 = sc.nextInt();
            switch(choice1){
                case 1:
                    p.cheese();
                    break;
                case 2:
                    p.topping();
                    break;
                case 3:
                    p.takeaway();
                    System.out.println("Please wait, Your order will be ready in 5min.!");
                    break;
                case 4:
                    System.exit(choice1);
                }
        }
    }
}
}
