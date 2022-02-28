package Assign3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Userdetailt
{
            public static void main(String args[]) {
            List<Userdetil> a = new ArrayList<Userdetil>();
            Userdetil a1 = new Userdetil("Sarayu", "S", "sara@gmail.com", "5032134556", "Sanfrancisco", "California", "USA");
            Userdetil a2 = new Userdetil("Vamsi", "B", "vk@gmail.com", "9088011776", "Hyderabad", "Telangan", "India");
            Userdetil a3 = new Userdetil("Deepthi", "C", "deep@gmail.com", "9088222455", "Hyderabad", "Telangan", "India");
            Userdetil a4 = new Userdetil("Vijay", "CH", "vijay@gmail.com", "9440455745", "Nellore", "Andhrapradesh", "India");
            Userdetil a5 = new Userdetil("Karthik", "C", "Karthik@gmail.com", "9840972462", "London", "UK", "UK");
            Userdetil a6 = new Userdetil("Vani", "Chi", "vani@gmail.com", "98876546721", "Kovur", " Andhrapradesh", "India");
            Userdetil a7 = new Userdetil("Morya", "CH", "morya@gmail.com", "7850467869", "Chennai", "Germany", "Europe");
            Userdetil a8 = new Userdetil("Swati", "B", "swati@gmail.com", "987656743456", "London", "Uk", "UK");
            Userdetil a9 = new Userdetil("smitha", "P", "sweety@gmail.com", "9848456789", "portland", "Oregon", "USA");
            Userdetil a10 = new Userdetil("priti", "R", "priti@gmail.com", "9881234567", "Atlanta", "Georgia", "USA");
            a.add(a1);
            a.add(a2);
            a.add(a3);
            a.add(a4);
            a.add(a5);
            a.add(a6);
            a.add(a7);
            a.add(a8);
            a.add(a9);
            a.add(a10);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter phno");
            String phno=sc.nextLine();
            for(Userdetil u:a)
            {
                if(phno.equals(u.phno))
                {

System.out.println("Give user details");
        System.out.println("username is :"+u.username);
        System.out.println("lastname is :"+u.lastname);
                System.out.println("emial :"+u.email);
        System.out.println("phno: "+u.phno);
        System.out.println("address: "+u.address);
        System.out.println("State:  "+u.state);
        System.out.println("Country: "+u.country);
                }
            }
        }
    }

