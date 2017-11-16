package cc.somkiat.basicunittesting;

import org.junit.Test;

import java.util.jar.Attributes;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Danaya on 11/16/2017.
 */

public class NameValidationSuccessTest {

    boolean result;

    @Test
    public void NameIsEmpty() {
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isEmpty("danaya");
        assertFalse(result);
    }

    @Test
    public void NameIsNull() {
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isNull("danaya");
        assertFalse(result);
    }

    @Test
    public void nameIsNotInRange() {
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isNotInRange("danaya");
        assertFalse(result);
    }

    @Test
    public void nameIsNotAlphabet() {
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isNotAlphabet("danaya");
        assertFalse(result);
    }
}
