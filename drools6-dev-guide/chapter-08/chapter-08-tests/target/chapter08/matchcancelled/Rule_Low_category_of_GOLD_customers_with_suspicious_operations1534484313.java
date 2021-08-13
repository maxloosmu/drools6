package chapter08.matchcancelled;
import chapter08.matchcancelled.*;import org.drools.devguide.eshop.model.Discount;import org.drools.devguide.eshop.model.Item;import java.util.List;import org.drools.devguide.eshop.model.Customer.Category;import java.util.Collection;import org.drools.devguide.eshop.model.Customer;import org.drools.devguide.eshop.model.SuspiciousOperation;import org.drools.devguide.eshop.model.Order;import org.drools.core.spi.KnowledgeHelper;
public class Rule_Low_category_of_GOLD_customers_with_suspicious_operations1534484313 {
    private static final long serialVersionUID = 510l;

public static void defaultConsequence(KnowledgeHelper drools,  org.drools.devguide.eshop.model.Customer $c, org.kie.api.runtime.rule.FactHandle $c__Handle__   ) throws java.lang.Exception { org.kie.api.runtime.rule.RuleContext kcontext = drools;
    { $c.setCategory(Category.SILVER); drools.update( $c__Handle__, org.drools.core.util.bitmask.AllSetButLastBitMask.get(), org.drools.devguide.eshop.model.Customer.class ); };
}

}