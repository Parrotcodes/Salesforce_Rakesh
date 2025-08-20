package Week1.Day1;

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        System.out.println(marks[0]);  

    // int[] age = new int[5];

    // // initialize array
    // age[0] = 12;
    // age[1] = 4;
    // age[2] = 5;

        int[] age = {12, 4, 5, 2, 5};
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);

        System.out.println("for loop");
        // loop through array using for loop
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("for each loop");
        // foreach loop
        for(int ag:age){
            System.out.println(ag);
        }
        

        // 2d array
        // int[][] a = new int[3][4];
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);

    }
}
