package sidderick.stringCalculator;

import static java.lang.Integer.sum;

public class StringCalculator {

    public static int add(String input) {
        int sumOfNums = 0;
        if (input.isEmpty()) {
            return 0;
        } else if (input.contains(",") || input.contains("\n")) {
            String swaptoComma = input.replaceAll("\n", ",");
            String[] justNums = swaptoComma.split(",");
            for (int i = 0; i < justNums.length; i++) {
                sumOfNums += Integer.parseInt(justNums[i]);
            }
            return Integer.parseInt((String.valueOf(sumOfNums)));
        } else {
            return stringToInt(input);
        }
    }
    public static int stringToInt(String input) {
        return Integer.parseInt(input);
    }
}


    /*

            //return stringToInt(justNums[0]) + stringToInt(justNums[1]) + stringToInt(justNums[2]) + stringToInt(justNums[3]);
        }
        else if (input.contains(",")) {
            String[] justNumsNoComma = input.split(",");
            return stringToInt(justNumsNoComma[0]) + stringToInt(justNumsNoComma[1]);
        }
        else if (input.contains("\n")) {
            String[] justNumsNoLB = input.split("\n");
            return stringToInt(justNumsNoLB[0]) + stringToInt(justNumsNoLB[1]);
        }
        else {
            return stringToInt(input);
        }
    }

*/

