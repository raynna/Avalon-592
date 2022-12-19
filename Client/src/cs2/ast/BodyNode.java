package cs2.ast;

import cs2.AstNode; /**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 11:12 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class BodyNode extends AstNode {

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < children.size();i++)
            sb.append(children.get(i)+";\n");
        return sb.toString();
    }

}
