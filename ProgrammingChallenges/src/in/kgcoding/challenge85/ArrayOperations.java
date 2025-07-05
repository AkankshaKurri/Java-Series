//Create a class ArrayOperations with a static nested class Statistics.
//Statistics could have methods like mean(), median(), which operate on an array

//Median kya hota hai?
//        Median ek aise value hoti hai jo sorted array ke beech mein hoti hai.
//        Agar element odd number mein hai → middle wala element hi median hota hai.
//        Agar element even number mein hai → dono middle values ka average median hota hai.

//        👉 Case 1: Odd Length Array
//        if (n % 2 == 1) {
//        return numbers[n / 2];
//        }
//        n % 2 == 1 → matlab array ka size odd hai.
//        Example: {1, 3, 5}
//        length = 3 → odd
//        middle index = 3 / 2 = 1
//        numbers[1] = 3 → Median = 3

//        👉 Case 2: Even Length Array
//        else {
//        return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
//        }
//        Example: {1, 3, 5, 7}
//        length = 4 → even
//        middle indexes = 4 / 2 = 2 → index 1 and index 2
//        numbers[1] = 3, numbers[2] = 5
//        Median = (3 + 5) / 2.0 = 4.0
//
//        Note: / 2.0 likhne se result double banega (floating point), warna integer division ho jata.
//

package in.kgcoding.challenge85;

import java.util.Arrays;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int num : numbers){
                sum += num;
            }
            return sum / numbers.length;
        }

        double median(){
          Arrays.sort(numbers);
          int n = numbers.length;
          if (n % 2 == 1){
              return numbers[n/2];
          }
          else{
              int num = n/2;
              return (numbers[num] + numbers[num - 1]) / 2.0;
          }
        }
    }
}
