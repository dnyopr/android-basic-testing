package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Danaya on 11/16/2017.
 */

public class NameValidationSuccessTest {

    boolean result;
    @Test
    public void isEmpty(){
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isEmpty("danaya");
        assertTrue(result);
    }

    @Test
    public void isNull(){
        NameValidation nameValidation = new NameValidation();
        result= nameValidation.isNull("danaya");
        assertTrue(result);
    }
}
