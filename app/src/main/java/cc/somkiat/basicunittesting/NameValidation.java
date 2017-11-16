package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {
    boolean type;


    public boolean isEmpty(String name) {
        return name.isEmpty();
    }

    public boolean isNull(String name) {
        type = (name == null);
        return (type);
    }
}