package Core.Model;

/**
 * Created by abdelrahman on 11/22/16.
 */
public interface Processor {
    /**
     * sets the initial values of registers, memory, PC, IR to zero
     */
    void initialize();

    /**
     * loads a program as an array of integers each integer representing
     * an 8-bit memory location. the starting address is the starting address
     * of the program in memory
     */
    void loadProgram(int[] code, int startingAddress);

    /**
     * fetch the instruction pointed to by PC in memory
     */
    void fetch();

    /**
     * executes the instruction currently in the IR register
     * where the opcode and the operand are fetched from the previous
     * fetch cycle
     */
    void execute();
}
