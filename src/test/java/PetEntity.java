import java.util.List;

public class PetEntity {

    int id;
    Object category;
    String name;
    List<String> photoUrls;
    List<String> tags;
    String status;

    public PetEntity(int id, Object category, String name, List<String> photoUrls, List<String> tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public PetEntity(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Object getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //    String body = "{\n" +
//            "  \"id\": 100500,\n" +
//            "  \"category\": {\n" +
//            "    \"id\": 2000,\n" +
//            "    \"name\": \"string\"\n" +
//            "  },\n" +
//            "  \"name\": \"pesik\",\n" +
//            "  \"photoUrls\": [\n" +
//            "    \"string\"\n" +
//            "  ],\n" +
//            "  \"tags\": [\n" +
//            "    {\n" +
//            "      \"id\": 0,\n" +
//            "      \"name\": \"string\"\n" +
//            "    }\n" +
//            "  ],\n" +
//            "  \"status\": \"available\"\n" +
//            "}";
}
