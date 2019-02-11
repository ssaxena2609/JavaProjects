package JavaProgramsTest;

import java.util.*;

public class CollectionTest2 {
    public static void main(String []args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arraylist");
        int i=0, valueCount = 1;
        int arraySize = sc.nextInt();
        while(i<arraySize) {
            System.out.println("Enter the value to be added to arraylist");
            ar.add(sc.nextInt());
            i++;
        }
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        for(i = 0; i<ar.size(); i++) {
            if(hMap.containsKey(ar.get(i))) {
/*                valueCount = hMap.get(ar.get(i))+1;*/
                hMap.put(ar.get(i), hMap.get(ar.get(i))+1);
            } else {
                hMap.put(ar.get(i),1);
            }
        }
        Set<Integer> valueSet =  hMap.keySet();
        Iterator<Integer> itr = valueSet.iterator();
        while(itr.hasNext()) {
            int no =  itr.next();
            valueCount =  hMap.get(no);
            //To print unique value
            if(valueCount == 1) {
                System.out.println(no+" is unique ");
            }
            //To print the repeating count of any noi
            System.out.println(no+" is repeating "+valueCount+" time");
        }


    }
}
