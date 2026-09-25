class Exceptionhandling{
    public static void main(String[] args){
        int divident=10;
        int divisor=0;
        try{
            int result=divident/divisor;
            System.out.println("Result:"+result);

        }
        catch(ArithmeticException e){
            System.out.println("Divisible by zero");
        }
        finally{
           System.out.println("Program completed");

        }
    }
}