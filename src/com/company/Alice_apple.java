package com.company;
public class Alice_apple {
    static int minApples(int M,int K,int N , int S,int W, int E){
        // if we get all required apple from south
        if (M<=S*K){
            return M;
        }
        //if we required trees from east and west
        else if(M<= S*K +E+W){
            return S*K + (M-S*K)*K;
        }
        //if we don't have enough apple
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        // no of red apple for gift
        int M=10;
        //no of red apple in each tree
        int K=15;
        // no of tree in north
        int N=0;
        //no of tree in south
        int S =1;
        // no of tree in west
        int W = 0;
        // no of tree in east
        int E = 0;
        // function call
        int ans = minApples(M,K,N,S,W,E);
        System.out.println(ans);

    }
}
