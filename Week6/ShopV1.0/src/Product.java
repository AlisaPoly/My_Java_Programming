public class Product {
        private String productName;
        private int productCode;
        private double unitCost;
        private boolean inCurrentProductline;

        //------------------//
        //   constructors   //
        //------------------//

        public Product(String productName, int productCode, double unitCost, boolean inCurrentProductline) {
            this.productName = productName;
            this.productCode = productCode;
            this.unitCost = unitCost;
            this.inCurrentProductline = inCurrentProductline;
        }
    //------------------//
    //     getters      //
    //------------------//

    public String getProductName() {
        return productName;
    }
    public int getProductCode() {return productCode;}
    public double getUnitCost() {return unitCost;}
    public boolean isInCurrentProductline() {return inCurrentProductline;}

    //------------------//
    //     setters      //
    //------------------//

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductCode(int productCode) {
            this.productCode = productCode;
    }
    public void setUnitCost(double unitCost) {
            this.unitCost = unitCost;
    }
    public void setInCurrentProductline(boolean inCurrentProductline) {
            this.inCurrentProductline = inCurrentProductline;
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
