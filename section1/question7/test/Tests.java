import org.junit.Assert;
import org.junit.Test;

public class Tests {
    Task task = new Task();

    @Test
    public void testSolution() {

        Assert.assertEquals(140.0, task.evaluateExpression(), 0.1);
    }
}