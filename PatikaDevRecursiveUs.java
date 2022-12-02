
import java.util.Scanner;


public class PatikaDevRecursiveUs {
    public static void main(String[] args) {
      
        do {            
            
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Taban Değerini Giriniz :");
        int taban=scan.nextInt();
        
        System.out.print("Üs Degerini Giriniz :");
        int üs=scan.nextInt();
                
        System.out.println("Sonuc :"+usHesaplama(taban,üs));
    } while (true);
        
        }
    
    static int usHesaplama(int taban,int üs){
         if(üs==0){
         return 1;
         }
         else {
        return taban*usHesaplama(taban,(üs-1));
        
         }
    }
}
