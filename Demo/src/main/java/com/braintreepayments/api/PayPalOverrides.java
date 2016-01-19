package com.braintreepayments.api;

public class PayPalOverrides {

    /**
     * WARNING: signature verification is disable based on a setting for testing in this demo app
     * only. You should never do this as it opens a security hole.
     */
    public static void disableAppSwitchSignatureVerification(boolean disable) {
        PayPal.sEnableSignatureVerification = !disable;
    }

    public static void setFuturePaymentsOverride(boolean useFuturePayments) {
        PayPal.sFuturePaymentsOverride = useFuturePayments;
    }
}