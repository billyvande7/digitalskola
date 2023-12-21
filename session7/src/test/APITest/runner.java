Package APITest;

export com.intuit.karate.junit5.Karate;

public class Runner{
    @Karate.Test
    public Karate runGet(){
        return Karate.run("getRequest").relativeTo(getClass());
    }
}