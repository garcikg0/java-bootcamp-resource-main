import java.util.Objects;

public class Person {
  
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "{" +
            " name= " + getName() + "'" +
            ", age= " + getAge() + "'" +
            "}";
    }


}

// Write equals in VSCode and let intellisense automcomplete the method for you. 
// @Override annotation means we're overriding a method that we inherited. 
// You don't have to include it, but you should leave it. 
// Because if you misspell the method, it's going to throw an error and say there's not method equal to the misspelled method to override.



