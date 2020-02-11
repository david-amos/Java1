package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.Test
    void exampleTests() {
        //BP should be a valid building code
        assertTrue(Main.validateBuildingCode("BP"));

        //BP should return the name Benton Place
        assertEquals("Benton Place",Main.setBuildingName("BP"));

        //ZZ shouldn't be a valid building code
        assertFalse(Main.validateBuildingCode("ZZ"));

        //ZZ shouldn't have an associated building name
        assertEquals("Error: building name not found", Main.setBuildingName("ZZ"));


        Double[] expectedOutput;

        //we should expect 650.00 base rate with 0.00 tenant charge for unit number 1 with 1 tenant
        expectedOutput = new Double[]{650.00, 0.00};
        assertArrayEquals(expectedOutput,Main.setRateInfo(1,1));

        //expecting 650.00 base rate and 83.45 family rate for unit 5 with 8 tenants
        expectedOutput = new Double[]{650.00, 83.45};
        assertArrayEquals(expectedOutput,Main.setRateInfo(5,8));


        //following code works, you could test each tenant number 1 - 8 one at a time but what would be a quicker way?
        //  HINT: think with a loop
        assertTrue(Main.validateTenants("1"));

        //True since 24 should be a good unit code
        assertTrue(Main.validateUnitCode("24"));

        //False since 9999 shouldn't be a good unit code
        assertFalse(Main.validateUnitCode("9999"));


        //expecting a premium fee of $0 since AA doesn't get charged the extra .12 %
        assertEquals(0, Main.setPremiumFee("AA",1,650));

        //expecting 12 dollar fee since R7 does get charged premium and we passed in 100 dollar rent due amount (100 * .12 = 12)
        assertEquals(12,Main.setPremiumFee("R7",1,100));

        //AA shouldn't get a government discount of 33%
        assertEquals(0,Main.setGovernmentDiscount("AA", 100));

        //Should return rent flag due to amount being over 1000
        assertEquals("****", Main.setRentFlag(1500.00));

        //Should not return anything since amount is under 1000
        assertEquals("", Main.setRentFlag(10.00));
    }

    @Test
    //copy and rename method as needed.  You can lump all tests in here but would be cleaner to make multiple methods.
    //  I.E make a method testing valid building codes, another method for rates, etc
    void yourTests() {
        assertEquals(12.0,Main.setPremiumFee("YT",24,100));

    }
    @Test
    void knownErrors(){
        //test entering the code for jack's place
        assertEquals("Jack's Place", Main.setBuildingName("JK"));
        //buildingname not found
        //tests the validation of IA and HH for building code
        assertEquals(true,Main.validateBuildingCode("IA"));
        assertEquals(true,Main.validateBuildingCode("HH"));
        //test for leading 0s
        assertEquals(true,Main.validateUnitCode("01"));
        //testing random numbers
        assertEquals(true,Main.validateUnitCode("15"));
        //tests 25 the highest unit for unit number
        Double[] expectedOutput;
        expectedOutput = new Double[]{825.0,0.0};
        assertArrayEquals(expectedOutput,Main.setRateInfo(25,1));
        //test for unit 17-25 having more than 4 tenants
        expectedOutput = new Double[]{825.0,185.60};
        assertArrayEquals(expectedOutput,Main.setRateInfo(20,5));
        //testing YT
        assertEquals(12.0,Main.setPremiumFee("YT",24,100));
    }
}