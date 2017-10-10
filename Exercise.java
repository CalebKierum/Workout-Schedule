
/**
 * Write a description of class Exercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{
    private int intValue;
    public Exercise()
    {
        intValue = -1;
    }
    public Exercise(int num)
    {
        intValue = num;
    }
    
    public int getIntValue()
    {
        return intValue;
    }
    public void setIntValue(int in)
    {
        intValue = in;
    }
    
    public String myName()
    {
        switch(intValue)
        {
            case 1: return "Pushup";
            case 2: return "Sit-up";
            case 3: return "Abs Exercises";
            case 4: return "Squats";
            case 5: return "Bench Dips";
            default: return "Unknown";
        }
    }
    public void report()
    {
          System.out.println(myName());
    }
    public int checkType()
    {
        switch(intValue)
        {
            case 1: return 2;
            case 2: return 1;
            case 3: return 1;
            case 4: return 0;
            case 5: return 2;
            default: return -1;
        }
    }
}
