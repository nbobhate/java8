package io.github.nbobhate.patterns.structural.adapter;

import java.util.List;

public interface XTupleService {

    public void prepareAccounts();

    public List<XTupleAccount> fetchAccounts();
}
