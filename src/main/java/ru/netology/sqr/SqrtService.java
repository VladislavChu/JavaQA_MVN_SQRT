package ru.netology.sqr;
public class SqrtService {
    public int calculate(int initialValue, int endValue) {
        int sumSqrtNum = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= initialValue & i * i <= endValue) {
                sumSqrtNum = sumSqrtNum + 1;
            }
        }
        return sumSqrtNum;
    }
}
