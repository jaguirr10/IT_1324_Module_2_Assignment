/**
 * Created by shadow on 2/13/2015.
 */

public class CourseClient
{
    public static void main(String[] args)
    {


        courseDescription c1 = new courseDescription(1324, "Java", 4);

        courseDescription c2 = new courseDescription(2112,"Physics",4);


//use Client1.get to print each property  system.out.println("Course code "+client1.getCode());

        System.out.println("Course code "+c1.getcode());
        System.out.println("Course description "+c1.getdescription());
        System.out.println("Course credits "+c1.getCredits());

//use Client2 toString() to print each property
        System.out.println(c2.toString());
//call equals method
        if (c1.equals(c2))
        {
            System.out.println("they are the same");
        }
        else
        {
            System.out.println("they are different");
        }
//use sets to change values of client2
        c2.setCode(1324);
        c2.setDescription("Java");
        c2.setcredits(4);


//call equals again
        if (c1.equals(c2))
        {
            System.out.println("client1 and changed client2 are the same");
        }
        else
        {
            System.out.println("client1 and changed client2 are different");
        }



        System.out.println("Coded by Juan Aguirre");
    }
}