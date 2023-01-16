package creational.prototype;

public abstract class Person {
    public String firstName;
    public String lastName;

    public Person(){

    }
    public Person(Person person){
        if(person!=null){
            firstName = person.firstName;
            lastName = person.lastName;
        }
    }

    public abstract Person clone();
}
