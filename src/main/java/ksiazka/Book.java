package ksiazka;

public class Book {
    /*
    Write a class named Book. It must have three fields:
    a string field title, an int field yearOfPublishing,
    an array of strings authors and a constructor to initialize
    these fields. The order of parameters in the constructor
    must be the same as presented above.
    */
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
}
