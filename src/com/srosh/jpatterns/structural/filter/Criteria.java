package com.srosh.jpatterns.structural.filter;

import java.util.List;

/**
 * Created by sroshchupkin on 13/08/15.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
