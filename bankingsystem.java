import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class bank{
    private Map<String,Double>accounts;
    //constructors to initialise bank account map
    public bank(){
        accounts=new HashMap<>();
    }
    //method to crete new account with initial balance
    public void createaccount(String accountnumber, double initialbalance){
        if (!accounts.containsKey(accountnumber)) {
            accounts.put(accountnumber, initialbalance);
            System.err.println("account created succesfully");
        }
        else{
            System.out.println("account already exist");
        }
    }

    public void deposit(String accountnumber,double amount){
        if (accounts.containsKey(accountnumber)) {
            double currentbalance=accounts.get(accountnumber);
            accounts.put(accountnumber, currentbalance + amount);
            System.out.println("amount credited successfully, New balance :"+accounts.get(accountnumber));
        }
        else{
            System.out.println("account not gound");
        }
    }
    public void withdraw(String accountnumber, double amount){
        if (accounts.containsKey(accountnumber)) {
            double currentbalance=accounts.get(accountnumber);
            if (currentbalance>=amount) {
                accounts.put(accountnumber, currentbalance - amount);
                System.out.println("withdrawl succesfully "+ accounts.get(accountnumber));
            }else{
                System.out.println("insufficient fund");
            }
        }else{
            System.out.println("account not found");
        }
    }
    //method to get balance in account 
    public double getbalance(String accountnumber){
        return accounts.getOrDefault(accountnumber, 0.0);
    }
}
public class bankingsystem {
    public static void main(String[] args) {
        bank b1=new bank();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            //display the options to the user
            System.out.println("\n1.create account \n2.Deposit \n3.Withdraw\n4. check balance\n5. exit");
            System.err.println("choose an option");
            //read the users choice 
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice ) {
                case 1:
                //create an account 
                System.out.println("enter the accounnumber\n");
                String accountnumber=scanner.nextLine();
                System.out.println("enter initial balance");
                double initialbalance=scanner.nextDouble();
                b1.createaccount(accountnumber,initialbalance);    
                    break;

                case 2:
                //deposit money into account 
                System.out.println("enter the amount ");
                accountnumber=scanner.nextLine();
                System.out.println("enter the deposit ammount ");
                double depositamount=scanner.nextDouble();
                b1.deposit(accountnumber, depositamount);
                    break;

                case 3:
                //withdraw the amount 
                System.out.println("enter the accountnumber");
                accountnumber=scanner.nextLine();
                System.out.println("enter the withdrawl amount");
                double withdrwalamount=scanner.nextDouble();
                b1.withdraw(accountnumber, withdrwalamount);
                   break;

                case 4:
                //check balance of an account
                System.out.print("Enter account number: ");
                    accountnumber = scanner.nextLine();
                    System.out.println("Current balance: " + b1.getbalance(accountnumber));
                    break;

                case 5:
                // Exit the program
                System.out.println("Exiting the banking system. Goodbye!");
                System.exit(0);
                
                default:
                    break;
            }
            
        }
        
    }
}
