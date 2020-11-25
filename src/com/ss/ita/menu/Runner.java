package com.ss.ita.menu;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;
import com.ss.ita.util.Scanner;
import com.ss.ita.util.implementation.ConsoleScanner;

import java.util.Arrays;

public class Runner {
    private Eight impl8;
    private Seven impl7;
    private Six impl6;
    private Five impl5;
    private Scanner scanner;

    public void setImpl(UserNames whose) {

        switch(whose){
            case HANNA: {
                this.impl8 = new com.ss.ita.kata.implementation.HannaVasiunyk.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.HannaVasiunyk.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.HannaVasiunyk.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.HannaVasiunyk.FiveImpl();
            }
            case KHRYSTYNA: {
                this.impl8 = new com.ss.ita.kata.implementation.Khrystyna.ImplEight();
                this.impl7 = new com.ss.ita.kata.implementation.Khrystyna.ImplSeven();
                this.impl6 = new com.ss.ita.kata.implementation.Khrystyna.ImplSix();
                this.impl5 = new com.ss.ita.kata.implementation.Khrystyna.ImplFive();
            }
            case VADYM: {
                this.impl8 = new com.ss.ita.kata.implementation.vadkostuk.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.vadkostuk.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.vadkostuk.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.vadkostuk.FiveImpl();
            }
            case MIKE: {
                this.impl8 = new com.ss.ita.kata.implementation.mike.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.mike.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.mike.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.mike.FiveImpl();
            }
            case MARIA: {
                this.impl8 = new com.ss.ita.kata.implementation.Maria.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Maria.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Maria.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Maria.FiveImpl();
            }
            case ANDRII: {
                this.impl8 = new com.ss.ita.kata.implementation.AndriiTurianskyi.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.AndriiTurianskyi.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.AndriiTurianskyi.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.AndriiTurianskyi.FiveImpl();
            }
            case NASTIA: {
                this.impl8 = new com.ss.ita.kata.implementation.Nastia3.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Nastia3.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Nastia3.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Nastia3.FiveImpl();
            }
            case YURII: {
                this.impl8 = new com.ss.ita.kata.implementation.Krynytsky.EightImpl();
                this.impl7 = new com.ss.ita.kata.implementation.Krynytsky.SevenImpl();
                this.impl6 = new com.ss.ita.kata.implementation.Krynytsky.SixImpl();
                this.impl5 = new com.ss.ita.kata.implementation.Krynytsky.FiveImpl();
            }

        }


    }

    public Runner() {
        scanner = new ConsoleScanner();

    }

    public Runner(UserNames whose) {
        scanner = new ConsoleScanner();
        setImpl(whose);

    }

    public String runTask1(){
        System.out.println("run task Keep Hydrated!");
        System.out.println("Enter double");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.liters(input));
        System.out.println(res);
        return res;
    }

    public String runTask8(){
        System.out.println("Formatting decimal places\nEnter double variable:");
        double input = scanner.readDouble();
        String res = String.valueOf(impl8.twoDecimalPlaces(input));
        System.out.println(res);
        return res;
    }

    public String runTask9(){
        System.out.println("Find numbers which are divisible by given number\nEnter int[] variable:");
        int[] input1 = scanner.readIntArray();
        System.out.println("Enter int variable");
        int input2 = scanner.readInt();
        String res = Arrays.toString(impl8.divisibleBy(input1, input2));
        System.out.println(res);
        return res;
    }
    public String runTask10() {
        System.out.println("Looking for a benefactor\nEnter double[] variable:");
        double[] input1 = scanner.readDoubleArray();
        System.out.println("Enter double variable:");
        double input2 = scanner.readDouble();
        String res = String.valueOf(impl7.newAvg(input1, input2));
        System.out.println(res);
        return res;
    }


}
