package com.razvan;

public class CnpValidator {

    private final String cnp;

    public CnpValidator(String cnp) {
        this.cnp = cnp;
    }

    public boolean isValid() {

        int[] constanta = { 2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9 };

        if (cnp == null || cnp.length() != 13) {
            return false;
        }

        int[] cnpNumeric = new int[13];

        for (int i = 0; i < cnp.length(); i ++) {
            int numericValue = Character.getNumericValue(cnp.charAt(i));
            cnpNumeric[i] = numericValue;
        }

        int insumare = 0;
        for (int i = 0; i < 12; i ++) {
            insumare = insumare + cnpNumeric[i] * constanta[i];
        }

        int rest = insumare % 11;

        int C;

        if (rest < 10) {
            C = rest;
        } else {
            C = 1;
        }

        if (cnpNumeric[12] == C) {
            return true;
        } else {
            return false;
        }
    }
    
}
