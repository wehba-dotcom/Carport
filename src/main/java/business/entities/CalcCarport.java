package business.entities;


public class CalcCarport {
   CarportItem Posts;
   CarportItem rem;
   CarportItem rafters;
   public Double calacPostQ(Double length,Double width)
   {
  Double gauntity= ((length/310)+1) *2 ;
       return  gauntity;
   }
    public Double calacPostL(Double length,Double width)
    {
        Double length1= 300.0 ;
        return length1;
    }
    public CarportItem endPost(int qauntity,int length1)
    {
        return Posts;
    }
    public Double calacRemQ(Double length,Double width)
    {
        Double gauntity= (length/length) *2 ;
        return  gauntity;
    }
    public Double calacRemL(Double length,Double width)
    {
        Double length1= length ;
        return length1;
    }
    public CarportItem endRem(int qauntity,int length1)
    {
        return rem;
    }

    public Double calacRaftersQ(Double length,Double width)
    {
        Double gauntity= (length/55)  ;
        return  gauntity;
    }
    public Double calacRaftersL(Double length,Double width)
    {
        Double length1= width ;
        return length1;
    }
    public CarportItem endRafters(int qauntity,int length1)
    {
        return rafters;
    }

}
