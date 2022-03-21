public class Arithmetic {
    public static void main(String[]args){
            try{
                int a=100,b=0;
                int c=a/b;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Arithmetic Exception Caught");
            }
            finally {
                System.out.println("Thank You");
            }
    }
}
