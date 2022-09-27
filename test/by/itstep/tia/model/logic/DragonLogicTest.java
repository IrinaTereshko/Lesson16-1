package by.itstep.tia.model.logic;

import by.itstep.tia.model.data.Dragon;
import org.junit.Assert;
import org.junit.Test;

public class DragonLogicTest {

    @Test
    public void testFirstPeriodPositive(){
        //arrange подготовительная часть
        Dragon dragon = new Dragon();
        dragon.age = 10;
        int expected = 33;

        // act действия по проверке
        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testNegative(){
        //arrange подготовительная часть
        Dragon dragon = new Dragon();
        dragon.age = -10;
        int expected = -1;

        // act действия по проверке
        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);

    }
    @Test
//    первое граничное значение первого периода
    public void testFirstPeriodPositiveFirstBound(){
        //arrange подготовительная часть
        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.FIRST_PERIOD;
        int expected = 303;

        // act действия по проверке
        int actual = DragonLogic.calculateHeads(dragon);
        Assert.assertEquals(expected, actual);

    }

}
