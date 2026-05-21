# Data Structures and Algorithms (DSA) with Java

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=oracle&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Data%20Structures-Comprehensive-007ACC?style=for-the-badge&logo=git&logoColor=white" alt="Data Structures"/>
  <img src="https://img.shields.io/badge/Algorithms-Optimized-4CAF50?style=for-the-badge&logo=leetcode&logoColor=white" alt="Algorithms"/>
  <img src="https://img.shields.io/badge/Status-Maintained-brightgreen?style=for-the-badge&logo=github&logoColor=white" alt="Maintained"/>
</p>

## 📌 Overview

Welcome to **DSAwithJAVA**! This repository is my personal, hands-on space where I document my journey of learning **Data Structures and Algorithms** from scratch using **Java**.

---

## 🚀 Key Learning Tracks

```
               ┌───────────────────────────────────────┐
               │        DSA WITH JAVA WORKFLOW         │
               └───────────────────────────────────────┘
                                │
     ┌──────────────────────────┴─────────────────────┐
     ▼                          ▼                     ▼
┌───────────────┐      ┌───────────────┐      ┌───────────────┐
│ Linear DS     │ ───> │ Non-Linear DS │ ───> │ Algorithms    │
├───────────────┤      ├───────────────┤      ├───────────────┤
│ • Arrays      │      │ • Trees       │      │ • Sorting     │
│ • Linked Lists│      │ • Heaps       │      │ • Searching   │
│ • Stacks      │      │ • Graphs      │      │ • Recursion   │
│ • Queues      │      │ • Hash Maps   │      │ • Complexity  │
└───────────────┘      └───────────────┘      └───────────────┘
```
## 📂 Repository Blueprint & Directory Mapping

Expand the blocks below to explore individual module files and pathways.

<details>
<summary>📂 1. Linear Data Structures</summary>

### 🔹 Arrays (`/Array`)
* **Core Operations:** Traversal, Index-based operations, Min/Max processing, Elements summation, Parameterized passing routines.
* **Array Manipulation (`/ArrayOperation`):**
    * **Insertion:** `Beginning`, `End`, and `Specified Index`.
    * **Deletion:** Multiple functional methods.
    * **Sorting & Searching:** Basic search routines alongside specialized Bubble sort models.

### 🔹 Linked Lists (`/LinkedList`)
* **Singly Linked List (SLL):** Node configuration, traversal displays, insertion/deletion operations at `Head`, `Tail`, and `Custom Positions`.
* **Doubly Linked List (DLL):** Bi-directional traversal node architecture featuring positional insertions and extractions.
* **Circular Linked Lists (CSLL / CDLL):** Circular Singly and Circular Doubly list variations, menu-driven verification scripts, and isolated node adjustments.

### 🔹 Stacks (`/Stack`)
* **Implementations:** Array-backed stacks, custom Singly Linked List-backed stacks, and Generic Linked List Stack components.
* **Core Utilities:** Bottom insertions, stack inversion, and traversal metrics.
* **Expressions Engine (`/InfixPrefixPostfix`):** Comprehensive arithmetic evaluation modules converting and parsing between `Infix`, `Prefix`, and `Postfix` notations.

### 🔹 Queues (`/Queues`)
* **Implementations:** Standard Array queues, Link-state queues, and Circular Array wrappers.
* **Advanced Architecture:** Index-specific dequeuing, custom element prioritizing arrays (`MaxPriorityQueue` and `MinPriorityQueue`), queue reversal mechanics, and `Poll`/`Peek`/`Remove` edge-case handling.
</details>

<details>
<summary>📂 2. Non-Linear Data Structures</summary>

### 🔹 Trees & Binary Search Trees (`/Tree`)
* **Binary Tree Components:** In-order, Pre-order, and Post-order traversal engines, Breadth-First Search (BFS) graphs, tree sizes, heights, and product solvers.
* **Binary Search Tree (BST):** Structured sorted array-to-BST transformations, structural validation algorithms, item insertions, explicit deletions, and predecessor/successor structural mapping queries.

### 🔹 Heaps (`/Heaps`)
* Low-level manual implementations of `MaxHeap` structures and `MinHeap` structures alongside functional abstract priority properties.

### 🔹 Hashing (`/Hash`)
* Memory tracking and structural data lookups utilizing native implementations of `HashSet`, `HashMap`, and sorted `TreeSet`.

### 🔹 Graphs (`/Graphs`)
* High-performance Graph routing maps optimized via Breadth-First Search (`GraphBFS`) and Depth-First Search (`GraphDFS`). Contains analytical notes regarding structural comparisons (`Prim_vs_Kruskal.pdf`).
</details>

<details>
<summary>📂 3. Algorithms & Complexity Analysis</summary>

### 🔹 Recursion Engine (`/Recursion`)
* **Theories Realized:** Direct, Indirect, Nested, Excessive, and Tail Recursion models.
* **Classic Implementations:** Tower of Hanoi solver, Binary Searching, N-th Fibonacci computation, Greatest Common Divisor (GCD), Factorial evaluation, and string/number inversions.


### 🔹 Time and Space Complexity (`/TimeandSpaceComplexity`)
* Structured algorithm comparison questions featuring broken-down multi-approach step answers (`Approach1`, `Approach2`, `Approach3`) mapping the real-world impact of algorithmic scaling.
</details>

<details>
<summary>📂 4. Interview Prep Platforms</summary>

### 🔹 LeetCode & GeeksforGeeks (`/LeetCode` & `/geeksforgeeks`)
* **Queue via Stacks:** Clean solution blueprint deploying dual-stack architectures to mirror queue-like behavior (includes visual mapping diagrams).
* **Singly Linked List Interview Track:** Standard high-frequency interview answers (`LeetCodeSolution1`, `2`, `3`).
* **Queue Processing:** Advanced algorithm workflows evaluating linear tracking patterns like `QueueReverse`.
</details>

---

## 🛠️ Installation & Execution Setup

Ensure you have the [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (Version 8 or above recommended) installed on your system.

### 1. Clone the Repository
```bash
git clone [https://github.com/anujghimire08/DSAwithJAVA.git](https://github.com/anujghimire08/DSAwithJAVA.git)
cd DSAwithJAVA

# Navigate to the Sorting Directory
cd Sorting

# Compile the target file
javac QuickSort.java

# Run the compiled bytecode
java QuickSort

javac src/Main.java
java src.Main

```
---




## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

---

## 📜 License & Acknowledgments

* Distributed under the **MIT License**. See `LICENSE` for more information.
* Built with ☕ using the standard OpenJDK specifications.

---

<p align="center">
  <b>Don't forget to leave a ⭐ if this repo helped you!</b><br>
  <sub>Built with care by</sub>
</p>

[//]: # (<p align="center">)

[//]: # (  <a href="#data-structures-and-algorithms-dsa-with-java">🔺 Back to Top</a>)

[//]: # (</p>)


<div align="center">
  <tr>
    <td align="center" title="Maintainer">
      <a href="https://github.com/anujghimire08">
        <img src="https://github.com/anujghimire08.png?size=90" width="90;" alt="anujghimire08"/>
        <br />
        <sub><b>@anujghimire08</b></b></sub>
      </a>
    </td>
  </tr>
</div>