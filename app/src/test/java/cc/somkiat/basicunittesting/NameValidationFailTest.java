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
    public void nameIsEmpty() {
        NameValidation validation = new NameValidation();
        result = validation.isEmpty("");
        assertTrue(result);
    }

    @Test
    public void nameIsNull() {
        NameValidation validation = new NameValidation();
        result = validation.isNull(null);
        assertTrue(result);
    }

    @Test
    public void nameIsNotInRange() {
        NameValidation validation = new NameValidation();
        result = validation.isNotInRange("Hey this is my name that more than 20 alphabets.");
        assertTrue(result);
    }

    @Test
    public void nameIsNotAlphabet() {
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isNotAlphabet("#danaya#");
        assertTrue(result);
    }
}
