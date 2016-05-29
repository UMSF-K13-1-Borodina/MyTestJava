
package mod2srmp.java;

import java.util.*;


public class Perebor implements Strategy {
    
    private double a;   
    private double b;
    private int n = 100;
    private final List<Double> arrX = new ArrayList(); 
    private final List<Double> arrY = new ArrayList(); 
    private double resultY;
    private double resultX;
    
 
    
    @Override
    public void setA(double a){this.a = a;}
    
    @Override
    public void setB(double b){this.b = b;}
    
    @Override
    public void setN(int n){this.n = n;}
    
    @Override
    public List getArrX(){return arrX;}
    
    @Override
    public List getArrY(){return arrY;}
    
    @Override
    public double getResultY(){return resultY;}
    
    @Override
    public double getResultX(){return resultX;}
    
    private double funct(double x){
       return x*Math.exp(x)+Math.pow(x,2);
    }
    @Override
    public void result(){
        double x;
        double Ymin = 9999999;
        int iter= 0;
        
        for(int i = 0; i < n+1; i ++){
            x = a+i*((b-a)/n);
            arrX.add(x);
            if(Ymin > funct(x)){
                Ymin = funct(x);
                iter = i;
        }
        arrY.add(funct(x));
        
    }
        resultY = Ymin;
        resultX = arrX.get(iter);
    }
    }
    