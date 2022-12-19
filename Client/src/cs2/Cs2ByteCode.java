package cs2;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/24/11
 * Time: 10:36 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2ByteCode {
    private static HashMap<Integer, String> opcodes = new HashMap<Integer, String>();
    private static HashMap<Integer, String> setters = new HashMap<Integer, String>();

    public static String name(int opcode){
        if (opcodes.containsKey(opcode))
            return opcodes.get(opcode);
        if (setters.containsKey(opcode))
            return setters.get(opcode);
        return "OP"+opcode;
    }

    public static boolean isSetter(int op){
        return setters.containsKey(op);
    }

    static {
        opcodes.put(0,"PushOperand");
        opcodes.put(1,"PushConfig");
        opcodes.put(2,"PopConfig");
        opcodes.put(3,"PushSOperand");
        opcodes.put(6,"JumpOperand");
        opcodes.put(7,"BranchNEQ");
        opcodes.put(8,"BranchEQ");
        opcodes.put(9,"BranchST");
        opcodes.put(10,"BranchBT");
        opcodes.put(21,"Return");
        opcodes.put(25,"PushVarBit");
        opcodes.put(27,"PopVarBit");
        opcodes.put(31,"BranchSTQ");
        opcodes.put(32,"BranchBTQ");
        opcodes.put(33,"PushLocalInt");
        opcodes.put(34,"PopLocalInt");
        opcodes.put(35,"PushLocalString");
        opcodes.put(36,"PopLocalString");
        opcodes.put(37,"MergeSStack");
        opcodes.put(38,"DiscardPopInt");
        opcodes.put(39,"DiscardPopString");
        opcodes.put(40,"Call");
        opcodes.put(42,"PushGlobalInt");
        opcodes.put(43,"PopGlobalInt");
        opcodes.put(44,"DimArray");
        opcodes.put(45,"PushArray");
        opcodes.put(46,"PopArray");
        opcodes.put(47,"PushGlobalString");
        opcodes.put(48,"PopGlobalString");
        opcodes.put(51,"Switch");

        opcodes.put(54,"PushLongOperand");
        opcodes.put(55,"DiscardPopLong");
        opcodes.put(66,"PushLocalLong");
        opcodes.put(67,"PopLocalLong");
        opcodes.put(68,"BranchLongNEQ");
        opcodes.put(69,"BranchLongEQ");
        opcodes.put(70,"BranchLongST");
        opcodes.put(71,"BranchLongBT");
        opcodes.put(72,"BranchLongSTQ");
        opcodes.put(73,"BranchLongBTQ");

        opcodes.put(86,"BranchTrue");
        opcodes.put(87,"BranchFalse");

        opcodes.put(101,"cc_delete");
        opcodes.put(200,"cc_load_i");
        opcodes.put(201,"cc_load_rsh");
        opcodes.put(102,"cc_reset");
        opcodes.put(100,"cc_create");
        opcodes.put(1000,"cc_position");
        opcodes.put(1001,"cc_size");
        opcodes.put(1300,"AddMenuAction");
        opcodes.put(1117,"PopMask");
        opcodes.put(1105,"PushDImage");
        opcodes.put(1414,"SetScriptParamA");
        opcodes.put(4200,"PushItemName");
        opcodes.put(3110,"SendPacket195");
        opcodes.put(2800,"PushOptionMask");
        opcodes.put(2801,"PushMenuAction");
        opcodes.put(2600,"PushScrollposH");
        opcodes.put(2601,"PushScrollposV");
        opcodes.put(2602,"PushDText");
        opcodes.put(1112,"PopDText");
        opcodes.put(2603,"PushScrollmaxH");
        opcodes.put(2604,"PushScrollmaxV");
        opcodes.put(1120,"PopScrollMaxes");
        opcodes.put(2500,"PushAX");
        opcodes.put(2501,"PushAY");
        opcodes.put(2502,"PushAWidth");
        opcodes.put(2503,"PushAHeight");
        opcodes.put(1122,"cc_setSLM");
        opcodes.put(2000,"cc_positionX");
        opcodes.put(2300,"AddMenuActionX");
        opcodes.put(2117,"PopMaskX");
        opcodes.put(2105,"PushDImageX");
        opcodes.put(2414,"SetScriptParamAX");
        opcodes.put(2112,"PopDTextX");
        opcodes.put(2120,"PopScrollMaxesX");
        opcodes.put(2001,"cc_sizeX");
        opcodes.put(2122,"cc_setSLMX");
        opcodes.put(3408,"PushDataFile");
        opcodes.put(4000,"AddStack");
        opcodes.put(4001,"MinStack");
        opcodes.put(4002,"MultiplyStack");
        opcodes.put(4003,"DivideStack");
        opcodes.put(4004,"RndStack");
        opcodes.put(4005,"RmdStackA");
        opcodes.put(4006,"WF1Stack");
        opcodes.put(4007,"WF2Stack");
        opcodes.put(4011,"ModStack");
        opcodes.put(4012,"PowStack");
        opcodes.put(4013,"PowBZStack");
        opcodes.put(4014,"AndStack");
        opcodes.put(4015,"OrStack");
        opcodes.put(4016,"BiggestQStack");
        opcodes.put(4017,"BiggestStack");
        opcodes.put(4018,"MulDivStack");
        setters.put(1407,"ConfigReset");
        setters.put(1410,"LeftClick");
        setters.put(1411,"MouseDragged");
        setters.put(1412,"MouseMoved");
        setters.put(1415,"SkillChanged");
        setters.put(1428,"ConfigChanged");
        setters.put(1429,"StringPoolChanged");
        setters.put(1411,"MouseDragged");
        setters.put(1416,"IDK0");
        setters.put(1417,"IDK1");
        setters.put(1418,"IDK2");
        setters.put(1419,"KeyPressed");
        setters.put(1414,"InvChanged");
        setters.put(1404,"MouseLeaved");
        setters.put(1403,"MouseEntered");
        setters.put(1402,"MouseReleased");
        setters.put(1401,"MouseDraggedOver");
        setters.put(1400,"MousePressed");
    }
}
