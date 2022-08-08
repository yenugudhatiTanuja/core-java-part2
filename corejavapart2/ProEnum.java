package corejavapart2;

enum Days{
SUNDAY,
MONDAY,
TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class ProEnum {
	/*enum Days{
		SUNDAY,
		MONDAY,
		TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* for(Days d:Days.values())
       {
    	   System.out.println(d);
       }
       System.out.println("index of sunday ----->"+Days.valueOf("SUNDAY").ordinal());
       System.out.println("value "of sunday ----->"+Days.valueOf("SUNDAY"));*/
       /*Days s=Days.valueOf("SUNDAY");
       System.out.println(s);*/
		int s=Days.valueOf("SUNDAY").ordinal();
		System.out.println(s);
	}
		

}
