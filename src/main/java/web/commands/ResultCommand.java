package web.commands;

import business.entities.BillOfMateirial;
import business.entities.CalcCarport;
import business.entities.CarportItem;
import business.exceptions.UserException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class ResultCommand extends CommandUnprotectedPage {
    public ResultCommand(String pageToShow) {
        super(pageToShow);
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws UserException {

  Double length;
 Double width;

  try {
      width = Double.parseDouble(request.getParameter("width"));
    length = Double.parseDouble(request.getParameter("length"));

/*`Clac Stolper*/
    CalcCarport calcCarport=new CalcCarport();
  List<CarportItem> carportItemList=new ArrayList<>();

   int qauntity1=(int)Math.round(calcCarport.calacPostQ(length,width));
      int length1=(int)Math.round(calcCarport.calacPostL(length,width));
     String info1= "Stolper nedgraves 90 cm. i jord";
     String describtion1="Posts";
  CarportItem posts=new CarportItem(qauntity1,length1,describtion1,info1);
         carportItemList.add(posts);






/*`Clac Remerne*/
      int qauntity2=(int)Math.round(calcCarport.calacRemQ(length,width));
      int length2=(int)Math.round(calcCarport.calacRemL(length,width));
      String info2= "Remme i sider, sadles ned i stolper ";
      String describtion2="rem";
      CarportItem rem=new CarportItem(qauntity2,length2,describtion2,info2);
      carportItemList.add(rem);

/*`Calac Spær*/
      int qauntity3=(int)Math.round(calcCarport.calacRaftersQ(length,width));
      int length3=(int)Math.round(calcCarport.calacRaftersL(length,width));
      String info3= "Spær, monteres på rem ";
      String describtion3="rafters";
      CarportItem rafters=new CarportItem(qauntity3,length3,describtion3,info3);
      carportItemList.add(rafters);



       request.setAttribute("length",(int)Math.round(length));
       request.setAttribute("width",(int)Math.round(width));
      request.setAttribute("carportItem",carportItemList);









}catch (Exception x)
{
    throw new UserException("passe på");
}


        return pageToShow;
    }
}