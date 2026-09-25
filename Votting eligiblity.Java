import java.util.Scanner;
    class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        int Age=sc.nextInt();
        if(Age>=18){
            System.out.println("Eigible to vote");
        }
        else{
            System.out.println("Not Eligible");
        
        }

    }
    }