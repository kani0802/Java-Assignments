# Java Assignment 4

**Course:** CSIT751 (Core Java)  
**Module:** 4 – Collections and GUI Programming  
**Submitted by:** Nischay

This repository contains solutions to all 18 practical questions, kept in the same order as the assignment.

## Questions

1. ArrayList Basics — `ArrayListBasics.java`
2. Vector Usage — `VectorUsage.java`
3. HashSet Demonstration — `HashSetDemo.java`
4. LinkedList as Queue — `LinkedListQueue.java`
5. HashMap Usage — `HashMapUsage.java`
6. TreeSet Sorting — `TreeSetSorting.java`
7. Hashing Example — `HashingExample.java`
8. Simple AWT Frame — `SimpleAWTFrame.java`
9. AWT Button Click Event — `AWTButtonClick.java`
10. AWT Menu Example — `AWTMenuExample.java`
11. Swing JFrame — `SwingJFrame.java`
12. Swing JButton and JLabel — `SwingButtonLabel.java`
13. GridLayout Example — `GridLayoutExample.java`
14. BorderLayout Example — `BorderLayoutExample.java`
15. Event Handling - ActionListener — `ActionListenerExample.java`
16. MouseListener Example — `MouseListenerExample.java`
17. KeyListener Example — `KeyListenerExample.java`
18. Adapter Class Example — `WindowAdapterExample.java`

## Requirements

- Java JDK 8 or newer.
- A desktop environment is required to run the AWT/Swing GUI programs.

## Compile all programs

From this folder, run:

```bash
javac *.java
```

Each file has its own class name, so all 18 source files can compile together without class-name conflicts.

## Run an individual program

For example:

```bash
java ArrayListBasics
java VectorUsage
java HashSetDemo
```

Run any one class at a time. `HashMapUsage` asks for a student name (for example, `Alice`) as input. The GUI examples open a window and should be run on a computer with desktop support; they may not display in a headless online compiler.

## Notes

- `HashSet` does not guarantee iteration order. Its values are displayed in sorted order for predictable sample output.
- The KeyListener example listens for key presses when the window has keyboard focus.
