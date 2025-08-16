# AbstractShape Project

This Java project demonstrates **abstraction** and **object-oriented programming concepts** by defining shapes and calculating their **areas** and **perimeters**.  

---

## 📂 Project Structure

| File Name | Description |
|-----------|-------------|
| `Shape.java` | Abstract class defining common attributes and methods for all shapes. |
| `Circle.java` | Subclass of `Shape` that implements area and perimeter calculations for a circle. |
| `Rectangle.java` | Subclass of `Shape` that implements area and perimeter calculations for a rectangle. |
| `InvalidShapeException.java` | Custom exception to handle invalid shapes (e.g., negative dimensions). |
| `Main.java` | Main class to run the project and demonstrate shape calculations. |

---

## 🛠 Concepts Used

- **Abstraction:** Using abstract classes to define a common structure for shapes.  
- **Inheritance:** `Circle` and `Rectangle` inherit from the `Shape` abstract class.  
- **Exception Handling:** Custom exception `InvalidShapeException` for invalid input.  
- **Polymorphism:** Calling overridden methods of shape subclasses through a common reference.  

---

## 💻 How to Run

1. Open the `AbstractShape` project in **IntelliJ IDEA**.  
2. Compile all classes (`Shape`, `Circle`, `Rectangle`, `InvalidShapeException`, `Main`).  
3. Run the `Main.java` file to see the program in action.  

---

> This project demonstrates **clean design using abstraction**, making it easy to add more shapes in the future by extending the `Shape` abstract class.
