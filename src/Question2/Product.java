package Question2;

public class Product
{
    private String name;
    private long units_shipped;

    public Product(String name, long units_shipped)
    {
        this.name = name;
        this.units_shipped = units_shipped;
    }

    public String getName()
    {
        return name;
    }

    public double getUnits_shipped()
    {
        return units_shipped;
    }
}
