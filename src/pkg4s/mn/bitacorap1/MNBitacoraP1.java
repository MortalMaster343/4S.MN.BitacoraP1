
package pkg4s.mn.bitacorap1;

import java.util.Scanner;


public class MNBitacoraP1 {
//Alumnos:
  // Weyler Jesus Jimenez Ucan
   // Zeus Abadallan Heliodoro Uc
   // Miguel Benjamin Perez Suasnavar //

    public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);
     double x=3,media,sumatoria=0,varianza;
     int j=5,z;
     do{
     System.out.println("¿Que operación desea realizar?");
     System.out.println("1: euler elevado a x");
     System.out.println("2: euler elevado a -x");
     System.out.println("3: 3 metodos para calcular ecuaciones cuadradas");
     System.out.println("4: salir");
     System.out.println("-----------------------------------------------");
     
     
         z=teclado.nextInt();
     switch (z)
             {
         case 1:
             System.out.println("Digite el valor de x");
             x=teclado.nextDouble();
             System.out.println("Digite el valor de j");
             j=teclado.nextInt();
             Euler e1= new Euler(x,j);
             System.out.println("El valor es : "+e1.Euler());
             System.out.println("-----------------------------------------------");
             break;
             
         case 2:
             System.out.println("Digite el valor de x");
             x=teclado.nextDouble();
             System.out.println("Digite el valor de j");
             j=teclado.nextInt();
             Euler e2= new Euler(x,j);
             System.out.println("El valor es : "+e2.Eulern());
             System.out.println("-----------------------------------------------");
             break;
             
        case 3:
            double a,b,c = 0; 

            System.out.println("Dame el coeficiente a");
            a = teclado.nextDouble();
            System.out.println("Dame el coeficiente b");
            b = teclado.nextDouble();
            System.out.println("Dame el coeficiente c");
            c = teclado.nextDouble();
            Formulascuad3 f= new Formulascuad3(a,b,c);
            f.formulageneral();
            f.racionalizarnumerador();
            f.racionalizarnumeradorSimp();
            System.out.println("-----------------------------------------------");
             break;
        case 4:
            System.out.println("");
            System.out.println("-----------------------------------------------");
            
             break;     
         default:
            System.out.println("no es una opción valida");
             break;
     }
     }while (z!=4);
     
    }
    
}

class Euler {
private int valorj;
private double valorx;
double e;
public Euler (double x, int j){
valorx=x;
valorj=j;
}
public long Factorial(int j){
    long fact=1;
    for(int q=0; q<j;q++){
    fact+=fact*q;   
    }
return fact;
}

double exponentej(int j){ 
    double potencia=1;   
    for (int q=1; q<=j;q++){
    potencia=potencia*valorx;  
    }  
    return potencia;
}
public double Euler(){
double suma=0;
    for(int w=1; w<=valorj; w++){   
    e=((double)exponentej(w)/(double)Factorial(w));
    //System.out.println("exponente :"+exponentej(w)+"/ factorial: "+Factorial(w));
    //System.out.println("="+e);
    suma=suma+e;
    }
return suma;
}
public double Eulern(){
double suman=0;
    for(int w=1; w<=valorj; w++){
    e=1/((double)exponentej(w)/(double)Factorial(w));
    //System.out.println("exponente :"+exponentej(w)+"/ factorial: "+Factorial(w));
    //System.out.println("="+e);
    suman=suman+e;
    }
return suman;
}
}
class Formulascuad3{
    double a,b,c,d;
    double x1,x2;
    double x11,x12;
    double x21,x22;
     public Formulascuad3(double a,double b,double c){
     this.a=a;
     this.b=b;
     this.c=c;
     }
    void formulageneral(){
     d = Math.pow (b,2) - (4*a*c);
      if(d<0){
          System.out.println("La solucion no es factible");
      }else{
          x1 = (-b + Math.sqrt(d)) / (2*a);
          x2 = (-b - Math.sqrt(d)) / (2*a);
      }
      System.out.println("En la primera formula (Formula general) X1="+x1);
      System.out.println("En la primera formula (Formula general) X2="+x2);
      System.out.println("-----------------------------------------------");
    }
    void racionalizarnumeradorSimp(){
     d = Math.pow (b,2) - (4*a*c);
      if(d<0){
          System.out.println("La solucion no es factible");
      }else{
          x11 = (-2*c)/(b + Math.sqrt(d)) ;
          x12 = (-2*c)/(b - Math.sqrt(d)) ;
      }
      System.out.println("En la tercera formula (Racionalizar el numerador Simplificado) X1="+x11);
      System.out.println("En la tercera formula (Racionalizar el numerador Simplificado) X2="+x12);
      System.out.println("-----------------------------------------------");
    }
    void racionalizarnumerador(){
     d = Math.pow (b,2) - (4*a*c);
      if(d<0){
          System.out.println("La solucion no es factible");
      }else{
          x21 = (Math.pow(b,2)-d )/ ((2*a)*(-b - Math.sqrt(d))) ;
          x22 = (Math.pow(b,2)-d )/ ((2*a)*(-b + Math.sqrt(d))) ;
      }
      System.out.println("En la segunda formula (Racionalizar el numerador) X1="+x21);
      System.out.println("En la segunda formula (Racionalizar el numerador) X2="+x22);
      System.out.println("-----------------------------------------------");
}    
}