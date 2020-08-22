import java.util.Scanner;


class Basic{
    public static void main(String[] args) {
        int number1 = 30;
        double number2 = 23.5;
        long number3 = 350;

        double result = number1 + number2 + number3;

        System.out.println(result);

        if(number1 > number2)
        {
            System.out.println("Number1 is larger then Number2");
        }
        else
        {
            System.out.println("Number2 is larger then number1");
        }


        int [] array = {10, 11, 22, 23, 34};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        String [] name = {"Emdadul", "Hoque", "Tareque"};
        for(int i = 0; i <name.length; i++){
            System.out.println(name[i]);
        }

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scr.nextInt();
        System.out.println(a);
   
    }
}