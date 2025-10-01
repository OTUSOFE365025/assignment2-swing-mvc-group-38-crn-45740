[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

# Assignment 2
| Name | ID | Responsability |
|---|---|---|
| William Lévesque | 100916180 | Q1 (minus diagram), Q2 |
| Saif Siddiqui | 100862747 |  |
| Tavan Mohammed | 100906916 |  |

## Q1
Swing is a GUI framework for Java, part of the Java Foundation Classes (JFC). It provides a wide range of cross-platform components that allow developers to effortlessly create modern and interactive desktop applications. It was designed to replace the old Abstract Window Toolkit (AWT), which was platform-dependent unlike swing. Swing, however is platform independent which was achieved through it being completely written in java. due to this, one can write Swing GUI applications and have them feel the same across many devices. Swing was also designed with MVC architecture in mind, giving developers fine control over the design and behaviour of their applications.

### Class Diagram
Insert pic here

## Q2
The github example swing program implements the MVC pattern well, but with some differences compared to what is in the lecture notes. To begin, the model does only hold buisness logic/data such as the first and last names and the getters/setters. The view contains no buisness logic/data and purely crates the user interface, minus the interaction logic. This does follow the MVC pattern. For the controller, it holds references to both the view and model to act as a mediator between the two. The controller initializes both, listens for events coming from the view and instructs the model on what to do. In this example, the view never gets updated.



## Q3
Explain (maybe)

## Q4
Insert sequence diagram pic
