package lesson27;

import lesson27.Forest.Tree;//Импортируем классы tree

import lesson27.Forest.Squirell;

import java.util.Scanner;

import lesson27.Forest.Something.someClass;

//Альтернативный способ импорта

import lesson27.Forest.*; // Импортирует все классы папки Forest и ее подпапок
public class Test {
    public static void main(String[] args){
        Tree tree1 = new Tree("Oak"); // Чтобы ошибки не было нужно импортировать класс tree
        Squirell squirell1 = new Squirell();

        // Чтобы не делать этого в ручную можно нажать на ошибку(красный класс) и Alt + Enter


        System.out.print("Введите название дерева: ");
        Scanner scanner = new Scanner(System.in);//Это мы просто создали сканер
        String type1 = scanner.next();
        Tree tree2 = new Tree(type1);
        System.out.println("Дерево "+ type1);

        someClass class1 = new someClass();
    }
}
