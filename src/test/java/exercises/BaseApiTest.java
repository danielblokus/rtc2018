package exercises;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

class BaseApiTest {

    private static final String HOST_URL = "http://localhost";
    private static final int PORT = 9876;
    private static final String BASE_PATH = "/api/f1";

    static RequestSpecification createRequestSpecification() {
        return new RequestSpecBuilder().
                setBaseUri(HOST_URL).
                setPort(PORT).
                setBasePath(BASE_PATH).
                build();
    }
}