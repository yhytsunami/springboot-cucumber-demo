import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.Asserts;
import org.junit.Assert;

public class Steps extends TestBootClass{

    String result;

    @When("the client calls /greeting")
    public void get(){
        result = restTemplate.getForObject(baseUri + port + "/greeting", String.class);
        System.out.println(result);
    }

    @Then("the client receives answer contains {int}")
    public void the_client_receives_answer_as(int expected) {
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains(String.valueOf(expected)));
    }
}
