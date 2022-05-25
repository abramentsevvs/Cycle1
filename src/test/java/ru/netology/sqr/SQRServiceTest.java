package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @Test
    void sqrtCeil() {
        SQRService service = new SQRService();
        int expected = 9;
        int actual = service.sqrtCeil(300, 700);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilMax() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sqrtCeil(9300, 9900);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilOderMax() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrtCeil(9900, 10000);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilMin() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.sqrtCeil(20, 120);
        assertEquals(expected, actual);
    }

    @Test
    void sqrtCeilOderMin() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sqrtCeil(10, 99);
        assertEquals(expected, actual);
    }


}