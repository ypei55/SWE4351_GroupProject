package Operations;

import java.util.Scanner;

import CalcHistory.SaveCalcs;

public class Nthroot extends SaveCalcs {

    public void nthRoot() {

        Scanner s = new Scanner(System.in);
        int num, n;
        System.out.println("Enter the number");
        num = s.nextInt();
        System.out.println("Enter the number to find the nth root");
        n = s.nextInt();
        Nthroot nth = new Nthroot();
        nth.root(num, n);
    }

    void root(int num, int n) {

        int count = 0, prod = 1, i;

        for (i = 1; i <= num / n; i++) {
            int j = 1;
            while (j <= n) {
                prod = prod * i;
                j++;
            }

            if (prod == num) {
                System.out.println(i + " is the " + n + " th root of " + num);
                logCalculations("The inputs were " + n + " " +
                        num + " and the result is : "
                        + i + " is the " + n + " th root of " + num);
                count++;
            }
            prod = 1;
        }

        if (count == 0) {
            System.out.println(n + " th root does not exist");
        }
    }
}
