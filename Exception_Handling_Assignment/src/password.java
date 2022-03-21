

public class password {
    public static void main(String[] args) {
        String p = "S@aajdj";
        try{
            passwordcheck(p);
        }
        catch(PasswordException e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean passwordcheck(String password) throws PasswordException{
        boolean length=false;
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean symbol=false;
        boolean check=false;
        String problem="nothing";
        if(5<= password.length() && password.length()<=10)
        {
            length=true;
        }
        if((password.contains("@")||password.contains("#")||password.contains("&")||password.contains("%")||password.contains("*")||password.contains("!")))
        {
            symbol=true;
        }
        for(int i=0;i<password.length();i++)
        {
            Character s;
            s=password.charAt(i);
            if(Character.isUpperCase(s))
            {
                upper=true;
            }
            if(Character.isLowerCase(s))
            {
                lower=true;
            }
            if(Character.isDigit(s))
            {
                digit=true;
            }

        }
        if(length==false)
        {
            problem="Length error";
        }
        else if(digit==false)
        {
            problem="no digit error";
        }
        else if(upper==false)
        {
            problem="Upper case error";
        }
        else if(lower==false)
        {
            problem="lower case error";
        }
        else if(symbol==false)
        {
            problem="symbol error";
        }
        else{
            check=true;
        }

        if(check==true)
        {
            return true;
        }
        else
        {
            throw new PasswordException(problem);
        }


    }
    public static class PasswordException extends Exception{
        public PasswordException(String problem){
            super("Invalid: "+problem);
        }
    }
}