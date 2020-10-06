package sidderick.fizzBuzz;

public class fizzBuzz {

    public String input (int num) {
        String output;
        if (num >= 1) {
            output = numberValue(num);
            return output;
        }
        return String.valueOf(num);
    }

    public Object inputRange (int min, int max) {
        for (int i = min; i < max; i++) {
            String output = numberValue(i);
            System.out.print(output + ", ");
        }
        return null;
    }

    public String numberValue(int num) {
        if (num <= 15) {
            return "small";
        }
        else if (num >= 96) {
            return "big";
        }
        if (multiple3(num) && multiple5(num)) {
            return "fizzbuzz";
        }
        else if (multiple7(num) && multiple11(num)) {
            return "fooboo";
        }
        else if (multiple3(num)) {
            return "fizz";
        }
        else if (multiple5(num)) {
            return "buzz";
        }
        else if (multiple7(num)) {
            return "foo";
        }
        else if (multiple11(num)) {
            return "boo";
        }
        return String.valueOf(num);
    }

    public boolean multiple3(int num) {
        if(num % 3 == 0) {
            return true;
        }
        return false;
    }

    public boolean multiple5(int num) {
        if(num % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean multiple7(int num) {
        if(num % 7 == 0) {
            return true;
        }
        return false;
    }

    public boolean multiple11(int num) {
        if(num % 11 == 0) {
            return true;
        }
        return false;
    }
}






/*
public class fizzBuzz {
    public static void multiples(String[] args) {
        multiples(101);
    }

    public static int multiples(int n) {
        for (int i = 1; i < 100; i++) {
            if (i < n && i % 3 == 0) {
                System.out.print("fizz" + ", ");
            } else if (i < n) {
                System.out.print(i + ", ");
            } else if (i == n) {
                break;
            }
        }
        return n;
    }
} */

