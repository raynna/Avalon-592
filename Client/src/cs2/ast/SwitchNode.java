package cs2.ast;

import cs2.AstNode;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/23/11
 * Time: 9:18 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class SwitchNode extends AstNode {
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("switch ("+children.get(0)+") {\n");
        for (int i = 1; i < children.size();i++){
            sb.append("\t"+children.get(i).toString()+"\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
