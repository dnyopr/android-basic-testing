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
        return type;
    }


    public boolean isNotInRange(String name) {
        if(name.length()<2||name.length()>20){
            type = true;
        }
        else {
            type = false;
        }
        return type;
    }
}