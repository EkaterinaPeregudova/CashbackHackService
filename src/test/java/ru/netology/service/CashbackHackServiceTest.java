package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
   public void showBelowBoundary(){
        int purchaseAmount = 600;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 400;
        assertEquals(actualResult, expectedResult);

    }
    @Test
    public void showHigherBoundary(){
        int purchaseAmount = 1300;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 700;
        assertEquals(actualResult, expectedResult);

    }@Test
    public void showNallBoundary(){
        int purchaseAmount = 0;
        int actualResult = service.remain(purchaseAmount);
        int expectedResult = 1000;
        assertEquals(actualResult, expectedResult);

    }
    @Test
    public void showEqualBoundary(){
    int purchaseAmount = 1000;
    int actualResult = service.remain(purchaseAmount);
    int expectedResult = 1000;
    assertEquals(actualResult, expectedResult);

}



}