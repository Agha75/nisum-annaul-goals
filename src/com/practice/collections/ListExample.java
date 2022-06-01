package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

// Note:List is an interface so object of list cannot be created
// add will add value on particular index
// set will update the value on particular index
public class ListExample {
    public static void main(String[] args) {
        // Creating an object of List interface
        // implemented by the ArrayList class
        List<Integer> list=new ArrayList<Integer>();
        list.add(0,2);
        list.add(1,3);
        // Print the elements inside the object
        System.out.println(list);


        // Now creating another object of the List
        // interface implemented ArrayList class
        // Declaring object of integer type
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Will add list list2 from 1 index
        list.addAll(1, list2);
        System.out.println(list);



        // Removes element from index 1
        list.remove(1);
        // Printing the updated List 1
        System.out.println(list);


        // Prints element at index 3 in list 1
        // using get() method
        System.out.println(list.get(3));


        // Replace 0th element with 5
        // in List 1
        list.set(0, 5);
        // Again printing the updated List 1
        System.out.println(list);
    }
}
//    add(int index, element)	This method is used to add an element at a particular index in the list. When a single parameter is passed, it simply adds the element at the end of the list.
// addAll(int index, Collection collection)	This method is used to add all the elements in the given collection to the list. When a single parameter is passed, it adds all the elements of the given collection at the end of the list.
// size()	This method is used to return the size of the list.
// clear()	This method is used to remove all the elements in the list. However, the reference of the list created is still stored.
// remove(int index)	This method removes an element from the specified index. It shifts subsequent elements(if any) to left and decreases their indexes by 1.
// remove(element)	This method is used to remove the first occurrence of the given element in the list.
// get(int index)	This method returns elements at the specified index.
// set(int index, element)	This method replaces elements at a given index with the new element. This function returns the element which was just replaced by a new element.
// indexOf(element)	This method returns the first occurrence of the given element or -1 if the element is not present in the list.
// lastIndexOf(element)	This method returns the last occurrence of the given element or -1 if the element is not present in the list.
// equals(element)	This method is used to compare the equality of the given element with the elements of the list.
// hashCode()	This method is used to return the hashcode value of the given list.
// isEmpty()	This method is used to check if the list is empty or not. It returns true if the list is empty, else false.
// contains(element)	This method is used to check if the list contains the given element or not. It returns true if the list contains the element.
// containsAll(Collection collection)	This method is used to check if the list contains all the collection of elements.
// sort(Comparator comp)	This method is used to sort the elements of the list on the basis of the given comparator.