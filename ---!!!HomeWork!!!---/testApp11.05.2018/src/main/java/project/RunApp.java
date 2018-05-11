package project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunApp {
    public static void main(String[] args) {

//        System.out.println(Pattern.compile("^(\\+(7|1\\d{10})(371|357\\d{8})(31|27|33|41|48|61\\d{9})(30\\d{10})(380|351|996|420|375\\d{9})" +
//                "(995\\d{8,10})(49\\d{6,10})(353|358\\d{5,9})(44\\d{8,10})(32|36\\d{7,8})(372\\d{6,7})(39\\d{8,9})" +
//                "(961\\d{5,7})(971\\d{5,8})(43\\d{4,11}))$").matcher("+38066987").matches());

        System.out.println(Pattern.compile("\\+((380|351|996|420|375)(\\d{9}))|((7)(\\d{3}))").matcher("+380960456680").matches());
        System.out.println(Pattern.compile("\\+((7)(\\d{3})|((380|351|996|420|375)(\\d{9})))").matcher("+380960456680").matches());
//        System.out.println(ValidationNumber.checkValidationNumber("+38068789789745"));
//        System.out.println(ValidationNumber.checkValidationNumber("+380960456680"));
//        System.out.println(ValidationNumber.checkValidationNumber("+380687897897"));
//        System.out.println(ValidationNumber.checkValidationNumber("+380687"));
//        System.out.println(ValidationNumber.checkValidationNumber("+38068"));
    }
}