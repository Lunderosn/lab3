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
        function = new Function(10,1);
    }

    @Test
    public void functionResult(){
        Assert.assertEquals(10.0, Function.func(),0.5);
    }

    @Test
    public void nCheck(){
        boolean check = Function.getN() > 0;
        Assert.assertEquals(true, check);
    }

    @Test
    public void xCheck(){
        boolean check = Function.getX() > 0;
        Assert.assertEquals(true, check);
    }

    @Test
    public void nLess(){
        boolean check = Function.getN() < 2147483647;
        Assert.assertEquals(true, check);
    }

    @Test
    public void xLess(){
        boolean check = Function.getX() < 2147483647;
        Assert.assertEquals(true, check);
    }

    @Test
    public void nNotNull(){
        boolean check = Function.getN() != 0;
        Assert.assertEquals(true, check);
    }

    @Test
    public void xNotNull(){
        boolean check = Function.getX() != 0;
        Assert.assertEquals(true, check);
    }

}
