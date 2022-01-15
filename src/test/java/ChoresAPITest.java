import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.Arrays;
import java.util.List;
import models.Chore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Configuration;


@DisplayName("Test SUITE for CHORES API")
public class ChoresAPITest {

  private Configuration configuration = Configuration.getInstace();

  @Test
  public void test_getAllChores_Should_Return_200() {

    String url = configuration.getBackEndServiceHostUrl() + "/chores";

    Response choresResponse = RestAssured.get(url);

    int actualStatusCodeOfResponse = choresResponse.getStatusCode();

    int expectedHTTPStatusCode = 200;
    Assertions.assertEquals(expectedHTTPStatusCode, actualStatusCodeOfResponse);

  }

  @Test
  public void test_getAllChores_Should_Return_MoreThan_1_element() {

    String url = configuration.getBackEndServiceHostUrl() + "/chores";

    List<Chore> chores = Arrays.asList(RestAssured.get(url).then().extract().response().getBody().as(Chore[].class));

    Assertions.assertTrue(chores.size() > 1);
  }

}
