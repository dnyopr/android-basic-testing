package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Danaya on 11/16/2017.
 */

public class EmailValidationFailTest {
    boolean result;

    @Test
    public void isEmpty(){
        EmailValidation emailValidation = new EmailValidation();
        result = emailValidation.isEmpty("");
        assertTrue(result);
    }

    @Test
    public void isNull(){
        EmailValidation emailValidation = new EmailValidation();
        result = emailValidation.isNull(null);
        assertTrue(result);
    }
}
