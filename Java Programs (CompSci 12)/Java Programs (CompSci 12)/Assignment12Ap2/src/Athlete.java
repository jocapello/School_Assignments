public class Athlete
{
   private String name;                  //variables are declared as private, meaning they 
   private String position;                  // can only be accessed in the class
   private int goals;
   private int assists;
   public void initializeAthlete(String n, String p, int g, int a)
   {
	name=n;                                //This method initializes the variables. Once 
	position=p;                           // they have been initialized, they can be used
	goals=g;                               // by any method in this class
	assists=a;
   }
   public void displayAthlete()
   {// display the data associated with Athlete
           System.out.println(name+" plays “+position+ “ and has scored “+goals+” goals and “+assists+”  assists ");

	}
}
