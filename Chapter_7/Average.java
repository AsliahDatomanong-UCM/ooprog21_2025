public class Average{
    public static int Average(int[] arr){
        int count = 0;
        int num = arr[0];
        int n = 1;

        for (int i = 1; i < arr.length; i++){
        double avg = (double) num/n;

        if (arr[i] > avg){
            count++;
        }

        num += arr[i];
        n++;
    }

    return count;
}

public static void main(String[] args){
    int[] responseTimes = {100, 200, 150, 300};
    System.out.println(Average(responseTimes));
}
}