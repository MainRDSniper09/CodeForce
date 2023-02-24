import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(),m = sc.nextInt(), a = sc.nextInt();//we create three integer variables "long" in case the user wants to type a long number,
        long  total = (n/a), total2 = (m/a);//here we do a mathematical operation which, what it does is the following, "(n/a)" and "(m/a), we do this to know what our AxA piece occupies, which is basically just a measure for the whole square that we are creating
        if (n%a != 0 ) {//we create a condition which tells us that if the remainder of n with a is different from 0, of course this value would be in decimal, so if we do the multiplication at the end that I will explain later, it would not give us the result, then we add 1 to the decimal that we just did, but if the remainder is 0 then it would not have to get into the condition, so our variable where we store (n/m), would give us a single integer which is not decimal.
            total++;

        }
        if (m%a != 0){//here we do the same as with the previous condition
            total2++;
        }
        System.out.println(total*total2);//finally we do the operation of the two variables where we store the operation (n/a) and (m/a), in order to multiply these two variables and give us the final result



}

    }


