package cs2;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 9:49 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public abstract class AstNode {
    protected LinkedList<AstNode> children = new LinkedList<AstNode>();
    private AstNode parent = null;

    public void addChild(AstNode node){
        children.add(node);
        node.parent = this;
    }

    public void removeChild(AstNode node){
        if (!children.contains(node))
            throw new RuntimeException("Tried to remove node that is not registered");
        children.remove(node);
        node.parent = null;
    }

    public void remove(){
        if (parent == null)
            throw new RuntimeException("Tried to remove node that is not registered");
        parent.children.remove(this);
        parent = null;
    }

    public LinkedList<AstNode> getChildren(){
        return children;
    }
}
