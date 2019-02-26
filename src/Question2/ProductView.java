package Question2;

import javax.swing.*;
import javax.swing.text.TableView;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public abstract class ProductView
{
    public List<Product> products;

    public ProductView(List<Product> products)
    {
        this.products = products;
    }

    public abstract DefaultTableModel view();
}


