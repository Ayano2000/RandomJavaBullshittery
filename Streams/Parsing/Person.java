public class Person {
    // Final meaning the variable cannot be changed after its init.
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String Name, int Age, Gender Gendar) {
        this.name = Name;
        this.age = Age;
        this.gender = Gendar;
    }

    public String getName() {
        return (this.name);
    }

    public int getAge() {
        return (this.age);
    }

    public Gender getGender() {
        return (this.gender);
    }

    // uses the @Override annotation to
    // use our toString over the default
    @Override
    public String toString() {
      return ("Person {" + "name='" + name + '\'' +
          ", age=" + age + ", gender=" + gender + '}');
    }
}