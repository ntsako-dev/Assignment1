/**
 * Created by ntsmbo on 3/24/2017.
 */
public class MyApp
{
    public MyApp()
    {}

    public MyApp(String n, String sn, String i)
    {
        name = n;
        sname = sn;
        id = i;

    }

    private String name, sname, id;

    public void setName(String n)
    {
        name = n;
    }

    public void setSName(String sn)
    {
        sname = sn;
    }
    public void setID(String i_d)
    {
        id = i_d;
    }


    public String getName()
    {
        return name;
    }


    public String getSName()
    {
        return sname;
    }

    public String getID()
    {
        return id;
    }

    public String toString()
    {
        return "Name : " + getName() + "\nSurname : " + getSName() + "\nID Number : " + getID() + "\n";
    }




}
