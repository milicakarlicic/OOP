package cas06.zadatak02;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Queue queue = new QueueUsingFixedArray();

        Scanner input = new Scanner(System.in);
        int element;
        while(true) {
            System.out.println("========================================================================================");
            System.out.println("Enter option: 0 - ADD, 1 - REMOVE, 2 - HEAD, 3 - BACK, 4 - SIZE, 5 - SHOW, 6 - EXIT");

            int intOption = input.nextInt();
            Option option = Option.castIntToOption(intOption);
            switch (option) {
                case Option.ADD:
                    System.out.println("Enter element: ");
                    element = input.nextInt();
                    queue.add(element);
                    break;
                case Option.REMOVE:
                    queue.remove();
                    break;
                case Option.HEAD:
                    element = queue.head();
                    System.out.println("Head: " + element);
                    break;
                case Option.BACK:
                    element = queue.back();
                    System.out.println("Back: " + element);
                    break;
                case Option.SIZE:
                    System.out.println("Size: " + queue.size());
                    break;
                case Option.SHOW:
                    queue.show();
                    break;
                case Option.EXIT:
                default:
                    input.close();
                    return;
            }
        }

    }

}
