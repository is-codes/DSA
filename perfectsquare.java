package DSA;

public class perfectsquare {

    public static boolean isPerfectSquare(long x)
    {
        // Find floating point value of
        // square root of x.
        if (x >= 0) {
            long sr = (long)Math.sqrt(x);

            // if product of square root
            // is equal, then
            // return T/F
            return (sr * sr == x);
        }
        // else return false if n<0
        return false;
    }

    public static void main(String[] args)
    {
        long x = 49;
        if (isPerfectSquare(x))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

