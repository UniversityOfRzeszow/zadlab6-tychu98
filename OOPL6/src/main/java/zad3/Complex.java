/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author tychu
 */
public class Complex {

    double r = 0;
    double u = 0;

    Scanner we = new Scanner(System.in);

    public double wpisz() {
        return we.nextDouble();
    }

    public void wypisz(double r, double u) {
        System.out.println(r + " + " + "i" + u);
    }

    public double modul(double r, double u) {
        return Math.sqrt(Math.pow(r, 2) + Math.pow(u, 2));
    }

    public void sprzezona(double r, double u) {
        System.out.println(r + " + " + "-i" + u);
    }

    public void trygonometryczna(double r, double u) {
        double sin = u / modul(r, u);
        double cos = r / modul(r, u);

        double asin = Math.asin(sin);
        asin *= 1000;
        asin = Math.round(asin);
        asin /= 1000;

        double acos = Math.acos(cos);
        acos *= 1000;
        acos = Math.round(acos);
        acos /= 1000;

        System.out.println("Postać trygonometryczna podanej liczby zespolonej: " + modul(r, u) + "(cos" + acos + "+ isin" + asin + ")");

    }

    public void algebraicznaNaWykladnicza(double r, double u) {

        double sin = u / modul(r, u);

        double asin = Math.asin(sin);
        asin *= 1000;
        asin = Math.round(asin);
        asin /= 1000;

        System.out.println("Postać wykładnicza podanej liczby zespolonej wynosi: " + modul(r, u) + " * e^" + asin + "i");
    }
    
    
    double alfa=0;
    double modul=0;
    
    public void wykladniczaNaAlgebraiczna (double alfa,double modul){
        
        double rzeczywista = modul * Math.cos(alfa);
        rzeczywista*=1000;
        rzeczywista=Math.round(rzeczywista);
        rzeczywista/=1000;       
        
        double urojona = modul * Math.sin(alfa);
        
        urojona*=1000;
        urojona=Math.round(urojona);
        urojona/=1000;  
        
        System.out.println("Liczba zespolona w postaci algebraicznej wynosi: "+ rzeczywista + "+ i"+urojona);
        
    }
    
    public void dodawanieAlgebraiczna (double r1 , double u1, double r2 , double u2){
        
        double r=r1+r2;
        double u=u1+u2;
        
        System.out.println("Suma tych liczb zespolonych wynosi: "+ r + " + i"+u);
    }
    
    public void odejmowanieAlgebraiczna (double r1 , double u1, double r2 , double u2){
        
        double r=r1-r2;
        double u=u1-u2;
        
        System.out.println("Różnica tych liczb zespolonych wynosi: "+ r + " + i"+u);
    }
    
      public void mnozenieAlgebraiczna (double r1 , double u1, double r2 , double u2){
        
        double r=(r1*r2)-(u1*u2);
        double u=(r1*u2)+(u1*r2);
        
        System.out.println("Iloczyn tych liczb zespolonych wynosi: "+ r + " + i"+u);
    }
    
    public void dzielenieAlgebraiczna (double r1 , double u1, double r2 , double u2){
        
        double r=(r1*r2)-(u1*u2);
        double u=(r1*u2)+(u1*r2);
        
        System.out.println("Iloraz tych liczb zespolonych wynosi: "+ r + " + i"+u);
    }
    
    
    
    
    
    

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public Complex(double r, double u) {
        this.r = r;
        this.u = u;
    }

}
