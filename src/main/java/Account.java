import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        String regex = "^(\\S)(\\w{1,16})(\\S)$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        if (name.split(" ").length > 2) {
           return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }

//    private static final String USERNAME_PATTERN ="^[a-zA-Z]{3,18}$";
//
//    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);
//
//    public static boolean isValid(final String name) {
//        Matcher matcher = pattern.matcher(name);
//        return matcher.matches();
//    }
//
    // if (name.length() < 3 || name.length() > 19) {
          //  return false;
        //}
//        if (!name.contains(" ") || name.startsWith(" ") || name.endsWith(" ")) {
//            return false;
//        }
//        if (name.split(" ").length > 2) {
//            return false;
//        }
     //   return true;
    }

