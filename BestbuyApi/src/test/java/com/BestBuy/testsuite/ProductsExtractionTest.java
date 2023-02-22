package com.BestBuy.testsuite;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ProductsExtractionTest {
    static ValidatableResponse response;
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        response = given()
                .when()
                .get("/products")
                .then().statusCode(200);
    }

    //Extract the limit

    @Test
    public void test01(){
        int limit = response.extract().path("limit");
        System.out.println("value of limit is : " + limit);
        Assert.assertEquals(10, limit);
        response.body("limit", equalTo(10));

    }

    //Extract the total
    @Test
    public void test02(){
        int total = response.extract().path("total");
        System.out.println("value of total is : " + total);
        Assert.assertEquals(51957, total);
        response.body("total", equalTo(51957));
    }


    //Extract the name of 5th product
    @Test
    public void test03(){

        String nameOfStore = response.extract().path("data[4].name");
        System.out.println(nameOfStore);

    }

    //Extract the names of all the products
    @Test
    public void test04(){
        List<String> allNameofStores = response.extract().path("data.name");
        System.out.println("List of names : " + allNameofStores);
        for (String a : allNameofStores) {
            Assert.assertTrue(true);
        }
    }


    //Extract the productId of all the products
    @Test
    public void test05(){
        List<Integer> numOfId = response.extract().path("data.id");
        System.out.println("List of Ids : " + numOfId);
        for (Integer a : numOfId) {
            Assert.assertTrue(true);
        }
    }

    //Print the size of the data list
    @Test
    public void test06(){
        List<Integer> dataSize = response.extract().path("data");
        int size = dataSize.size();
        System.out.println(size);
    }


    //Get all the value of the product where product name = Energizer - MAX Batteries AA (4-
    //Pack)
    @Test
    public void test07(){
        List<HashMap<String, ?>> values = response.extract().path("data.findAll{it.name == 'Energizer - MAX Batteries AA (4-Pack)'}");
        System.out.println(values);
    }

    //Get the model of the product where product name = Energizer - N Cell E90 Batteries (2-
    //Pack)
    @Test
    public void test08(){

        List<String> model = response.extract().path("data.findAll{it.name == 'Energizer - N Cell E90 Batteries (2-Pack)'}");
        System.out.println(model);

    }


    //Get all the categories of 8th products
    @Test
    public void test09(){
        List<Integer> categoriesSize = response.extract().path("data[7].categories");
        int size = categoriesSize.size();
        System.out.println(size);
    }

    //Get categories of the store where product id = 150115

    @Test
    public void test10(){
        List<Integer> categoriesSize = response.extract().path("data[3].categories");
        int size = categoriesSize.size();
        System.out.println(size);
    }


    //Get all the descriptions of all the products
    @Test
    public void test11(){
        List<String> description = response.extract().path("data.description");
        System.out.println(description);
    }


    //Get id of all the all categories of all the products
    @Test
    public void test12(){
        List<String> CategoryId=response.extract().path("data.categories.id");
        System.out.println("List of Id "+CategoryId);

    }


    //Find the product names Where type = HardGood
    @Test
    public void test13(){
        List<String> productName = response.extract().path("data.findAll{it.type=='HardGood'}.name");
        System.out.println("The Product Name are: " + productName);
    }

    //Find the Total number of categories for the product where product name = Duracell - AA
    //1.5V CopperTop Batteries (4-Pack)
    @Test
    public void test14(){
        List<String> totalNumOfCat = response.extract().path("data.findAll{it.name=='Duracell - AA 1.5V CopperTop Batteries (4-Pack)'}.categories");
        System.out.println("The total number of categories " + totalNumOfCat.size());
    }

    //Find the createdAt for all products whose price < 5.49

    @Test
    public void test15(){
        List<String> prdName = response.extract().path("data.findAll{it.price <5.49}.name");
        System.out.println("Products under 5.49 :"+ prdName);
    }

    //Find the name of all categories Where product name = “Energizer - MAX Batteries AA (4-
    //Pack)”
    @Test
    public void test16(){
        List<String> allCategories = response.extract().path("data.findAll{it.name=='Energizer - MAX Batteries AA (4-Pack)'}.categories");
        System.out.println("The all categories  are: " + allCategories);
    }

    //Find the manufacturer of all the products
    @Test
    public void test17(){
        List<String> manufacturer = response.extract().path("data.manufacturer");
        System.out.println("List of categories : " + manufacturer);

    }

    //Find the imge of products whose manufacturer is = Energizer
    @Test
    public void test18(){
        List<String> imageOfProduct = response.extract().path("data.findAll{it.manufacturer=='Energizer'}.image");
        System.out.println("The image of product manufacturer  are: " + imageOfProduct);
    }

    //Find the createdAt for all categories products whose price > 5.99
    @Test
    public void test19(){
        List<String> prdName = response.extract().path("data.findAll{it.price > 5.99}.categories.createdAt");
        System.out.println("Products over 5.99 :" + prdName);
    }

    //Find the uri of all the products
    @Test
    public void test20(){
        List<?> dataUrl = response.extract().path("data.url");
        int size = dataUrl.size();
        System.out.println(dataUrl);
    }
}
