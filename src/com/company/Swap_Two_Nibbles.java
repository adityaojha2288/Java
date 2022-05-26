package com.company;

public class Swap_Two_Nibbles {
    class swap {
         static int swapNibbles(int x) {
            return ((x & 0x0F) << 4 | (x & 0xf0) >> 4);
        }
    }

        public static void main(String[] args) {
            int x = 100;
            System.out.println(swap.swapNibbles(x));
        }

}
