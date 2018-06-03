public class Main {

    public static void main(String[] args) {

        String[] genesisTranscations = {"Andrew sent 1000 euro to Peter through World Bank"};
        int genesisHashCode = 0;

        Block genesisBlock = new Block(genesisTranscations, genesisHashCode);

        String[] block2Transcations = {"Andrew sent 500 euro to Sam through Bank "};

        Block block2 = new Block(block2Transcations, genesisBlock.getBlockHashCode());

        String[] block3Transcations = {"Andrew sent 5000 euro to Sandy through Bank "};

        Block block3 = new Block(block3Transcations, block2.getBlockHashCode());

        System.out.println("Genesis Block (First Block) Hash---------->" + genesisBlock.getBlockHashCode());

        System.out.println("Block 2 Hash---------->" + block2.getBlockHashCode());

        System.out.println("Block 3 Hash---------->" + block3.getBlockHashCode());


    }
}
