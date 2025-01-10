package DSA;

public class countoddeven {
    
       public static int[] countOddEven(int[] arr) {
           int countOdd = 0, countEven = 0;
           for (int i = 0; i < arr.length; i++) {
              // checking if the element is even
              if (arr[i] % 2 == 0) {
                 countEven++;
              } else {
                 // if not even, it must be odd
                 countOdd++;
              }
           }
           return new int[] {countOdd, countEven};
        }
     
        public static void main(String[] args) {
           int[] arr = {2, 3, 4, 5, 6};
           int[] ans = countOddEven(arr);
           System.out.println(ans[0] + " " + ans[1]);
        }
     }

