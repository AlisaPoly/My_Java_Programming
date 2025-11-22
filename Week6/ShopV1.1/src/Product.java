public class Product {
    private String productName = "";
    private int productCode = 9999;
    private double unitCost = 0;
    private boolean inCurrentProductLine = false;


        //------------------//
        //   constructors   //
        //------------------//

    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {
        if (productName.length()<= 10)
            this.productName = productName;
        else
            this.productName = productName.substring(0,10);
        setProductCode(productCode);
        setUnitCost(unitCost);
        this.inCurrentProductLine = inCurrentProductLine;
    }

    //------------------//
    //     getters      //
    //------------------//

    public String getProductName() {
        return productName;
    }
    public int getProductCode() {return productCode;}
    public double getUnitCost() {return unitCost;}
    public boolean isInCurrentProductline() {return inCurrentProductLine;}

    //------------------//
    //     setters      //
    //------------------//

    public void setProductName(String productName) {
        if (productName.length() <= 10)
            this.productName = productName;
    }

    public void setProductCode(int productCode) {
        if ((productCode >= 100) && (productCode <= 999))
            this.productCode = productCode;
    }

    public void setUnitCost(double unitCost) {
        if (unitCost>=0)
            this.unitCost = unitCost;
    }

    public void setInCurrentProductLine(boolean inCurrentProductLine) {
        this.inCurrentProductLine = inCurrentProductLine;
    }

    //------------------//
    //     methods      //
    //------------------//

    public String toString() {
            String present="In Stock";
        if (isInCurrentProductline()==false) {
            present = "Out of Stock";
        }

        return "Product Name: "+getProductName()+"\nProduct Code: "+getProductCode()+"\nUnit Cost: "+getUnitCost()+"\nProduct Status: "+present;
    }
}
