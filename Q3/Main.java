package day9.Q3;

public class Main {

}


//Q3) Why is multiple inheritance not supported in Java at class level ?
//Answer:
//The reason behind this is to prevent ambiguity.
//
//Consider a case where class B extends class A and Class C and both class A and C have the same method display().
//
//Now java compiler cannot decide, which display method it should inherit. 
//To prevent such situation, multiple inheritances is not allowed in java.