package by.itstep.tia.model.logic;

// age
// 3 heads after birthday
// 0...100 -->3 heads every year
// 101-200 -->2
// 201 and more -->1

import by.itstep.tia.model.data.Dragon;

public class DragonLogic {
    public static final int FIRST_PERIOD= 100;
    public static final int SECOND_PERIOD= 200;

    public static int calculateHeads(Dragon dragon) {
        // пассивная защита от дурака
        if (dragon.age < 1) {
            return -1;
        }

        int head = 3;
        if (dragon.age <= FIRST_PERIOD) {
            head += dragon.age * 3;
        } else {
            if (dragon.age <= SECOND_PERIOD) {
                head += (dragon.age - FIRST_PERIOD) * 2 + (FIRST_PERIOD*3);
            } else {
                head += (dragon.age - (FIRST_PERIOD+SECOND_PERIOD)) + FIRST_PERIOD*3 + SECOND_PERIOD*2;
            }
        }
        return head;


    }
}
