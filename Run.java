package Exersice11_6;
import java.util.*;


/*
 Write a method countUnique that accepts a list of integers as a parameter and
 returns the number of unique integer values in the list.
 Use a set as auxiliary storage to help you solve this problem.
 For example, if a list contains the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5.
 The empty list contains 0 unique values.
 */
public class Run
{

    public static void main(String[] args)
    {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(3);
        list1.add(7);
        list1.add(3);
        list1.add(-1);
        list1.add(2);
        list1.add(3);
        list1.add(7);
        list1.add(2);
        list1.add(15);
        list1.add(15);
        System.out.println(countUnique(list1));

    }

    public static int countUnique(LinkedList<Integer> list)
    {
        Set<Integer> list2 = new TreeSet<Integer>();
        list2.addAll(list);

        return list2.size();

    }


}
