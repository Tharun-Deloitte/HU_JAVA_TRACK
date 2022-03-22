public class Phone_Number_Check {
    boolean phone_check(String phone){
        boolean digit = false,length = false;
        if(phone.length()==10)
        {
            length=true;
        }
        for(int i=0;i<phone.length();i++)
        {
            Character s;
            s=phone.charAt(i);
            if(Character.isDigit(s))
            {
                digit=true;
            }
        }
        if(length && digit) {
            return true;
        }
        else{
            return false;
        }
    }
}
