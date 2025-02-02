/*
 Use Case: Library Management System Using OOP Concepts
 
Problem Statement:
Design a library management system where users can borrow and return books. The system should manage books, library members, and borrowing operations using object-oriented programming (OOP) concepts such as encapsulation, inheritance, polymorphism, and abstraction.
 
Requirements:
 
Book Management:
- Store details of books (ID, title, author, genre, availability).
- Allow marking a book as borrowed or returned.
 
User Management:
- Two types of users: Members and Librarians.
- Members can borrow and return books.
- Librarians can add or remove books.
 
Borrowing Logic:
- Ensure a member cannot borrow more than a specified number of books.
- Track borrowed books for each member.
 
Design:
 
1. Classes:
 
Book:
Fields: bookId, title, author, genre, isAvailable.
Methods: borrowBook(), returnBook(), displayDetails().
 
User (Abstract Class):
Fields: userId, name.
Abstract Methods: performAction().
 
Member (Derived Class):
Additional Field: borrowedBooks (List of borrowed books).
Methods: borrowBook(Book), returnBook(Book).
 
Librarian (Derived Class):
Methods: addBook(Book), removeBook(Book).
 
Library:
Fields: books (List of all books), users (List of all users).
Methods: registerUser(), searchBook(), listAvailableBooks().
 
 */
class Book {
     int bookId;
     String title;
     boolean isAvailable;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        }
    }
}


