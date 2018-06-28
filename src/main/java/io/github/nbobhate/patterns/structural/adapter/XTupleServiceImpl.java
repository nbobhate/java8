package io.github.nbobhate.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class XTupleServiceImpl implements XTupleService {

    public void prepareAccounts() {

    }

    public List<XTupleAccount> fetchAccounts() {
        List<XTupleAccount> legacyAccounts = new ArrayList<XTupleAccount>();
        legacyAccounts.add(new XTupleAccount());
        legacyAccounts.add(new XTupleAccount());
        legacyAccounts.add(new XTupleAccount());

        return legacyAccounts;
    }
}
