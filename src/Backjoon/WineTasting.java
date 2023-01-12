package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WineTasting {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        List<Integer> wineList = new ArrayList<>();

        try {
            int cnt=Integer.parseInt(br.readLine());

            int wine=0;

            for(int i=0;i<cnt;i++) {
                wine = Integer.parseInt(br.readLine());
                wineList.add(wine);
            }

            int answer=calucalate(wineList);
            System.out.println(wineList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int calucalate(List<Integer> wineList) {
        int check=0;

        List<Integer> sum=new ArrayList<>();

        return Collections.max(sum);
    }

}

