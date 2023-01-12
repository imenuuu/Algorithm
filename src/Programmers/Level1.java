package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Level1 {
    public static void main(String[] args) {
        int[] arr={10};
        System.out.println(arr);
        int[] answer =solution(arr);

        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int[] arr) {
        int min=Arrays.stream(arr).min().getAsInt();
        int index=IntStream.range(0, arr.length)
                .filter(i -> min == arr[i])
                .findFirst()
                .orElse(-1);


        int[] result= IntStream.range(0,arr.length)
                .filter(i->i!=index)
                .map(i->arr[i])
                .toArray();
        if(result.length==0){
            return new int[]{-1};
        }
        return result;
    }

}
