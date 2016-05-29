
package mod2srmp.java;

import java.util.ArrayList;
import java.util.List;


public class Gold implements Strategy {
    
    private double a;   
    private double b;
    private int n;
    private final List<String> arrX = new ArrayList(); 
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
    
    
    private double f(double x){
        return x*Math.exp(x)+Math.pow(x,2);
    }
    
    @Override
    public void result(){
        double t = (Math.sqrt(5)-1)*0.5;
        double x1 = b - t*(b-a);
        double x2 = a + t*(b-a);
        double e = (double)n/1000;
        while(e <= Math.abs(b-a)){
            String buff = "X1: "+ x1;
            String buff1 = "X2: "+ x2;
            arrX.add(buff);
            arrX.add(buff1);
            arrY.add(f(x1));
            arrY.add(f(x2));
            if(f(x2) < f(x1))
                a = x1;
            else
                b = x2;
            x1 = b - t*(b - a);
            x2 = a + t*(b - a);

        }
       resultX =((a+b)*0.5);
       resultY = f(resultX);
    
    }
}
