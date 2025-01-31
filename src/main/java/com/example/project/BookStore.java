package com.example.project;

public class BookStore{

    private Book[] books;
    private User[] users;
    private int bookCount;
    private int userCount;
    
    public BookStore() {
        this.books = new Book[5];
        this.users = new User[10];
        this.bookCount = 0;
        this.userCount = 0;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Book[] getBooks() {
        return books;
    }

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount] = user;
            userCount++;
        } else {
            System.out.println("User array is full.");
        }
    }

    public void removeUser(User user) {
        String name = user.getName();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getName().equals(name)) {
                users[i] = null;
            }
        }

        User[] newList = new User[users.length];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                newList[index] = users[i];
                index++;
            }
        }
        users = newList;
    }

    public void consolidateUsers() {
        User[] newList = new User[users.length];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                newList[index] = users[i];
                index++;
            }
        }
        users = newList;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void insertBook(Book book, int index) {
        if (books[index] == null) {
           books[index] = book;
       } else {
           Book placeholder = books[index];
           books[index] = book;
           books[index + 1] = placeholder;
       }
    }

    public void removeBook(Book book) {
        String name = book.getTitle();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(name)) {
                if (books[i].getQuantity() > 1) {
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } else {
                    books[i] = null;
                }
                break;
            }
        }

        for (int i = 0; i < books.length - 1; i++) {
            if (books[i] == null && books[i + 1] != null) {
                books[i] = books[i + 1];
                books[i + 1] = null;
            }
        }

        int index = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                index++;
            }
        }

        Book[] newList = new Book[index];
        for (int i = 0; i < index; i++) {
            newList[i] = books[i];
        }
        books = newList;
    }

    public String bookStoreBookInfo() {
        StringBuilder info = new StringBuilder("Books in Store:\n");
        for (int i = 0; i < bookCount; i++) {
            info.append(books[i].toString()).append("\n");
        }
        return info.toString();
    }

    public String bookStoreUserInfo() {
        StringBuilder info = new StringBuilder("Users in Store:\n");
        for (int i = 0; i < userCount; i++) {
            info.append(users[i].toString()).append("\n");
        }
        return info.toString();
    }
}
