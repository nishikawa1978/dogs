public class Dog {
    private int id;
    private String name;
    private int age;
    private String breed;

    public Dog(){
    }

    public Dog(int id, String name, int age, String breed){
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
