package hello.gson;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class KCCAccountLastRepaymentDetailsRequest {

    /** The account numbers. */
    private List<String> accountNumbers;

    /** The product code. */
    private String productCode;

    public List<String> getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(List<String> accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public static void main(String[] args) {
        KCCAccountLastRepaymentDetailsRequest request = new KCCAccountLastRepaymentDetailsRequest();
        request.setAccountNumbers(Arrays.asList("20078010000154", "20078010000173", "20078010000205"));
        request.setProductCode("801");
        System.out.println("new Gson().toJson(request, KCCAccountDueDateRequest.class) = " + new Gson().toJson(request, KCCAccountLastRepaymentDetailsRequest.class));
    }
}
