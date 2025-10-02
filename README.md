[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)
Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

# Assignment 2
| Name | ID | Responsability        |
|---|---|-----------------------|
| William Lévesque | 100916180 | Q1 (minus diagram), Q2 |
| Saif Siddiqui | 100862747 | Code development      |
| Tavan Mohammed | 100906916 |                       |

## Q1
Swing is a GUI framework for Java, part of the Java Foundation Classes (JFC). It provides a wide range of cross-platform components that allow developers to effortlessly create modern and interactive desktop applications. It was designed to replace the old Abstract Window Toolkit (AWT), which was platform-dependent unlike swing. Swing, however is platform independent which was achieved through it being completely written in java. due to this, one can write Swing GUI applications and have them feel the same across many devices. Swing was also designed with MVC architecture in mind, giving developers fine control over the design and behaviour of their applications.

### Class Diagram
Insert pic here

## Q2
The github example swing program implements the MVC pattern well, but with some differences compared to what is in the lecture notes. To begin, the model does only hold buisness logic/data such as the first and last names and the getters/setters. The view contains no buisness logic/data and purely crates the user interface, minus the interaction logic. This does follow the MVC pattern. For the controller, it holds references to both the view and model to act as a mediator between the two. The controller initializes both, listens for events coming from the view and instructs the model on what to do. In this example, the view never gets updated.

This example implements the MVC differently in many ways. In the lecture, we cover ways of implementing this architecture using a type of observer pattern, meaning the view and model are observer and subject respectively. The main differences this creates is how information gets passed around. 

View - Controller: For both implementations, the view sends events from the user to the controller. However, in the github example, the view gets modified directly by the controller. This should not happen in the observer-pattern version.

Controller - Model: For both implementations, the controller calls the model's functions to complete tasks depending on what the user does. However, for the swing example, the controller also queries the model which should not happen in the observer version. 

Model - View: For the swing implementation, the view does not query the model ever, and the model never notifies views that something changed. This is core to the observer pattern version, since the view and model are the observer and subject.

Coupling: For the github example, the system is tightly coupled through the controller. The observer version makes this easier since the view and controller are more loosly coupled. Same with the view and model, since they work off the observer pattern. This also has the effect of making adding views an easier task, since they are not tightly coupled, and simply need to be added as observers to the model.

## Q3
Explain (maybe)

## Q4
Insert sequence diagram pic
