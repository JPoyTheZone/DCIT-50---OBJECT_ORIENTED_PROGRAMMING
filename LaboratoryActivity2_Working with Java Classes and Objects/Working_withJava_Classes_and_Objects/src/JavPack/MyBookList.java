package JavPack;

public class MyBookList {
    public static void main(String[] args) {
        // 1.) Create the following books that contains the title, author, year published. Use the Book class for this part.
        //      Rich Dad Poor Dad, Robert Kiyosaki, 1997
        //      The Power of Habit, Charles Duhigg, 2012
        //      Atomic Habits, James Clear, 2018
        //      Java Programming, John Doe, 2020
        //      Add your own favorite book
        Book Rich_Dad_Poor_Dad = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book The_Power_of_Habit = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book Atomic_Habits = new Book("Atomic Habits", "James Clear", 2018);
        Book Java_Programming = new Book("Java Programmng", "John Doe", 2020);
        Book ShipsOfDeesUse = new Book ("ShipsOfDeesUse","YoursTruly", 2025);
        System.out.print("\n\n");
        
        // 2.) Display the details of each book using the displayDetails method. Below is the sample output
        //     Title: Rich Dad Poor Dad, Author: Robert Kiyosaki, Year: 1997, Current Page: 0
        //     Title: The Power of Habit, Author: Charles Duhigg, Year: 2012, Current Page: 0
        //     Title: Atomic Habits, Author: James Clear, Year: 2018, Current Page: 0
        //     Title: Java Programming, Author: John Doe, Year: 2020, Current Page: 0
        Rich_Dad_Poor_Dad.displayDetails();
        The_Power_of_Habit.displayDetails();
        Atomic_Habits.displayDetails();
        Java_Programming.displayDetails();
        ShipsOfDeesUse.displayDetails();
        System.out.print("\n\n");

        // 3.) Change the current page of "Rich Dad Poor Dad" to 50 and "Atomic Habits" to 100 using the changePage method. Display the details again for the two books.
        ((Book) Rich_Dad_Poor_Dad.changePage(50)).displayDetails();
        ((Book) Atomic_Habits.changePage(100)).displayDetails();
        System.out.print("\n\n");
        
        // 4.) Change the current page of your favorite book to any page number you like. Display the details again for your favorite book.
        ((Book) Java_Programming.changePage(77)).displayDetails();
        System.out.print("\n\n");
        
        // 5.) Change the author of "Java Programming" to "Jane Smith". Display the details again for the book.
        ((Book) Java_Programming.ChangeAuthor("Jane Smith")).displayDetails();
        System.out.print("\n\n");
        
        // 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of the books published after 2010.
        Object[] BookShelf= {
                Rich_Dad_Poor_Dad,
                The_Power_of_Habit,
                Atomic_Habits,
                Java_Programming,
                ShipsOfDeesUse
        };
        
        for(int i=0 ; i < BookShelf.length; i++) {
        	Book CurrentBook = (Book) BookShelf[i];
        	if ( CurrentBook.year_published > 2010) {
        		System.out.println(CurrentBook.title);
        	};
        };
    }
}