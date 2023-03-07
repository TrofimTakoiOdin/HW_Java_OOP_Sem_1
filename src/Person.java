public class Person extends IdeaOfPerson implements ProjectInterfaces.PersonInterface{
    private String fullName;
    private int age;


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printNameAndAge() {
        System.out.println("Имя " + fullName + ". Возраст: " + age);
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }
}