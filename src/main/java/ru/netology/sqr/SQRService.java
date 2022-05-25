package ru.netology.sqr;

public class SQRService {

    public int sqrtCeil(int minlimit, int maxlimit) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > minlimit && i * i < maxlimit) {
                counter++;
            }
        }
        return counter;
    }
}