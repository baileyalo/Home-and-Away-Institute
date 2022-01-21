package hai.library;





import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class UtilityClass {
   
    
    public static void Populate(JComboBox combo, List<Programme> programmes)
    {
        Object items[] = new   Object[programmes.size()];
        int index =0;
        for (Object _item : programmes) 
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
    
     
