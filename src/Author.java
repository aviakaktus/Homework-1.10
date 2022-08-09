// Домашка 1.10 Методы объектов
//import java.util.Objects;
public class Author{
    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName == author.firstName;
    }
    //        return Object.hash(firstName);
    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(firstName);
    }
}
