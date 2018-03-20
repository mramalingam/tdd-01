package hello.gson;

import com.google.gson.Gson;

import java.util.Date;

public class KCCAccountDueDateRequest {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6686957481669176567L;

    /** The member name. */
    private String memberName;

    /** The aadhaar number. */
    private String aadhaarNumber;

    /** The account number. */
    private String accountNumber;

    /** The from date. */
    private Date fromDate;

    /** The to date. */
    private Date toDate;

    /** gets member name.
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * sets member name.
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * gets aadhaar number.
     * @return the aadhaarNumber
     */
    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    /**
     * sets aadhaar number.
     * @param aadhaarNumber the aadhaarNumber to set
     */
    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    /**
     * gets account number.
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * sets account number.
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the from date.
     *
     * @return the from date
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Sets the from date.
     *
     * @param fromDate the new from date
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Gets the to date.
     *
     * @return the to date
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * Sets the to date.
     *
     * @param toDate the new to date
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public static void main(String[] args) {
        KCCAccountDueDateRequest request = new KCCAccountDueDateRequest();
        request.setAadhaarNumber("1234-1234-1234-1234");
        request.setAccountNumber("ACC123344");
        request.setFromDate(new Date());
        request.setToDate(new Date());
        request.setMemberName("");
        System.out.println("new Gson().toJson(request, KCCAccountDueDateRequest.class) = " + new Gson().toJson(request, KCCAccountDueDateRequest.class));
    }
}
