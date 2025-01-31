package com.example.project;

/*The BookStore class represents a book store with a collection of books and users.
  It provides methods to add, remove, and manage books and users within the store.
 */
public class DummyBookStore {

    // Attributes
    private Book[] books = new Book[5]; // Array to store up to 5 books.
    private User[] users = new User[10]; // Array to store up to 10 users.
    private static int number = 0; // A counter to track the number of users added.

    /* Constructor initializes the book store. */
    public DummyBookStore() {}

    //return The array of users.
    public User[] getUsers() {
        return users;
    }

    // Sets the list of users in the store.
     
    public void setUsers(User[] users) {
        this.users = users;
    }

    //return The array of books.
     
    public Book[] getBooks() {
        return books;
    }

    //Adds a new user to the store.
    
    public void addUser(User user) {
        users[number] = user;
        number++;
    }

    //Removes a user from the store by name.
    public void removeUser(User user) {
        String name = user.getName();
        //Compare each user name in the users list
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName().equals(name)) {
                users[i] = null; //if name match, then set to null (remove)
            }
        }

        // Create a new list without null entries.
        User[] newList = new User[users.length];
        int index = 0;
        //count how long the list will be
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                //if the item/name doens't equal to null
                newList[index] = users[i];
                //index increment by one
                index++;
            }
        }
        //set the list with a new length without and null item
        users = newList;
    }

    /**
     * Consolidates the user list by removing any null entries (after user removal).
     */
    public void consolidateUsers() {
        User[] newList = new User[users.length];
        int index = 0;
        //count how long the list will be
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                //if the item/name doens't equal to null
                newList[index] = users[i];
                //index increment by one
                index++;
            }
        }
          //set the list with a new length without and null item
        users = newList;
    }

    // Adds a book to the store's book collection.
  
    public void addBook(Book book) {
        //for each book in the books list
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                //check if the book's place is already taken
                books[i] = book;
                //if not, add the book, then exist the loop
                break;
            }
        }
    }

    //Inserts a book at a specified index in the store's book collection.
   
    public void insertBook(Book book, int index) {
        if (books[index] == null) {
             //check if the book's place is already taken
             //if not, add the book
            books[index] = book;
        } else {
            //if the book's place is already taken
            Book placeholder = books[index];
            //create a place holder for the book
            books[index] = book;
            //insert the book, then move the previous one back 
            books[index + 1] = placeholder;
        }
    }

    /*
     Removes a book from the store's collection by title.
     If there are multiple copies, it decreases the quantity.
     If only one copy is left, the book is removed entirely. 
     */
     
    public void removeBook(Book book) {
        String name = book.getTitle();
        //get the name of the book that is going to be removed
        for (int i = 0; i < books.length; i++) {
            //compare it with each book in the list
            if (books[i] != null && books[i].getTitle().equals(name)) {
                //if is found, quantity decrease by one
                if (books[i].getQuantity() > 1) {
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } else {
                    //if there is only one copy, then it will be empty
                    books[i] = null;
                }
                //exist the loop once the book is found
                break;
            }
        }

        // Shift the remaining books to fill in the gaps.
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null && books[i + 1] != null) {
                //move the book one place forward
                books[i] = books[i + 1];
                //delete the book to prevent duplicate copies
                books[i + 1] = null;
            }
        }

        // Create a new list with no null entries.
        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                //find the length of the list without null value
                index++;
            }
        }

        Book[] newList = new Book[index];
        for (int i = 0; i < index; i++) {
            //set the new list of book without null value
            newList[i] = books[i];
        }
        //set the new list of book without null value
        books = newList;
    }
}