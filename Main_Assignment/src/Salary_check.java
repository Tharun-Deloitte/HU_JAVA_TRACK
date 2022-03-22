public class Salary_check {
    boolean salary_ch(String salary){
        int s= Integer.parseInt(salary);
        if(s>0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
