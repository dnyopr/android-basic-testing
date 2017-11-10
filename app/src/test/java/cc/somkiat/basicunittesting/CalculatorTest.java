package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test //เป็นการออกแบบ ว่าจะ สร้าง classอะไรอะ เป็นเทคนิคการคิดก่อนทำ
    public void เจ็ดบวกสองได้ผลลัพธ์เท่ากับเก้า(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(7,2);
        assertEquals(9, result);
    }

    @Test //เป็นการออกแบบ ว่าจะ สร้าง classอะไรอะ เป็นเทคนิคการคิดก่อนทำ
    public void สองบวกสองได้ผลลัพธ์เท่ากับสี่(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(2,2);
        assertEquals(4, result);
    }

}
