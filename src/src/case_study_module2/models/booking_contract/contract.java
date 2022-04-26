package case_study_module2.models.booking_contract;

public class contract {
    private int contractNumber;
    private String idBooking;
    private String depositMoney;
    private String totalPayment;
    private String idCustomer;

    public contract() {
    }

    public contract(int contractNumber,
                    String idBooking,
                    String depositMoney,
                    String totalPayment,
                    String idCustomer) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.depositMoney = depositMoney;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(String depositMoney) {
        this.depositMoney = depositMoney;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "contract{" +
                "contractNumber=" + contractNumber +
                ", idBooking='" + idBooking + '\'' +
                ", depositMoney='" + depositMoney + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
