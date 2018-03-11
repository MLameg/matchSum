import java.util.Arrays;

public class matchSum {
    public static void main(String[] args){

    int[] given = {1, 8, 2, 4};

    System.out.println(Arrays.toString(sumMatch(given, 5)));

    }

    private static int[] sumMatch(int[] k, int sum){

        int check;
        int[] result = new int[2];

        OUTER: for(int i = 0; i < k.length; i++){

            check = Math.abs(k[i] - sum);
            try{
                for(int j = 1; j < k.length; j++)
                    if(check == k[j] && k[i]<sum){
                        result[0] = k[i];
                        result[1] = k[j];
                        break OUTER;
                }

            } catch (Exception e){

                System.out.println("Did not find a match");
            }

        }

        return result;

    }
}
