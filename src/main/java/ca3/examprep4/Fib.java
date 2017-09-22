/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3.examprep4;

/**
 *
 * @author felesiah
 */
public class Fib {
long n= 0;

    public Fib(long n) { 
        this.n = n;
    }

    public long fib(long n) {
        if((n==0)||(n==1)){
            return n;
        }else{
            return fib(n-1)+ fib(n-2);
        }
    }
    
}
