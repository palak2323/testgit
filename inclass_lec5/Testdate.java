








import java.io.*;
class Date
{
   
    int dat;
    int month;
    int year;
     Scanner input = new Scanner(System.in);
      Date()
    {
        dat=01;
        month=01;
        year=2001;
    }
    void get_dat()throws IOException
    {
        System.out.println("Enter date");
        dat=Integer.parseInt(br.readLine());
    }
   void get_month()throws IOException
    {
        System.out.println("Enter month");
        month=Integer.parseInt(br.readLine());
    }
    void get_year()throws IOException
    {
        System.out.println("Enter year");
        year=Integer.parseInt(br.readLine());
    }
    void set_dat(int dat)
    {
        this.dat=dat;
        //System.out.println(dat);
        //return dat;
    }
    void set_month(int mon)
    {
        month=mon;
    }
    void set_year(int year)
    {
        this.year=year;
    }
    void display()
    {
        System.out.println("Entered Date : "+dat+"/"+month+"/"+year);
    }
}
 class Testdate
{
    public static void main(String args[])
    {
        Date d1= new Date();
        Date d2 = new Date();

        d1.get_dat();
        d1.get_month();
        d1.get_year();

        d2.set_dat(12);
        d2.set_month(12);
        d2.set_year(12);

        System.out.println("the date for get method");
        d1.display();
        System.out.println("the date for set method");
        d2.display();

    }
}