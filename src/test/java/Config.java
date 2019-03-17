public class Config {
    public static final String PET_STORE_BASE_URI = "https://petstore.swagger.io/v2";
    public static final String GET_PET_ENDPOINT = "/pet/{id}"; //для этого используем .pathParam так как это путь

    public static final String GET_PET_BY_STATUS = "/pet/findByStatus"; //для этого используем .param и без {} так как это не путь, а параметр
    public static final String CREATE_PET = "/pet";
}
