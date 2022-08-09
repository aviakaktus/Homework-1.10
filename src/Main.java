import java.sql.SQLOutput;

// Домашка 1.10 Методы объектов
/*Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке. */
//import java.util.Objects;
public class Main
{
    public static String printSeparator(){
        return " - ";

    }
    public static void main(String[] args) {

        Author bruceEckel = new Author ("Bruce", "Eckel");
        Author herbertSchildt = new Author ("Herbert", "Schildt");
        Author herbertWells = new Author ("Herbert", "Wells");

        Book thinkingInJava = new Book ("Thinking in Java", bruceEckel, 1998);
        Book completeReference = new Book ("Java: The Complete Reference", herbertSchildt, 2002);
        Book thinkingInJava2 = new Book ("Thinking in Java", bruceEckel, 1998);
        Book timeMashine = new Book ("The Time Mashine", herbertWells, 1895);

        Book artOfC = new Book ("The Art of C++", herbertSchildt, 1998); //2004

        System.out.println(thinkingInJava.getTitle() + printSeparator() + thinkingInJava.getAuthor()+ printSeparator() + thinkingInJava.getYear());
        System.out.println(completeReference.getTitle() + printSeparator() + completeReference.getAuthor()+ printSeparator() + completeReference.getYear());
        System.out.println(artOfC);

        System.out.println(herbertWells.equals(herbertSchildt));
        System.out.println(thinkingInJava.equals(thinkingInJava2));
        System.out.println(herbertWells.equals(bruceEckel));
        System.out.println(thinkingInJava.hashCode());
        System.out.println(thinkingInJava2.hashCode());
        System.out.println(artOfC.hashCode());

        System.out.println(herbertSchildt.hashCode());
        System.out.println(herbertWells.hashCode());
    }
}