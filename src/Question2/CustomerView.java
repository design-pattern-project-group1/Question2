package Question2;



import javax.swing.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CustomerView extends ProductView
{
    public CustomerView(List<Product> products)
    {
        super(products);
    }


    @Override
    public DefaultTableModel view() {
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        String[] columnNames = {"Product name"};
        dtm.setColumnIdentifiers(columnNames);
        
        for (Product i: this.products) {
            dtm.addRow(new Object[] {i.getName()});
        }
        return dtm;
        
        
            
    }


}
