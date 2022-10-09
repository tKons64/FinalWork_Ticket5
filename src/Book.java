public class Book {
    private String title;
    private String author;

    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String toStringAuthor() {
        String[] arrAuthor = author.split(" ");
        String firstName = arrAuthor[1];
        String lastName = arrAuthor[0];
        String firstName2 = arrAuthor[2];

        return firstName.charAt(0) + ". " + firstName2.charAt(0) + ". " + lastName;
    }

    @Override
    public String toString() {
        return "'" + title + "' " + toStringAuthor();
    }
}
