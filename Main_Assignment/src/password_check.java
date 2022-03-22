public class password_check {
    boolean pc(String password) {
        boolean length=false;
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean symbol=false;
        if (5 <= password.length() && password.length() <= 10) {
            length = true;
        }
        if ((password.contains("@") || password.contains("#") || password.contains("&") || password.contains("%") || password.contains("*") || password.contains("!"))) {
            symbol = true;
        }
        for (int i = 0; i < password.length(); i++) {
            Character s;
            s = password.charAt(i);
            if (Character.isUpperCase(s)) {
                upper = true;
            }
            if (Character.isLowerCase(s)) {
                lower = true;
            }
            if (Character.isDigit(s)) {
                digit = true;
            }
        }
        if(digit==true && lower==true && upper==true&& symbol== true && length==true){
            return true;
        }
        else{
            return false;
        }
    }
}
