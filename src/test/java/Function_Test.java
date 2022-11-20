import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Function_Test {

    Function function;
    /**
     *В данном методе мы создаем объект класса до начала тестирования, как указано в задании. Это делаем благодаря @Before.
     *
     * */
    @Before
    public void createObject(){
        function = new Function();
    }

    @Test
    public void functionResult(){
        Assert.assertEquals(10.0, Function.func(10,1),0.5);
    }

}
