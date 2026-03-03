# 📚 Library Management System (Console Based - Java)

## 📌 Project Description

The **Library Management System** is a simple console-based Java application that manages basic library operations.
The system works completely in memory (no database, no file handling).

It allows:

* Adding books
* Registering members
* Borrowing books
* Returning books
* Fine calculation for overdue returns

---

## 🎯 Functional Requirements

### 1️⃣ Add Book

* Add a new book to the library.
* Each book contains:

  * Unique Book ID
  * Title
  * Author
  * Number of Copies

---

### 2️⃣ Register Member

* Register a new library member.
* Each member has:

  * Unique Member ID
  * Name

---

### 3️⃣ Borrow Book

* A member can borrow **maximum 3 books** at a time.
* A book can only be borrowed if copies are available.
* Borrow date is recorded automatically.

---

### 4️⃣ Return Book

* Due period: **14 days**
* Fine: **Rs.2 per day after due date**
* Available copies increase after return.

---

## ⚙️ Constraints

* System operates entirely in memory.
* No file system or database used.
* All operations are menu-driven through console.
* Book ID and Member ID must be unique.
* Available copies decrease on borrow and increase on return.
* Proper error messages are displayed if book/member not found.

---

## 🛠️ Technologies Used

* Java
* OOP Concepts
* ArrayList
* HashMap
* LocalDate (Date handling)
* Eclipse IDE

---

## 📂 Project Structure

LibraryManagementSystem
│
└── src
    └── com.library
        ├── Book.java
        ├── Member.java
        ├── LibrarySystem.java
        └── Main.java

## ▶️ How to Run the Project

1. Open Eclipse IDE.
2. Import or create the project.
3. Run `Main.java` as **Java Application**.
4. Use the console menu to perform operations.

---

## 📸 Sample Output

===== Library Menu =====
1. Add Book
2. Register Member
3. Borrow Book
4. Return Book
5. Exit
Enter choice: 1

Book ID: 101
Title: Java Basics
Author: James
Copies: 5
Book Added Successfully!

## 🧠 OOP Concepts Used

* Encapsulation
* Classes & Objects
* Data Hiding
* Abstraction
* Collection Framework (ArrayList, HashMap)

---

## 🚀 Future Enhancements

* Search Book functionality
* Member Report
* Book Report
* Top Borrowers List
* Database integration (MySQL)
* GUI version using JavaFX or Swing

---

## 👩‍💻 Author

Student Project – Java Console Application
Developed for academic learning purpose.





<img width="511" height="635" alt="image" src="https://github.com/user-attachments/assets/fd38b7c0-59f9-483d-adb3-a8f79df15ec4" />
<img width="466" height="727" alt="image" src="https://github.com/user-attachments/assets/97e12c3d-d5d4-439b-a99c-d2da9230b5a0" />
