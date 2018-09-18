


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        
    Integer[] wrappedInts = Arrays.stream(arr)
                              .boxed()
                              .toArray(Integer[]::new);
        List<Integer> numbersList = Arrays.asList(wrappedInts);
        Map<Integer,Integer> numbersWithIndex = new TreeMap<Integer,Integer>();
        for( int i =0; i<numbersList.size();i++){
            int num = numbersList.get(i);
            numbersWithIndex.put(num,i);
        }
        int count = 0;
        int swapsTaken = 0;
        for (Map. Entry<Integer, Integer> entry : numbersWithIndex.entrySet()) {
            //System. out. println("lowestNum = " + entry. getKey() + ", indexOfLowestNum = " + entry. getValue());
            int lowestNum = entry.getKey();
            int indexOfLowestNum = entry.getValue();
            System.out.println("");
            System.out.print("lowestNum::"+lowestNum+" arr[count]::"+arr[count]+"  indexOfLowestNum::"+indexOfLowestNum+"   count::"+count);
            System.out.println("");
           /* lowestNum = 1, indexOfLowestNum = 2
            lowestNum = 2, indexOfLowestNum = 3
            lowestNum = 3, indexOfLowestNum = 1
            lowestNum = 4, indexOfLowestNum = 0*/
            if( lowestNum != arr[count]){ //SwapElements
                int temp = arr[count];
                arr[count]=lowestNum;
                arr[indexOfLowestNum]=temp;
                numbersWithIndex.put(lowestNum,count);
                numbersWithIndex.put(temp,indexOfLowestNum);
                swapsTaken++;             
            }
            System.out.println("");
            count++;
        }
        return swapsTaken;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println(String.valueOf(res));
        System.out.println("");

        scanner.close();
    }
}
