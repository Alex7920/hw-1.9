public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Name1", "Surname1");
        Author author2 = new Author("Name2", "Surname2");

        Book book1 = new Book("Title1", 2020, author1);
        Book book2 = new Book("Title2", 2021, author2);


        System.out.println("Имя автора: " + author1.getName() + ", Фамилия автора " + author1.getName());
        System.out.println("Имя автора: " + author2.getName() + ", Фамилия автора " + author2.getName());
        System.out.println("Название книги: " + book1.getName() + ", Год издания книги " + book1.getYear() + ", Автор книги: " + book1.getAuthor().getName());
        System.out.println("Название книги: " + book2.getName() + ", Год издания книги " + book2.getYear() + ", Автор книги: " + book2.getAuthor().getName());
    }
}