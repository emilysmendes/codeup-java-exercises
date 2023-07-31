public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!"); /* you can also type sout for the same effect. In Java you NEED double quotes */
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "this is my string!";
        System.out.println(myString);
//        float myNumber = 3.14;
        /* You can fix the above by either adding F to the end of the float OR putting (float) in front of the number*/
//        System.out.println(myNumber);
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
        int z = 4;


        int w = 4;
        int v = 3;
        w *= v;

        int u = 10;
        int t = 2;
        u/= t;
        t-= u;



    }
}

