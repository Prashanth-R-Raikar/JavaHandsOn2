
package com.cognizant;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class HomePage {
static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
do {
System.out.println("Select the Options below :");
System.out.println(
" 1. Register – registers a customer \n 2. Book – Book a room \n 3. Check Status – check for the rooms present status \n 4. Email – Change/update an email address of the customer \n "
+ "5. All Bookings in a particular date \n 6. All customers details \n 7. Exit \n");
int option = scanner.nextInt();
switch (option) {
case 1:
break;
case 2:
break;
case 3:
break;
case 4:
break;
case 5:
break;
case 6:
break;
case 7:
break;
}System.out.println("Do you want to Continue 1. Yes \t 2. No");
}while (scanner.nextInt() == 1);
}
static Associates inputMet() throws ParseException {
System.out.println("Enter Associates Details :");
System.out.print("ID :");
int id = scanner.nextInt();
System.out.println("Name : ");
String name = scanner.next();
System.out.println("Email : ");
String email = scanner.next();
System.out.println("Mobile : ");
long mobile = scanner.nextLong();
System.out.println("Join Date (dd/MM/yyyy): ");
String jd = scanner.next();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Date joinDate = sdf.parse(jd);
Associates associates = new Associates(id, name, email, mobile, joinDate);
return associates;

}