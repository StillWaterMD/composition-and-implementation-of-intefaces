package com.company;
import java.util.Random;




public class matrix implements Define,Print{

    private
        int a[][];
        int n;
        int m;




    public matrix(int n,int m){
            this.a = new int[n][m];
            this.n=n;
            this.m=m;
            definition();
        }

    public void print(){



          for (int i = 0; i < this.n; ++i) {

              for (int j = 0; j < this.m; ++j) {

                  System.out.print(a[i][j]);
              }

              System.out.print("\n");


          }
    }

    public void definition(){

            Random rand= new Random();

            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j)
                    a[i][j] = rand.nextInt(n * m);

    }

    public void hellothere(){
        System.out.println("Hello there");
    }


}


interface Define{

      void definition();

}

interface Print{

    void print();
    void hellothere();

}



class Row{


        final int M=1;
        int n;
        Print arr;

        Row(int n){
            this.n=n;
            this.arr= new matrix(n,M);

        }


}