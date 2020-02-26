// LS Array App
// Name: Hanna Kuruneri
// Student: KRNHAN003
// 25 March 2020

import java.util.*;
import java.io.*;
public class LSArrayApp{

String[] textFile = new String[2976];
      
   public static void main(String args[])
   {
   LSArrayApp ls = new LSArrayApp();
   ls.printAllAreas();
 
   }
        
   public LSArrayApp() {
   getData();
   }
        
   
   public void printAreas(String stage, String day, String startTime)
   {
      String key = stage+"_"+day+"_"+startTime;
      //System.out.println(key);
      boolean found = false;
      for (int j = 0; j<textFile.length; j++){
         //System.out.println(textFile[j]);
         if (textFile[j].contains(key)){
         System.out.println(textFile[j]);
         found = true;
         break;
         }
         
         }
         if (!found){
            System.out.println("Areas not found");
         }
      }
      
   
   
   public void printAllAreas()
      {
      for (int i =0; i<textFile.length; i++){
         System.out.println(textFile[i]);
      }
   }

   public void getData()
      {
      try 
            {
            File read = new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt");
            Scanner data = new Scanner(read);
           
               //LSArrayData area = new LSArrayData(data.nextLine); 
               for(int i=0; i<2976; i++)
                  {
                  textFile[i] = data.nextLine();
                  }                 
               
               data.close(); 
           }
          catch(Exception ex)
            {
            System.out.println("Error reading file.");
            }
      
      }

}
// }      
//      // public LSArrayApp() {
//       
//     //  }
//  //  public void printAreas(string stage, string day, string startTim
// 