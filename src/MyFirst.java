import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner scann = new Scanner(System.in);
        int sum = 0;
        int lastNumber = -1;
        int counter = -1; // pentru ca acesta creste cu 1 si cand se introduce 0 pentru a opri citirea numerelor

        System.out.println("Input the numbers:");
        while (lastNumber != 0) {
            lastNumber = scann.nextInt();
            sum += lastNumber;
            counter ++;
        }

        float average = (float) sum/counter;
        System.out.println("The average sum is: ");
        System.out.println(average);
    }
}