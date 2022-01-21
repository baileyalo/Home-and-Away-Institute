package homeandawayinstituteprototype;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class UtilityClass {
   
    
    public static void Populate(JComboBox combo, ArrayList records)
    {
        Object items[] = new   Object[records.size()];
        int index =0;
        for (Object _item : records) 
        {
            
            nameCode item = (nameCode)_item;
            items[index] = 
                    new customcombo(item.getName(),item.getCode());
            
            index ++;
        }
        DefaultComboBoxModel mod=new DefaultComboBoxModel(items);
        combo.setModel(mod);
    
    
    }
    
}
    
     
