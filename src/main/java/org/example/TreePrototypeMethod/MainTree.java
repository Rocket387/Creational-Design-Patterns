package org.example.TreePrototypeMethod;

import java.util.List;

public class MainTree {

    public static void main(String[] args) throws CloneNotSupportedException {
        Trees tree1 = new Trees();
        tree1.loadData();

        Trees tree2 = (Trees) tree1.clone();
        Trees tree3 = (Trees) tree2.clone();

        List<String> list = tree2.getEmpList();
        list.add("Sycamore");
        List<String> list2 = tree3.getEmpList();
        list.remove("pine");

        System.out.println("tree 1 list: " + tree1.getEmpList());
        System.out.println("tree 2 list: " + tree2.getEmpList());
        System.out.println("tree 3 list: " + tree3.getEmpList());
    }
}
