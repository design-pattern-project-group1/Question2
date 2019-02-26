package Question2;

import java.text.DecimalFormat;
import javax.swing.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ExecutiveView extends ProductView
{
    public ExecutiveView(List<Product> products)
    {
        super(products);
    }

    @Override
    public DefaultTableModel view() {
        String[] columnNames = {"Product name", "Units shipped"};
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        dtm.setColumnIdentifiers(columnNames);
        int s;
        for (Product i: this.products) {
            DecimalFormat formatter = new DecimalFormat("#0");
            dtm.addRow(new Object[] {i.getName(),formatter.format(i.getUnits_shipped())});
        }
        return dtm;
    }


}
