import java.util.*;


class ATMMachine{
    float Balance;
    int PIN=2506;

    public void checkpin(){
        System.out.print("Enter the PIN:");
        Scanner s=new Scanner(System.in);
        int enterpin=s.nextInt();
        if(enterpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid PIN:");
        } 


    } 
    
    
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Chech A/C  choice:");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            Withdrawmoney();

        }
        else if(opt==3){
            Depositmoney();

        }
        else if (opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice:");
        }


    }


    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }


    public void Withdrawmoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance: ");

        }
        else{
            Balance-=amount;
            System.out.println("Money Withdrawal Successful ");
        }
        menu(); 
    }


    public void Depositmoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}




public class ATM{
    public static void main(String[] args0){


        ATMMachine obj=new ATMMachine();
        obj.checkpin();

    }
}