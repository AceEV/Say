import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SayTest {

    Say say;

    @Before
    public void setUp() throws Exception {
        say = new Say();
    }

    @After
    public void tearDown() throws Exception {
        say = null;
    }

    @Test
    public void saySomething() {
        String actualValue = say.saySomething();
        Assert.assertEquals("something", actualValue);
    }

    @Test
    public void sayTheOtherThing() {
        String actualValue = say.sayTheOtherThing();
        Assert.assertEquals("the other thing", actualValue);
    }
}