package creational.prototype;

public abstract class Person {
    public int id;
    public String firstName;
    public String lastName;

    public Person(){

    }
    public Person(Person person){
        if(person!=null){
            //id = person.id;
            firstName = person.firstName;
            lastName = person.lastName;
        }
    }

    public abstract Person clone();
}
