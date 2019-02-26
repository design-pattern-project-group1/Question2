package Question2;

import javax.swing.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public abstract class View {
    protected ProductView pv;
    protected View(ProductView pv){
        this.pv = pv;
    }
    public abstract DefaultTableModel view();
}
