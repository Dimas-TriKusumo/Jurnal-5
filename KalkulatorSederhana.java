import java.util.Scanner;

    class KalkulatorSederhana {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        float a, b, hasil;
        char operator;

        System.out.print("Nilai A ="+ " ");
        a = input.nextFloat();
        System.out.print("Operator (+,-,*,/) ="+ " ");
        operator = input.next().charAt(0);
        System.out.print("Nilai B ="+ " ");
        b = input.nextFloat();

        switch(operator){
            case '+':
                hasil = a + b;
                System.out.println(a + " + " + b + " = " + hasil );
                break;
            case '-':
                hasil = a - b;
                System.out.println(a + " - " + b + " = " + hasil );
                break;
            case '*':
                hasil = a * b;
                System.out.println(a + " * " + b + " = " + hasil );
                break;
            case '/':
                hasil = a / b;
                System.out.println(a + " / " + b + " = " + hasil );
                break;
            default:
                System.out.println("Syntaq Error");
        }
    }
}
