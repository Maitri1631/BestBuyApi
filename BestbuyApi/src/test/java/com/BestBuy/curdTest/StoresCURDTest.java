package com.BestBuy.curdTest;

import com.BestBuy.model.StorePojo;
import com.BestBuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StoresCURDTest extends TestBase {

    @Test
    public void GetAllRecord(){
        Response response=given()
                .when()
                .get();
        response.then().statusCode(200);
        response.prettyPrint();
    }


    @Test
    public void GetById(){
        Response response=given()
                .pathParam("id","6")
                .when()
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void CreateStore(){
        List<String> services =new ArrayList<>();
        services.add("Geek Squad Services");
        services.add("2016-11-17T17:56:35.881Z");
        services.add("2016-11-17T17:56:35.881Z");

        List<String> StoreService =new ArrayList<>();
        StoreService.add("2016-11-17T17:57:09.414Z");
        StoreService.add("2016-11-17T17:57:09.414Z");



        StorePojo pojo=new StorePojo();
        pojo.setName("Maitri");
        pojo.setType("Bigbox");
        pojo.setAddress("Ste Anne Road");
        pojo.setAddress2("");
        pojo.setCity("Sudbury");
        pojo.setState("Ontario");
        pojo.setZip("P3C5M4");
        pojo.setLate(30.4546);
        pojo.setLng(-41.48698464);
        pojo.setHours("Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8");
        pojo.setCrateddate(2016-11-17);
        pojo.setUpdatedate(2016-11-17);

        Response response= given()
                .body(pojo)
                .post();
        response.then().log().all().statusCode(201);
        response.prettyPrint();


    }

    @Test
    public void PutStore(){

    }

    @Test
    public void DeleteStore(){

    }
}
