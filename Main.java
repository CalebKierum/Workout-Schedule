
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class Main
{
    // instance variables - replace the example below with your own

    
    public static void main(String[] args)
    {
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        for (int i = 0; i < 1000; i++)
            System.out.println("\n");
        // initialise instance variables
        System.out.println("Lets build a workout schedule shall we?");
        
        System.out.println("Generating workout...");
        
        Workout g1 = getMeOne();
        
        
        
        if (g1 != null)
        {
            System.out.println("Horray!! We made a workout");
            System.out.println("Let me tell you all about it!!");
            g1.report();
        }
        else
        {
            System.out.println("Dang nabbit we couldnt make one in the allowed time :( ");
        }
        
    }
    public static int iterateCount = 0;
    public static Workout getMeOne()
    {
        //System.out.println(iterateCount);
        if (iterateCount > 9999)
        {
            //System.out.println("Couldnt find a suitable workout in allowed iterations");
            return null;
        }
        
        Workout temp = new Workout();
        iterateCount += 1;
        temp.GenerateAWorkout();
        
        if (!temp.amIHealthy())
        {
            temp = null;
            //System.out.println("That didnt work lets do a new one ");
            return getMeOne();
        }
        
        return temp;
    }

}
