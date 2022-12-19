package cs2;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 10:19 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2Instruction {
    private int opcode;
    private int intOperand;
    private String stringOperand;

    public Cs2Instruction(int opcode, int intOperand,  String stringOperand) {
        this.opcode = opcode;
        this.intOperand = intOperand;
        this.stringOperand = stringOperand;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getIntOperand() {
        return intOperand;
    }

    public String getStringOperand() {
        return stringOperand;
    }


    public String toString(){
        if (opcode == 3)
            return Cs2ByteCode.name(opcode) + " \"" + stringOperand+"\"";
        return Cs2ByteCode.name(opcode) + " " + intOperand;
    }
}
