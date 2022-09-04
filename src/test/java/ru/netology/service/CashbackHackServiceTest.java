package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldFindCorrect() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 500;
        int expected = 500;
        int actual = cashbackHackService.remain(boundary);

        assertEquals(expected, actual);
    }

    @Test
    public  void ShouldFindIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int boundary = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(boundary);

        assertEquals(expected, actual);
    }
    }