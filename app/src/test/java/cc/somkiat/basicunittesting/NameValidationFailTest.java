package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationFailTest {

    @Test
    public void ชื่อเป็นค่าว่าง(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isInvalidate("");
        assertFalse("", result);

    }
}