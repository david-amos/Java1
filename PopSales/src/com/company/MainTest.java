package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    //example testing team total print
    void printTeamTotals() {
        //setting up so assert equal can read println from method
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //setting up total for test
        Map<Character, Double> teamTotals = new HashMap<Character, Double>();
        teamTotals.put('A', 123.0);

        Main.printTeamTotals(teamTotals);

        //asserting passed in map prints correct message
        //  \r\n needed to ignore line endings that were causing false negatives
        assertEquals("Total for team A was 123.0\r\n", outContent.toString());
    }

    @Test
    void printPopTotals() {
    }

    @Test
    void userContinue() {
    }


    //this may not be possible to assertEquals
//    @Test
//    void callMethod() {
//    }

    @Test
    void setMethod() throws NoSuchMethodException {
        //passing in the name of a method in PopSale class
        //result is full method name that can be called later
        Method myMethod = new PopSale().getClass().getMethod("setFirstName",String.class);
        assertEquals(myMethod, Main.setMethod("setFirstName"));
    }

    @Test
    void getInput() {

    }

    @Test
    void printDefaultMethodError() {
        //setting up so assert equal can read println from method
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.printDefaultMethodError("setBlahBlahBlah");
        //  \r\n needed to ignore line endings that were causing false negatives
        assertEquals("PopSale.setBlahBlahBlah does not exist\r\n", outContent.toString());
    }

    @Test
    void setupTeamTotals() {

    }

    @Test
    void setupPopTotals() {

    }
}