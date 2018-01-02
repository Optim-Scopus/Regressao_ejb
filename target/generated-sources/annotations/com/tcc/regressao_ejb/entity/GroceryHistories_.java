package com.tcc.regressao_ejb.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-08T13:26:07")
@StaticMetamodel(GroceryHistories.class)
public class GroceryHistories_ { 

    public static volatile SingularAttribute<GroceryHistories, Long> grocery_id;
    public static volatile SingularAttribute<GroceryHistories, Integer> issue;
    public static volatile SingularAttribute<GroceryHistories, Integer> time_exit;
    public static volatile SingularAttribute<GroceryHistories, Integer> time_arrival;
    public static volatile SingularAttribute<GroceryHistories, Long> id;
    public static volatile SingularAttribute<GroceryHistories, Long> groceries_size;
    public static volatile SingularAttribute<GroceryHistories, Integer> dow;

}