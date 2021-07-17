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

/*
Q. If you were implementing the enterDate method what consideration would you need to make?
A . You would need an initialize scanner object that takes user input for month,day,year.
    You would need to make sure that the month entered is valid 1-12 and that the days for
    that particular month are valid.
 */
    /*

Q. Give the definition of the class (just give method signatures - don't fully implement)
        Ans. Definition of class with method signature is:

public class DateTime extends MyDate
{

    int hour, minute, second;

    // constructor for initialization with a default date and time
    public DateTime()

    // yr, mn, dy, hr, mi, se represents year, month, day, hour, minute, and seconds

    public void setDate(int yr, int mn, int dy, int hr, int mi, int se)

    // returns a string in the form July 5, 2001 - 4:52:11 p.m.

    public String toString()

    // allows the entry of a date from the keyboard

    public void enterDate()

}

     */
/*
    Q. Would the following be legal? Explain.
        DateTime dt = new MyDate();
    A. The above expression is not legal.
    Reasoning: A base class is trying to be access derive class members, it cant
    initiate them and therefore it will result in an error.

 */