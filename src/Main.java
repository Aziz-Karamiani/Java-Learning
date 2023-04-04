import com.jabeh.video.Video;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, 23, "Aziz", "Karamiani");

        System.out.println(employee.getId());
        System.out.println(employee.getAge());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());

        System.out.println(employee.getMailingName());
        System.out.println(employee.getMailingName(false));
        System.out.println(employee.getMailingName(true));

        Book[] books = new Book[5];
        books[0] = new Book("Java", "Tod", 354);
        books[1] = new Book("PHP", "Jon", 450);
        books[2] = new Book("Laravel", "Jan", 554);
        books[3] = new Book("Ruby ON Rails", "Jun", 157);
        books[4] = new Book("Golang", "Sara", 554);

        for (Book book: books) {
            if (book != null)
                System.out.println(book.getTitle());
        }

        Video video = new Video(123, "Video1", true, "https://jabeh.com/a.mp4", "https://jabeh.com/a.jpg");

        System.out.println(video.getVideoUrl());


        int[] numbers = new int[3];
        System.out.println(numbers.length);
        Arrays.fill(numbers, 1);
        System.out.println(Arrays.toString(numbers));
    }
}
