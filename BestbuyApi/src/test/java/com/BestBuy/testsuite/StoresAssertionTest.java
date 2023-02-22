package com.BestBuy.testsuite;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

public class StoresAssertionTest {


    static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        response = given()
                .when()
                .get("/stores")
                .then().statusCode(200);
    }

    //Verify the if the total is equal to 1561
    @Test
    public void VerifyTotal(){
        response.body("total",equalTo(1561));
    }


    //Verify the if the stores of limit is equal to 10
    @Test
    public void VerifyStoreLimit(){
        response.body("limit",equalTo(10));
    }

    //Check the single ‘Name’ in the Array list (Inver Grove Heights)
    @Test
    public void CheckSingleName(){
        response.body("data.name",hasItem("Inver Grove Heights"));
    }


    //Check the multiple ‘Names’ in the ArrayList (Roseville, Burnsville, Maplewood)
    @Test
    public void CheckMultipleName(){
        response.body("data.name",hasItems("Roseville","Burnsville","Maplewood"));
    }

    //Verify the storied=7 inside storeservices of the third store of second services

    @Test
    public void VerifyStoreService(){
        response.body("data[2].services[2].storeservices.storeId",equalTo(7));
    }

    //Check hash map values ‘createdAt’ inside storeservices map where store name = Roseville
    @Test
    public void VerifyStoreName(){
        response.body("data[2].services[2].storeservices.createdAt",equalTo("2016-11-17T17:57:09.417Z"));

    }

    //Verify the state = MN of forth store
    @Test
    public void VetrifyState(){
        response.body("data[4].state",equalTo("MN"));
    }

    //Verify the store name = Rochester of 9th store
    @Test
    public void VerifyRochesterName(){
            response.body("data.name",hasItem("Rochester"));
    }

    //Verify the storeId = 11 for the 6th store
    @Test
    public void VerifyStoreID(){
        response.body("data[5].id",equalTo(11));
    }

    //Verify the serviceId = 4 for the 7th store of forth service
    @Test
    public void VerifyServiceID(){
        response.body("data[6].services[3].id",equalTo(4));
    }





}
