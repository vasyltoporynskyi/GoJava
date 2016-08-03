package core.collections.treeee3;


enum Instruction {
    q, h, b, f, d, list, in, pre, post, graph, r;

    public static boolean isContained(String string, String commandPrefix) {

        if (string.equals(commandPrefix + Instruction.b)
                || string.equals(commandPrefix + Instruction.h)
                || string.equals(commandPrefix + Instruction.d)
                || string.equals(commandPrefix + Instruction.f)
                || string.equals(commandPrefix + Instruction.list)
                || string.equals(commandPrefix + Instruction.in)
                || string.equals(commandPrefix + Instruction.pre)
                || string.equals(commandPrefix + Instruction.r)
                || string.equals(commandPrefix + Instruction.post)
                || string.equals(commandPrefix + Instruction.graph))
        {
            return true;
        }
        return false;
    }

}
