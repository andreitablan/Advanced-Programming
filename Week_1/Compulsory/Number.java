package com.company;

public class Number {
    private int value;
    private int sumDigits;

    public Number() {
        this.value = (int) (Math.random() * 1_000_000);
    }

    public void multiplyByX(int x)
    {
        this.value *= x;
    }

    public void addBinary(String x)
    {
        this.value += Integer.parseInt(x, 2);
    }

    public void addHexa(String x)
    {
        this.value += Integer.parseInt(x, 16);
    }

    public void sumDigits()
    {
        do {
            this.sumDigits = 0;
            while (this.value > 0)
            {
                this.sumDigits += this.value % 10;
                this.value /= 10;
            }
            this.value = this.sumDigits;
        } while (this.sumDigits > 9);
    }

    public int getValue() {
        return value;
    }

    public int getSumDigits() {
        return sumDigits;
    }
}
