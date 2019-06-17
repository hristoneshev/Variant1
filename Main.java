// Da se nameri MAX element v glavnija diagonal na matrica

package com.company;


public class Main {

    public static void main(String[] args) {


        int [][] matrix = { {1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4} };
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        int MAX=matrix[0][0];
        for (int i=1; i<matrix.length; i++) {
            if (MAX<matrix[i][i]) {
                MAX=matrix[i][i];
                }
        }
        System.out.println("MAX is " + MAX);
    }
}