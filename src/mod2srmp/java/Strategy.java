
package mod2srmp.java;

import java.util.List;


public interface Strategy {
    
    void result();
    
    public void setA(double a);
    
    public void setB(double b);
    
    public void setN(int n);
    
    public List getArrX();
    
    public List getArrY();
    
    public double getResultY();
    
    public double getResultX();
    
}
