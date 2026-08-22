import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.temporal.ChronoUnit;
public class parking {
    class parking_app{
        static String appname="Parking +";
        HashMap<Integer, String> vehicles = new HashMap<>();
        private int vnumber;
        String vtype;
        static int tslots=2000;
        int occupied=0;
        class slots{
            int slotno,floor,occupied;
            LocalTime ct; //current time
        }
        parking_app(){
            System.out.println("Welcome To "+ parking_app.appname);
            System.out.println("====Main Menu====");
            System.out.println("1. Show Parking Status");
            System.out.println("2. Park Vehicle");
            System.out.println("3. Remove Vehicle");
            System.out.println("4. Search Vehicle");
            System.out.println("5. Show Available Slots");
            System.out.println("6. Exit");
            Scanner sc=new Scanner (System.in);
            int choice=sc.nextInt();
            if (choice==1){
                show();
            }
            else if(choice==2){
                park();
            }
            else if (choice==3){
                remove();
            }
            else if (choice==4){
                search();
            }
            else if (choice==5){
                slots();
            }
            else{
                System.out.println("Thank You");
            }
        }

        public void show(){
            System.out.println("There are currently "+ tslots);
            System.out.println("The occupied slots are"+ occupied);
            int available=tslots-occupied;
            System.out.println("The available slots are"+ available);
            System.out.println("Do you want to continue ? ");
            Scanner sc=new Scanner(System.in);
            String ch=sc.next();
            if (ch.equals("Yes")){
                new parking_app();
            }
            else{
                System.out.println("ThankYou");
            }
        }
        public void park(){
            System.out.println("Enter the vehicle details");
            Scanner sc=new Scanner(System.in);
            System.out.println("Vehicle Type: ");
            this.vtype=sc.next();
            System.out.println("Vehicle Number: ");
            this.vnumber=sc.nextInt();
            vehicles.put(vnumber, vtype);
        }
    }

    public static void main(String arg[]){

    }
}