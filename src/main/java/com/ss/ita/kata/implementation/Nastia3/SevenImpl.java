package com.ss.ita.kata.implementation.Nastia3;

import com.ss.ita.kata.Seven;
import java.text.DecimalFormat;

public class SevenImpl  implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double lastDonation = (double)((arr.length+ 1) * navg - sum) ;
        if(lastDonation > 0){
            return (long)Math.ceil(lastDonation);
        }
        else{
            throw new IllegalArgumentException("Negative value");
        }
    }

    @Override
    public String seriesSum(int n) {
        DecimalFormat df = new DecimalFormat("0.00");
        if(n>=1){
            double sum = 1.0;
            for(int i =1;i<n;i++){
                sum += 1.0/(3*i+1);
            }
            String s = df.format(sum);
            System.out.println(s);
            return s;
        }
        else{
            String s = df.format(n);
            System.out.println(s);
            return s;
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if((bef + aft) < p){
            return aft + 1;
        }
        else{
            return p - bef;
        }
    }
}
