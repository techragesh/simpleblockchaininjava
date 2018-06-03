import java.util.Arrays;

public class Block {

    private int previousHashCode;
    private String[] transcations;

    private int blockHashCode;

    public Block(String[] transcations,int previousHashCode) {
        this.previousHashCode = previousHashCode;
        this.transcations = transcations;

        Object[] contens= {Arrays.hashCode(transcations), previousHashCode};
        this.blockHashCode = Arrays.hashCode(contens);

    }

    public int getPreviousHashCode() {
        return previousHashCode;
    }

    public void setPreviousHashCode(int previousHashCode) {
        this.previousHashCode = previousHashCode;
    }

    public String[] getTranscations() {
        return transcations;
    }

    public void setTranscations(String[] transcations) {
        this.transcations = transcations;
    }

    public int getBlockHashCode() {
        return blockHashCode;
    }

    public void setBlockHashCode(int blockHashCode) {
        this.blockHashCode = blockHashCode;
    }
}

