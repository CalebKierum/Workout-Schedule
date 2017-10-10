
/**
 * Write a description of class Day here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Day
{
    private Exercise[] parts;
    
    public Day()
    {
        parts = new Exercise[3];
    }
    public void AssignDay(Exercise in)
    {
        parts[0] = in;
    }
    
    public void AssignNight1(Exercise in)
    {
        parts[1] = in;
    }
    
    public void AssignNight2(Exercise in)
    {
        parts[2] = in;
    }
    public void Assign(int slot, Exercise in)
    {
        parts[slot] = in;
    }
    
    public boolean CheckCompatibilityInDay()
    {
        boolean isMatchingOk = !((parts[0].getIntValue() == parts[1].getIntValue()) || (parts[0].getIntValue() == parts[2].getIntValue()) || (parts[2].getIntValue() == parts[1].getIntValue()));
    
        int t0 = parts[1].checkType();
        int t1 = parts[1].checkType();
        int t2 = parts[2].checkType();
        boolean isAbsOk = !((t1 == t2) && ((t1 == 1) || (t1 == 2)));
        
        boolean isArmsOk = !((t0 == 2) && ((t1 == 2) || (t2 == 2)));
        return isAbsOk && isMatchingOk && isArmsOk;
    }
    
    public Exercise get(int index)
    {
        return parts[index];
    }
    
    public int simpleReport()
    {
        return parts[0].getIntValue()*100+parts[1].getIntValue()*10+parts[2].getIntValue();
    }
    
    public void report()
    {
        System.out.println("|\t----Morning----");
        System.out.print("|\t\t-");
        parts[0].report();
        System.out.println("|\t----Evening----");
        System.out.print("|\t\t-");
        parts[1].report();
        System.out.print("|\t\t-");
        parts[2].report();
    }
}
