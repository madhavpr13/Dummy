package java_horstmann.interfaces.innerclasses.timbuchalka;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Print");


    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }


        }

        buttonPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen(){

        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();
            }
        }
    }
}


//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        mcLaren.wheelSpeed(3000);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
