package hello.gson;

import java.math.BigDecimal;
import java.util.Map;

public class KCCAccountDueDateResponse {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7234314525523524893L;

    /**
     * List of Transactions.
     */
    private Map<String, KCCAccountDueDateDetails> content;

    /**
     * Gets the content.
     *
     * @return the content
     */
    public Map<String, KCCAccountDueDateDetails> getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * @param content the content
     */
    public void setContent(Map<String, KCCAccountDueDateDetails> content) {
        this.content = content;
    }

    /*
    BigDecimal targetBalance = BigDecimal.valueOf(
            sanctionAmount.doubleValue() - (sanctionAmount.doubleValue() * ((double) 12 / (100 * 365)) * (dateDiffInDays(new Date(), accountOpeningDate).intValue() + 1)));
		return targetBalance.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	*/
}
