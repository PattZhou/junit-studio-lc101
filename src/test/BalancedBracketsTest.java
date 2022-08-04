package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void bracketWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void threeBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void stringWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void emptyStringBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void openBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void closeBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));

    }

    @Test
    public void bracketsReturnFalse1() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));

    }
    @Test
    public void reverseBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }
    @Test
    public void reverseStringBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));

    }
    @Test
    public void unequalStringBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));

    }
}


//    From toby king to Everyone:7:16 PM
//        for (char ch : str.toCharArray()) {
//            if
//        } (ch == '[') { brackets++;
//        } else if (ch == ']') {
//            if (brackets <= 0){
//                return false;
//            } brackets--; }
//
//@Test public void backwardsBrackets() { assertFalse(bracket_ex.hasBalancedBrackets("]Needs[ more Lechonk.")); }
//
