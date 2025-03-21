public class StoreToRent {
    
    private static final double MAINTENANCE_COST = 1000;
    private static final double INTEREST_RATE = 0.25;

    private String storeName;
    private String storeBusiness;
    private double totalArea;
    private double sellingPrice;
    private double rent;

    private String minimumLeasePeriod;
    private String floorNumber;
    private boolean available;

    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;

    public StoreToRent(String storeName, String storeBusiness, double totalArea, double sellingPrice, double rent, String minimumLeasePeriod, String floorNumber, boolean available) {
        this.storeName = storeName;
        this.storeBusiness = storeBusiness;
        this.totalArea = totalArea;
        this.sellingPrice = sellingPrice;
        this.rent = rent;
        this.minimumLeasePeriod = minimumLeasePeriod;
        this.floorNumber = floorNumber;
        this.available = available;
    }

    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    public double getINTEREST_RATE() {
        return INTEREST_RATE;
    }

    public boolean isLoanRequired() {
        return loanRequired;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getLoanPaymentTerm() {
        return loanPaymentTerm;
    }

    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\n" + 
        "Store Name: " + storeName + "\n" +
        "Store Business: " + storeBusiness + "\n" +
        "Total Area (sq.m): " + totalArea + "\n" + 
        "Selling Price: €" + sellingPrice + "\n" +
        "Rent: €" + rent + "\n" +
        "Minimum Lease Period: " + minimumLeasePeriod + "\n" +
        "Floor Number: " + floorNumber + "\n" +
        "Maintenance Cost: €" + MAINTENANCE_COST + "\n" +
        "Available: " + available + "\n";
    }
}