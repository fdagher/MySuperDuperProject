public class DoSomething
{
	public boolean Playfootball(int age)
	{
        if (age > 35)
        {
        	System.out.println("Play something else dude.");
        	return false;
        }
        else
        {
        	System.out.println("Ok, you are allowed to play.");
        	return true;
        }
    }
}
