package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldFindCorrect() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(boundary);

        assertEquals(actual, expected);
    }

    @Test
    public  void ShouldFindIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(boundary);
        assertEquals(actual, expected);
    }
}