import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

class bank_account{
    static String bname="ICIC Bank";
    private int balance;
    String accountholder;
    private int password;
    bank_account(){
        System.out.println("Welcome To ICIC Bank");
        service();
    }
    bank_account(String ac,int pass){
        this.accountholder=ac;
        this.password = pass;
    }

    public void check(int pass){
        if (pass==password){
            System.out.println("Your current balance is"+ balance);
        }
        else{
            System.out.println("Please enter the correct password");
        }
    }
    public void service(){
        System.out.println("How can we help you ?");
        System.out.println("1. Check Balance ");
        System.out.println("2. Withdraw amnt");
        System.out.println("3. Debit amnt");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        if (input.equals("1")){
            int pass = sc.nextInt();
            check(pass);
        }
        else if(input.equals("2")){
            int amnt = sc.nextInt();
            withdraw(amnt);
        }
        else{
            int amnt = sc.nextInt();
            debit(amnt);
        }
        sc.close();
    }
    public void withdraw(int amnt){
        balance=balance-amnt;
        System.out.println("The amount is updated");
    }
    public void debit(int amnt){
        balance=balance+amnt;
        System.out.println("The amount is updated");
    }

}
public String reverse(String str){
    char ch[]=str.toCharArray();
    int n=ch.length;
    int i=0;
    int j=n-1;
    while (i<j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i++;j--;
    }
}
public void palindrome(String str){
    char ch[]=str.toCharArray();
    int j=ch.length-1;
    int i=0;
    int found=0;
    while (i<j){
        if (ch[i]==ch[j]){
            found=1;
            continue;
        }
        else{
            found=0;
            break;
        }
    }
    if (found==0){
        System.out.println("No");
    }
    else{
        System.out.println("Yes");
    }
}

public class prac {
    public static void main(String[] args){
        bank_account b1 = new bank_account("Kashvi", 128933);
        
    }
}
