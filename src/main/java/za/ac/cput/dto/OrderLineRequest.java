package za.ac.cput.dto;

public class OrderLineRequest {
    private int productId;
    private int quantity;
    private double unitPrice;
    private double subTotal;
    private int orderId;
    private String size; // new field

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
    public double getSubTotal() { return subTotal; }
    public void setSubTotal(double subTotal) { this.subTotal = subTotal; }
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
}
