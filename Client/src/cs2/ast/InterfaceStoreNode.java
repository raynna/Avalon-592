package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/23/11
 * Time: 10:25 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class InterfaceStoreNode extends AstNode{
    private boolean main;

    public InterfaceStoreNode(boolean main) {
        this.main = main;
    }

    public boolean isMain() {
        return main;
    }

    public String toString(){
        return (main ? "interfaces[" : "genInterfaces[")+children.get(0).toString() + "]";
    }
}
