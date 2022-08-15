public class Main {




    public static void main(String[] args) {

        Author author1 = new Author("Антон", " Чехов");
        Author author2 = new Author("Николай", " Гоголь");


        Book book1 = new Book("Человек в футляре", 1898, author1);
        Book book2 = new Book("Ревизор", 1836, author2);


        System.out.println("Имя автора: " + author1.getName() + ", Фамилия автора: " + author1.getSurname());
        System.out.println("Имя автора: " + author2.getName() + ", Фамилия автора: " + author2.getName());
        System.out.println("Название книги: " + book1.getName() + ", Год издания книги: " + book1.getYear() + ", Автор книги: " + book1.getAuthor().getName() + author1.getSurname());
        System.out.println("Название книги: " + book2.getName() + ", Год издания книги: " + book2.getYear() + ", Автор книги: " + book2.getAuthor().getName() + author2.getSurname());
    }


}