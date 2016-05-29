
package mod2srmp.java;

import java.util.ArrayList;
import java.util.List;


public class RandomSearch implements Strategy {
    
    private double a;   
    private double b;
    private int n;
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
    
    
    double f(double x){
        return x*Math.exp(x)+Math.pow(x,2);
    }
    

    
    double randX(){
        double x = a + Math.random()*(b-a);
        return x;
    }
    
    
    @Override
    public void result(){
        double x,f,fmin = 100000;
        int iter = 0;
        for(int i = 0; i < n;i++){
        x = randX();
        arrX.add(x);
        f = f(x);
        arrY.add(f);
        if(fmin > f){ fmin = f;
        iter = i;
        }
        }
        resultX = arrX.get(iter);
        resultY = fmin;
        
        
    }
    
}
