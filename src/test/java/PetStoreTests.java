import org.testng.annotations.Test;

public class PetStoreTests {

    final static PetEndPoint PET_ENDPIONT = new PetEndPoint();
//    final static PetStatus PET_STATUS = new

    @Test
    public void getPetById200(){
        PET_ENDPIONT
                .getPerBuId(100500)
                .then().statusCode(200);
    }

    @Test
    public void getPetByIr404(){
        PET_ENDPIONT
                .getPerBuId(0)
                .then().statusCode(404);
    }


    @Test
    public void getPetByStatus200(){
        PET_ENDPIONT
                .getPetByStatus("available")
                .then()
                .statusCode(200);
    }

//    @Test
//    public void getPetByStatus404(){
//        PET_ENDPIONT
//                .getPetByStatus("lоавлd")
//                .then()
//                .statusCode(404);
//    }

    @Test
    public void createPet(){
        PetEntity petEntity = new PetEntity(3333, "Tomas", "available");
        PET_ENDPIONT
                .createPet(petEntity)
                .then().statusCode(200);
    }

}
