package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/23/11
 * Time: 12:41 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class BuiltinNode extends AstNode {
    private String name;

    public BuiltinNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name+"(");
        if (children.size() != 0){
            for (int i = 0;i < children.size() - 1;i++)
                sb.append(children.get(i)+",");
            sb.append(children.get(children.size()-1)+")");
        }               else
         sb.append(")");
        return sb.toString();
    }
}
