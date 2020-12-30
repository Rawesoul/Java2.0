import Input.CheckInput;
import Operations.ToOperate;
import org.junit.Assert;
import org.junit.Test;

public class CalcTests {

    @Test
    public void SumCheck () {
        final double a = 30.0;
        final double b = 22.0;
        ToOperate res = new ToOperate();

        Assert.assertEquals("Ошибка калькуляции сложения",a+b,res.ToSelect(a, b, "+"),0);

    };

    @Test
    public void SubstractCheck ()  {
        final double a = 30.0;
        final double b = 22.0;
        ToOperate res = new ToOperate();

        Assert.assertEquals("Ошибка калькуляции вычитания",a-b,res.ToSelect(a, b, "-"),0);

    };

    @Test
    public void MultiplyCheck (){
        final double a = 30.0;
        final double b = 22.0;
        ToOperate res = new ToOperate();
        Assert.assertEquals("Ошибка калькуляции умножения",a*b,res.ToSelect(a, b, "*"),0);

    };

    @Test
    public void DivideCheck () {
        final double a = 30.0;
        final double b = 22.0;
        ToOperate res = new ToOperate();
        Assert.assertEquals("Ошибка калькуляции деления",a/b,res.ToSelect(a, b, "/"),0);
    };

    @Test
    public void ParseCheck () {
        CheckInput test = new CheckInput("3");
        test.CheckNum();
        Assert.assertFalse("Получен признак завершения программы из-за ошибки. " +
                "Введенный символ не преобразован", test.isEndflag());
    }

    @Test
    public void OperationRecognizeCheck() {
        CheckInput test = new CheckInput("*");
        test.CheckOperation();
        Assert.assertFalse("Получен признак завершения программы из-за ошибки."+
                        "Арифметическая операция не распознана", test.isEndflag());
    }

}
