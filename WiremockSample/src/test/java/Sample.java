import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class Sample {
    public static void main(String[] args) {
        stubFor(get(urlEqualTo("http://localhost:8080/Bakery"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Cakes")));
    }
}