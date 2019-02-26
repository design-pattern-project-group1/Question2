package Question2;

import javax.swing.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SingleView extends View{
    
    public SingleView(ProductView pv) {
        super(pv);
    }

    @Override
    public DefaultTableModel view() {
        return pv.view();
    }
}
