import io.cucumber.spring.CucumberContextConfiguration;
import org.assertj.core.api.UrlAssert;
import org.example.web.controller.Main;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@CucumberContextConfiguration
@SpringBootTest(classes = Main.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestBootClass {
    protected RestTemplate restTemplate = new RestTemplate();
    protected String baseUri = "http://localhost:";

    @LocalServerPort
    protected int port;
}
