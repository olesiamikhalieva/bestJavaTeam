import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTelNomer {

    public String numberFormatting(String nomer) {
        String nom = "+" + nomer.replaceAll("\\D+", "");
        return nom;
    }

    public int checkNum1(String nom) {
        Pattern p = Pattern.compile("^\\+(((1|7)\\d{10})?((27|31|33|41|48|61)\\d{9})?((371|357)\\d{8})?)$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }

    public int checkNum2(String nom) {
        Pattern p = Pattern.compile("^\\+((995\\d{8,10}))$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }

    public int checkNum3(String nom) {
        Pattern p = Pattern.compile("^\\+((49\\d{6,10})?((353|358)\\d{5,9})?)$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
    public int checkNum4(String nom) {
        Pattern p = Pattern.compile("^\\+(44\\d{8,10})$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
    public int checkNum5(String nom) {
        Pattern p = Pattern.compile("^\\+((32|36)\\d{7,8})?((372\\d{6,7})?)$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
    public int checkNum6(String nom) {
        Pattern p = Pattern.compile("^\\+(39\\d{8,9})$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
    public int checkNum7(String nom) {
        Pattern p = Pattern.compile("^\\+(961\\d{5,7})$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
    public int checkNum8(String nom) {
        Pattern p = Pattern.compile("^\\+(971\\d{5,8})$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
    public int checkNum9(String nom) {
        Pattern p = Pattern.compile("^\\+(43\\d{4,11})$");
        Matcher m = p.matcher(nom);
        if (m.matches()) {
            return nom.length();
        }
        return 0;
    }
}
