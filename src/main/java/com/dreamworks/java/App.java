package com.dreamworks.java;


import java.util.List;

/**
 *
 * @author saravanan k
 */
public class App {

    public static void checkIfPresentOrNot(){
        var languages = List.of("java", "js");
        var empty = languages
                .stream().filter(l->l.equals("typescript")).findAny().isEmpty();
        System.out.println(empty);
    }

    public static void stringFormatReuse(){
        var message = """
                hello, %1$s,
                question: %2$s
                good bye %1$s
                """.formatted("duke", "are you okay?");
        System.out.println(message);
        System.out.printf("Hello %s \n", "duke");
        System.out.format("Hello %s \n", "duke");
    }

    public static void consoleInput(){
        var console = System.console();
        console.printf(">");
        var input = console.readLine();
        console.printf("echo: "+ input);
    }

    public static void main(String[] args) {
        //checkIfPresentOrNot();
        //stringFormatReuse();
//        consoleInput();
    }
}
