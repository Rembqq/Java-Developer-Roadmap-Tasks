package Fundamentals.Functions;

public class Armstrong_Number {
    public static void main(String[] args) {
        int[] num;
        int power = 1;
        int tmp = 1;

        for(int i = 0; i < 1000; ++i)
        {
            for(int j = 0; j < 4; ++j)
            {
                if(i - Math.pow(10, j) < 0)
                {

                    power++;
                }
            }
        }
    }
}
