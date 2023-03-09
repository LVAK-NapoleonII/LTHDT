
package quanlykhocaycanh;
import java.util.Comparator;
import java.sql.Date;
public abstract  class Xapxep implements Comparator<nhapkho>{ 
     public int compare(nhapkho nhapkho1, nhapkho nhapkho2){
         if(nhapkho1.getngaynhap()==nhapkho2.getngaynhap()){
             return 0;
         }
         else if(nhapkho1.getngaynhap()>nhapkho2.getngaynhap()){
             return 1;
         }
         else{
             return -1;
         }
     }
}
