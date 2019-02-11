package JavaProgramsTest;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionTest1 {
    public static void main(String []args) {
        ArrayList <Integer>ar =  new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int arraySize, i=0, j=1, value;
        boolean flag = true;
        System.out.println("Enter the size of the arraylist");
        arraySize = sc.nextInt();
        while(i<arraySize) {
            System.out.println("Enter the value to be added to arraylist");
            ar.add(sc.nextInt());
            i++;
        }
        for(i = 0; i<ar.size(); i++) {
            value =  ar.get(i);
            j=0;
            while(j<ar.size()) {
                if(j!=i) {
                    if (value == ar.get(j)) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                j++;
            }
            if(flag) {
                System.out.println(value+" is unique");
            }
        }

    }
}
