package org.vizuri.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

  //  @Test
    public void testHelloEndpoint() {
        Person p = new Person();
        p.setFirstName("Fred");
        p.setLastName("Flintstone");
        p.setId(1);

        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is(p));
    }

}