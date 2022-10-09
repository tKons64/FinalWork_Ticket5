public class Main {
    public static void main(String[] args) {

        Book[] book = new Book[5];
        book[0] = new Book("Идиот", "Достоевский Федор Михайлович");
        book[1] = new Book("Шантарам", "Грегори Дэвид Робертс");
        book[2] = new Book("Война и мир", "Толстой Лев Николаевич");
        book[3] = new Book("Мцыри", "Лермонтов Михаил Юрьевич");
        book[4] = new Book("Мертвые души", "Гоголь Николай Васильевич");

        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                continue;
            }
            System.out.println(book[i].toString());
        }
    }


}