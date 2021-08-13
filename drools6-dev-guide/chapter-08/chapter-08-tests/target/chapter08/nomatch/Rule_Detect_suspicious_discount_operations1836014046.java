package chapter08.nomatch;
import org.drools.devguide.eshop.model.Discount;import org.drools.devguide.eshop.model.Item;import java.util.List;import org.drools.devguide.eshop.model.Customer.Category;import java.util.Collection;import org.drools.devguide.eshop.model.Customer;import org.drools.devguide.eshop.model.SuspiciousOperation;import chapter08.nomatch.*;import org.drools.devguide.eshop.model.Order;import org.drools.devguide.eshop.service.SuspiciousOperationService;import org.drools.core.spi.KnowledgeHelper;
public class Rule_Detect_suspicious_discount_operations1836014046 {
    private static final long serialVersionUID = 510l;

public static void defaultConsequence(KnowledgeHelper drools,  org.drools.devguide.eshop.model.Customer $c, org.kie.api.runtime.rule.FactHandle $c__Handle__   ) throws java.lang.Exception { org.kie.api.runtime.rule.RuleContext kcontext = drools;
    drools.insert(new SuspiciousOperation($c, SuspiciousOperation.Type.SUSPICIOUS_DISCOUNT));
}

}