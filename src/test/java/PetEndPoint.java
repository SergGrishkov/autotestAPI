import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetEndPoint {

    private RequestSpecification given(){
        return RestAssured.given()
                .baseUri(Config.PET_STORE_BASE_URI)
                .contentType("application/json") //строка серелизует строку, которая как текст, в формат json. для случая, когда хардкодим строку для тестовой вставки
                .log().uri();
    }

    public Response getPerBuId(int petId){
        return given()
                .basePath(Config.GET_PET_ENDPOINT)
                .pathParam("id",petId)
                .get()
                .then().extract().response();
    }

    public Response getPetByStatus(String status){
        return given()
                .basePath(Config.GET_PET_BY_STATUS)
                .param("status", status)
                .get()
                .then().extract().response();
    }

    public Response createPet(PetEntity petEntity){
        return given()
                .basePath(Config.CREATE_PET)
                .body(petEntity)
                .post()
                .then().extract().response();
    }

}
