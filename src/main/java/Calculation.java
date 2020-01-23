import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Calculation {
    public int getDigitQuantity(int number) {
        int result = 1;
        while (abs(number) > 9) {
            result++;
            number /= 10;
        }
        return result;
    }

    public int getDigitSum(int number) {
        int result = 0;
        while (abs(number) > 0) {
            result += abs(number) % 10;
            number /= 10;
        }
        return result;
    }

    public List<Integer> getPerfectNumbersList(int number) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            int result = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    result += j;
                }
            }
            if (i == result) {
                resultList.add(result);
            }
        }
        return resultList;
    }
}
