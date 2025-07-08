public class lec3 {
    public static void main(String[] args){
        for(int i=1; i<=7; i++){
            System.out.println("Day" + i);

            for(int j=1; j<=9; j++){
                System.out.println(" "+(j+8)+"-"+(j+9));
            }
        }






//        repeat a number in multiple times
//        loops while do , do while, for
//        100 - condition

        int i =1;
        while (i<=4)
        {
            System.out.println("Hello..! " + i);
           int j = 1;
            while(j<=3) {
                System.out.println("Hi");
                j++;
            }
            i++;

        }
        System.out.println("bye" + i);





        int n =6;

       switch(n){
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
           System.out.println("Enter a valid number:");
       }







        int n =4;
        int result =0;
        result = n%2 ==0?10:20;
        System.out.println(result);



// ?: ternary operator
        int x = 8;
        int y = 5;
        int z = 9;
        if(x>y && x>z) {
            System.out.println(x);
            System.out.println("Thank You");
        }
        else if (y>x && y>z) {
            System.out.println(y);
            System.out.println("sorry");
        }
        else
            System.out.println(z);


        int x = 18;
        if (x >= 10 && x <= 20)
            System.out.println("hello");
        else
            System.out.println("bye");



        int x=6;
        int  y=7;

        double a = 2.8;
        double b = 6.8;

        boolean result = x == y  ||  a==b ;
        System.out.println(result);
    }
}
