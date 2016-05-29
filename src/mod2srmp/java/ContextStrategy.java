
package mod2srmp.java;

import java.util.List;


public class ContextStrategy {
    
    private Strategy strategy;
    
    public void SetStrat(Strategy str){
        this.strategy = str;
    }
    
    public void run(){
    strategy.result();
    }
    
    public void setA(double a){
    strategy.setA(a);}
    
    public void setB(double b){
    strategy.setB(b);}
    
    public void setN(int n){
    strategy.setN(n);}
    
    public List getArrX(){
    return strategy.getArrX();
    }
    public List getArrY(){
    return strategy.getArrY();}
    
    public double getResultY(){
    return strategy.getResultY();}
    
    public double getResultX(){
    return strategy.getResultX();}
    
}
