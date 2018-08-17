/**
 * Created by shadow on 2/13/2015.
 */
public class courseDescription
{
    private  int code;
    private  String description;
    private  int credits;



    public courseDescription(int courseNum, String course,int creditHours)
    {
        code = courseNum;
        description = course;
        credits = creditHours;
    }

    public void setCode(int newCode)
    {
        code = newCode;
    }

    public int getcode()
    {
        return code;
    }

    public  void setDescription (String newDescription)
    {
        description = newDescription;

    }

    public String getdescription()
    {
        return description;
    }

    public void setcredits(int newCredits)
    {
        credits = newCredits;
    }

    public int getCredits()
    {
        return credits;
    }

    public boolean equals( Object o)
    {
        if( !( o instanceof courseDescription)){
            return false;
        }
        else
        {
            courseDescription objcourseDescription = (courseDescription) o;
            if(code == objcourseDescription.code && description.equals(objcourseDescription.description)
                    && credits == objcourseDescription.credits)
                return true;

            else
                return false ;
        }
    }

    public String toString()
    {
        return  code + "\n code \t"+
                description + "\n course name\t"+
                credits +"\n credits\t\t";
    }




}






