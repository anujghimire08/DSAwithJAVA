# Generic Stack Implementation Using Linked List in Java

## Description
This program implements a **stack data structure** using a **linked list** in Java.  
It is **generic**, meaning it can store any type of data (e.g., Integer, String, custom objects) safely using **Java Generics**.

The stack follows the **LIFO (Last In, First Out)** principle:
- **Push:** Add an element on top of the stack
- **Pop:** Remove the top element
- **Peek:** Get the top element without removing it

---

## Key Features

1. **Generic Design (`<T>`):**
    - Works with any data type.
    - Type-safe; no casting required.

2. **Linked List Implementation:**
    - Dynamically sized; no fixed capacity.
    - Efficient O(1) push and pop operations.

3. **Exception Handling:**
    - Uses `IllegalStateException` for empty stack errors.
    - No `throws Exception` needed; clean API.

4. **OOP Design:**
    - Non-static; multiple stack objects can exist independently.

5. **Utility Methods:**
    - `push(T val)` → Add element to stack
    - `pop()` → Remove top element
    - `peek()` → Get top element without removing
    - `stackSize()` → Get current size of stack
    - `isEmpty()` → Check if stack is empty (optional)
    - `display()` → Show all elements from top to bottom

---

## Advantage
- `Dynamic Size`: Stack can grow or shrink as needed; no fixed size limit.

- `Type-Safe`: Generics ensure only the correct type is stored; no casting required.

- `Efficient Operations`: push and pop are O(1) operations.

- `Clean API`: Exception handling uses IllegalStateException for invalid operations.

- `Reusable`: Can create multiple independent stack objects with different types.

- `Extensible`: Can store primitive wrapper types, Strings, or custom objects.

---

## Class Structure

- `GNode<T>` → Represents a single node of the linked list
- `LinkedListStack<T>` → Stack class using generic linked list nodes

### GNode<T>
- Fields: `T val` (data), `GNode<T> next` (pointer to next node)
- Constructor: Initialize node with a value

### LinkedListStack<T>
- Fields: `GNode<T> head` (top of stack), `int size`
- Methods: `push`, `pop`, `peek`, `stackSize`, `display`, optional `isEmpty`

---

## Conclusion
This implementation demonstrates a clean, professional, and reusable stack in Java using generics and linked lists.
It is suitable for learning data structures, building type-safe APIs, and solving stack-based problems in programming.
By using this design, developers can create stacks for any object type while ensuring proper exception handling and efficient operations.