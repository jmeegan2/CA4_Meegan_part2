import java.util.*;

public class MyDate
{

    int day,month,year;

    //setting date
    public void setDate(int m,int d,int y){
        day = d;
        month = m;
        year = y;
    }


    // returning date as in required format
    public String Date(){
        return month+"/"+day+"/"+year;
    }

    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);

        // instantiate object MyDateClass
        MyDate obj = new MyDate();

        //set date values
        obj.setDate(07,17,2021);

        // display date
        System.out.println(obj.Date());

        System.out.println("Enter date in format mm dd yyyy");

        int month=sc.nextInt(); //input month
        int day=sc.nextInt(); //input date
        int year=sc.nextInt(); //input year

        obj.setDate(month,day,year);
        System.out.println(obj.Date());

    }

    } // end main

