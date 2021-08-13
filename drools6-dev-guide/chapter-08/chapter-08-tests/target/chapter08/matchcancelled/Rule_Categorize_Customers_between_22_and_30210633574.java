package chapter08.matchcancelled;
import chapter08.matchcancelled.*;import org.drools.devguide.eshop.model.Discount;import org.drools.devguide.eshop.model.Item;import java.util.List;import org.drools.devguide.eshop.model.Customer.Category;import java.util.Collection;import org.drools.devguide.eshop.model.Customer;import org.drools.devguide.eshop.model.SuspiciousOperation;import org.drools.devguide.eshop.model.Order;import org.drools.core.spi.KnowledgeHelper;
public class Rule_Categorize_Customers_between_22_and_30210633574 {
    private static final long serialVersionUID = 510l;

public static void defaultConsequence(KnowledgeHelper drools,  org.drools.devguide.eshop.model.Customer $c, org.kie.api.runtime.rule.FactHandle $c__Handle__   ) throws java.lang.Exception { org.kie.api.runtime.rule.RuleContext kcontext = drools;
    { $c.setCategory(Category.BRONZE); drools.update( $c__Handle__, org.drools.core.util.bitmask.AllSetButLastBitMask.get(), org.drools.devguide.eshop.model.Customer.class ); };
}

}