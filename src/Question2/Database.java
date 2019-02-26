package Question2;

import java.util.ArrayList;
import java.util.Random;

public class Database {
    private ArrayList<Product> products = new ArrayList<>();

    public Database()
    {
        Random rand = new Random();
        String salt = "abcdefghijklmnopqrstuvwyz";

        StringBuilder   name_builder;
        String          name;
        int            units_shipped;
        int             index;

        for (int i = 0; i < 100; i++)
        {
            name_builder = new StringBuilder();
            while (name_builder.length() < 8)
            {
                index = rand.nextInt(salt.length());;
                name_builder.append(salt.charAt(index));
            }
            name = name_builder.substring(0, 1).toUpperCase() + name_builder.substring(1);
            units_shipped = rand.nextInt(50000);

            products.add(new Product(name, units_shipped));
        }
    }

    public ArrayList<Product> fetch()
    {
        return products;
    }
}
