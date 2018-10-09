/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

/**
 * @file Test.java
 * @date Oct 9, 2018 , 5:08:36 PM
 * @author Muhammet Alkan
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        
        l1.addFirst("node1");
        l1.addFirst("node2");
        l1.addLast("node3");
        l1.addFirst("node4");
        l1.addFirst("node5");
        l1.insertAfter("node4", "node6");
        
        l1.print();
        System.out.println("size : " + l1.size());
        
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.addFirst(12);
        l2.addFirst(132);
        l2.addFirst(12434);
        l2.addFirst(993332);
        l2.addFirst(2);
        l2.addFirst(3472);
        
        int max = l2.max();
        System.out.println(max);
    }
}
