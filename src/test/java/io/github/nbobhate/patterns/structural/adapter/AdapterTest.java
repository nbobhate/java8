package io.github.nbobhate.patterns.structural.adapter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void test() {
        XTupleService xTupleService = new XTupleServiceImpl();
        List<XTupleAccount> legacyAccounts = xTupleService.fetchAccounts();
        assertEquals(3, legacyAccounts.size());

        SAPServiceAdapter sapServiceAdapter = new SAPServiceAdapter(xTupleService);
        List<SAPAccount> newAccounts = sapServiceAdapter.getAccounts();
        assertEquals(3, newAccounts.size());
    }
}
