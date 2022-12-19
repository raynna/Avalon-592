package cs2;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 9:58 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2Variable {
    private Cs2Type type;
    private Cs2Scope scope;
    private int id;
    private String name;

    public Cs2Variable(Cs2Type type, Cs2Scope scope, int id) {
        this.type = type;
        this.scope = scope;
        this.id = id;
    }

    public Cs2Type getType() {
        return type;
    }

    public Cs2Scope getScope() {
        return scope;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cs2Variable that = (Cs2Variable) o;

        if (id != that.id)
            return false;
        if (scope != that.scope)
            return false;
        if (type != that.type)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + scope.hashCode();
        result = 31 * result + id;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
