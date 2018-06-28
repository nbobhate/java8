package io.github.nbobhate.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert from XTuple Accounts to SAP Accounts
 */
public class SAPServiceAdapter implements SAPService {

    private final XTupleService xTupleService;

    public SAPServiceAdapter(XTupleService xTupleService) {
        this.xTupleService = xTupleService;
    }

    public List<SAPAccount> getAccounts() {
        xTupleService.prepareAccounts();
        List<XTupleAccount> legacyAccounts = xTupleService.fetchAccounts();
        return convert(legacyAccounts);
    }

    private List<SAPAccount> convert(List<XTupleAccount> accounts) {
        List<SAPAccount> newAccounts = new ArrayList<SAPAccount>();

        for (XTupleAccount a : accounts) {
            newAccounts.add(new SAPAccount());
        }

        return newAccounts;
    }
}
