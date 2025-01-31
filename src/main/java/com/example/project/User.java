package com.example.project;
 
public class User {

    private String name;
    IdGenerate newID = new IdGenerate();
    private String Id = newID.getCurrentId();
    private Book[] book = new Book[5]; 

     
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    public String getId() {
        return Id;
    }
    
    public void setId(String Id) {
        this.Id = Id;
    }
     
    public Book[] getBook() {
        return book;
    }
    
    public void setBooks(Book[] book) {
        this.book = book;
    }
    
    public String bookListInfo() {
        String str = "Books: \n";
        for (Book book : book) {
            if (book == null) {
                str += "empty\n";
            } else {
                str += book.bookInfo() + "\n";
            }
        }
        return str;
    }
    
    public String userInfo() {
        String str = "";
        str += "Name: " + name + "\nId: " + Id + "\n";
        str += bookListInfo();
        return str;
    }
}