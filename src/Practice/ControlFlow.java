package Practice;

public class ControlFlow {
    public static void main(String[] args) {

        //if-else statement
        System.out.println("If-else statement");
        int i = 10, j = 20;
        if(i > j){
            System.out.println("i is larger than j");
        }
        else
            System.out.println("j is larger than i");


        //switch statement
        System.out.println();
        System.out.println("Switch statement");
        int month = 3;
        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println(("Apr"));
                break;
            default:
                System.out.println("Invalid");
        }

        //for loop
        System.out.println();
        System.out.println("for loop");
        for (int x = 0; x < 20; x++){
            System.out.print(x + " ");
        }

        //for each
        System.out.println();
        System.out.println("\nfor each");
        String[] array = {"jan", "feb", "mar", "apr", "may"};
        for(String item : array){
            System.out.print(item + " ");
        }

        //while loop

        System.out.println();
        System.out.println("\nwhile loop");
        int a = 20;
        while (a>=0){
            System.out.print(a + " ");
            a--;
        }

        //do - while loop

        System.out.println();
        System.out.println("\ndo-while loop");
        int b=0;
        do{
            System.out.println("executed once even if condition fails");
        }while (b>1);

    }
}
