public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public void InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    public int getQty(){
        return qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    public String getDesc() {
        return desc;
    }
    public String toString(){
        return "InvoiceItem[id="+id  +",desc ="+ desc +",qty=" + qty + ",unitPrice=" + unitPrice+"]";
    }

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

}
