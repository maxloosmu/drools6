// package org.drools.devguide;
/**
 * Hello world!
 *
 */
// public class App
// {
//     public static void main( String[] args )
//     {
//         System.out.println( "Hello World!" );
//     }
// }

package org.drools6.book;
// import org.drools.devguide.eshop.model;
// package org.drools.devguide;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.drools.devguide.eshop.model.Item;

public class App {
  public static void main( String[] args ) {
    System.out.println( "Bootstrapping the Rule Engine ..." );
    //1) Bootstrapping a Rule Engine Session
    KieServices ks = KieServices.Factory.get();
    KieContainer kContainer = ks.getKieClasspathContainer();
    KieSession kSession = kContainer.newKieSession();
    Item item = new Item("A", 234.0, 0.0);
    Item item0 = new Item("B", 123.0, 0.0);
    System.out.println( "Item Category: " + item.getCategory());
    System.out.println( "Item Category: " + item0.getCategory());
    //2) Provide information to the Rule Engine Context
    kSession.insert(item);
    kSession.insert(item0);
    //3) Execute the rules that are matching
    int fired = kSession.fireAllRules();
    System.out.println( "Number of Rules executed = " + fired );
    System.out.println( "Item Category: " + item.getCategory());
    System.out.println( "Item Category: " + item0.getCategory());
  }
}