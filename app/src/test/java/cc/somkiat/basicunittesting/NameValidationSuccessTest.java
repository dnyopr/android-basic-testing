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
    public void NameIsEmpty(){
        NameValidation nameValidation = new NameValidation();
        result = nameValidation.isEmpty("danaya");
        assertFalse(result);
    }

    @Test
    public void NameIsNull(){
        NameValidation nameValidation = new NameValidation();
        result= nameValidation.isNull("danaya");
        assertFalse(result);
    }

    @Test
    public void nameIsNotInRange(){
        NameValidation validation = new NameValidation();
        result = validation.isNotInRange("Danaya");
        assertFalse(result);
    }
}
