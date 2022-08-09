// Домашка 1.10 Методы объектов
/*Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. 
Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.*/
//import java.util.Objects;
public class Book{
    private String title;
    private Author author;
    private int year;

    public Book (String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear (int year){
        this.year = year;}

    @Override
    public String toString(){
        //return title + " : " + getAuthor() + " - " + year;
        return title + " : " + getAuthor() +  " - " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title == book.title;
    }

    @Override
    public int hashCode() {
    //    return java.util.Objects.hashCode(year);
        return java.util.Objects.hash(year);
    }
}