package com.example.facebookhackerscup;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String inputString = "6\n" +
                "4 1 3\n" +
                "LikeSign\n" +
                "Arcade\n" +
                "SweetStop\n" +
                "SwagStore\n" +
                "4 4 100\n" +
                "FoxGazebo\n" +
                "MPK20Roof\n" +
                "WoodenSculpture\n" +
                "Biryani\n" +
                "4 3 1\n" +
                "LikeSign\n" +
                "Arcade\n" +
                "SweetStop\n" +
                "SwagStore\n" +
                "4 3 3\n" +
                "LikeSign\n" +
                "Arcade\n" +
                "SweetStop\n" +
                "SwagStore\n" +
                "4 3 10\n" +
                "LikeSign\n" +
                "Arcade\n" +
                "SweetStop\n" +
                "SwagStore\n" +
                "2 1 1000000000000\n" +
                "RainbowStairs\n" +
                "WallOfPhones";

        int noOfCampuses = Character.getNumericValue(inputString.charAt(0));
        String[] lines = inputString.split(System.getProperty("line.separator"));
        int lineNumber = 1;
        int N;
        int V;
        int K;
        String singleLine;
        for(int i = 0; i < noOfCampuses; i++){
            singleLine = lines[lineNumber];
            lineNumber++;
            String[] val = singleLine.split(" ");
            N = Integer.parseInt(val[0]);
            K = Integer.parseInt(val[1]);
            V = Integer.parseInt(val[2]);
            Queue<String> q = new LinkedList<>();
            for(int j = 0; j < N; j++){
                //Log.d("debug", "Added: " + lines[lineNumber]);
                q.add(lines[lineNumber]);
                lineNumber++;
            }
            processQueue(q, N, K, V, i);
        }
    }

    public void processQueue(final Queue<String> q, final int N, final int K, final int V, final int num){
        Log.d("debug", "@PrecessQeueu: " + q.toString());
        Log.d("debug", N + " " + K + " " + V);
                for(int i = 0; i < V-1; i++){
                    for(int j = 0; j < K; j++){
                        String att = q.remove();
                        q.add(att);
                        //Log.d("debug", q.toString());
                    }
                }

                Log.d("debug", "Case#" + num + ": ");
                for(int j = 0; j < K; j++){
                    Log.d("debug", q.remove());
                }

    }
}
