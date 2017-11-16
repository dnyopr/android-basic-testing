package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Danaya on 11/16/2017.
 */

public class NameValidationFailTest {
    boolean result;

    @Test
    public void nameIsEmpty(){
        NameValidation validation = new NameValidation();
        result = validation.isEmpty("");
        assertFalse(result);
    }

    @Test
    public void nameIsNull(){
        NameValidation validation = new NameValidation();
        result = validation.isNull(null);
        assertFalse(result);
    }
}
