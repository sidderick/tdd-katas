package sidderick;

import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;

import java.util.*;

public class primeFactors {
    public List<Integer> generate(int userInput) {
        int n = userInput;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

}