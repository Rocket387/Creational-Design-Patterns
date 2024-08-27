package org.example.LibraryBuilderDesign;

public class LibraryBuilderDemo {

    public static void main(String[] arg) {
        Post book1 = new Post.Builder()
                .title("Java Builder Pattern")
                .text("Explaining how to implement the Builder Patter")
                .category("Programming")
                .build();

        Post book2 = new Post.Builder()
                .title("Architecture for dummys")
                .text("Architecture is the focus of designing and constructing buildings")
                .category("Factual")
                .build();

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }

}
