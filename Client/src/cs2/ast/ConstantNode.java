package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 9:54 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class ConstantNode extends AstNode {
    private Object value;

    public ConstantNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        ConstantNode that = (ConstantNode) o;

        if (!value.equals(that.value))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public String toString(){
        return value.toString();
    }
}
