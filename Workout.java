
/**
 * Write a description of class Workout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Workout
{
    private int[] key = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};
    private Day[] days;
    private boolean healthy;
    public Workout()
    {
        days = new Day[5];
        healthy = true;
    }
    
    public void GenerateAWorkout()
    {
        ShuffleArray.shuffleArray(key);
        //ShuffleArray.report(key);
        for (int i = 0; i < 15; i++)
        {
           int day = i/3;
           int part = i%3;
           
           if (part == 0)
           {
               days[day] = new Day();
           }
           //System.out.println(day +  "  " + part);
           Exercise temp = new Exercise(key[i]);
           days[day].Assign(part,temp);
           
           if ((part == 2) && (!days[day].CheckCompatibilityInDay()))
           {
               healthy = false;
               //System.out.println("This failed because of a day check on day "+ day + ": " + days[day].simpleReport());
               return;
           }
        }
        
        if (!areArmsOk())
        {
            healthy = false;
            return;
        }
    }
    
    public boolean amIHealthy()
    {
       return healthy;
    }
    
    public boolean areArmsOk()
    {
        return true;
    }
    
    
    
    public void report()
    {
       System.out.println("-----------------------------");
       System.out.println("|Sunday");
       System.out.println("|\tBike Hilly");
       System.out.println("|Monday");
       days[0].report();
       System.out.println("|Tuesday");
       days[1].report();
       System.out.println("|Wednesday");
       days[2].report();
       System.out.println("|Thursday");
       days[3].report();
       System.out.println("|Friday");
       days[4].report();
       System.out.println("|Saturday");
       System.out.println("|\tBike Distance");
       
    }
}
