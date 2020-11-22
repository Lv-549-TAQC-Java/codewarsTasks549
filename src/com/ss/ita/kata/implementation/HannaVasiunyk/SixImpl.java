package com.ss.ita.kata.implementation.HannaVasiunyk;

import com.ss.ita.kata.Six;

public class SixImpl implements Six {

    private static final String NEW_LINE_CHARACTER = "\\r\\n";

    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        book = book.replaceAll("[^a-zA-z0-9.\\s]", "");
        String[] lines = book.split("\\n");
        StringBuilder result = new StringBuilder();
        double totalExpense = 0;
        int expenseCount = 0;

        result.append("Original Balance: ").append(lines[0]).append(NEW_LINE_CHARACTER);
        double balance = Double.parseDouble(lines[0]);

        for (int i = 1; i < lines.length; i++) {
            double localBalance;
            if (!lines[i].isEmpty()) {
                String[] records = lines[i].split(" ");
                localBalance = balance - Double.parseDouble(records[2]);
                balance = localBalance;
                result.append(lines[i]).append(" Balance ").append(String.format("%.2f", localBalance)).append(NEW_LINE_CHARACTER);
                totalExpense += Double.parseDouble(records[2]);
                expenseCount++;
            }
        }
        result.append("Total expense  ").append(String.format("%.2f", totalExpense)).append(NEW_LINE_CHARACTER);
        result.append("Average expense  ").append(String.format("%.2f", totalExpense / expenseCount));
        return result.toString().replaceAll(",", ".");
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}