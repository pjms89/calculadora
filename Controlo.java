package Controlo;


public class Calculadora 
{
     
    public double total;
   
    public void soma(double a, double b)
    {
        this.total = a + b;
    }
    
    public void subtrai(double a, double b)
    {
        this.total = a - b;
    }
    
    public void multiplica(double a, double b)
    {
        this.total = a * b;
    }
    
    public void divide(double a, double b)
    {
        this.total = a / b;
    }
    
    public void desconto(double a, double b)
    {
        this.total = a - (a * (b/100));
    }
    
    public void iva(double a, int val)
    {
        switch(val)
        {
            case 6:
                this.total = a * 1.06;
                break;
                
            case 13:
                this.total = a * 1.13;
                break;
                
            case 23:
                this.total = a * 1.23;
                break;
        }
        
    }
}
