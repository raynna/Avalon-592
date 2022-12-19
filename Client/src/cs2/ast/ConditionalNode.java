package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 11:42 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class ConditionalNode extends AstNode {

    public String toString(){
        return "if ("+children.get(0)+")\n\t"+children.get(1);
    }

}
