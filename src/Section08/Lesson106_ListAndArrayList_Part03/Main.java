package Section08.Lesson106_ListAndArrayList_Part03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        int choice;
        boolean quit = false;
        printInstructions();
        while (!quit){
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    printInstructions();
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item in the list.");
        System.out.println("\t4 - To remove an item from the list.");
        System.out.println("\t5 - To search for an item in the list.");
        System.out.println("\t6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name to be replaced: ");
        String currentName = sc.nextLine();
        System.out.print("Enter the new item name: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(currentName, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item name to be removed: ");
        String itemName = sc.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String itemName = sc.nextLine();
        if(groceryList.onList(itemName)){
            System.out.println(itemName+" is in our grocery list.");
        } else{
            System.out.println(itemName+" is not in our grocery list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());
    }
}
