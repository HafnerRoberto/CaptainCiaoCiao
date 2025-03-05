public class TreasureChest {
    public final int goldDoubloonWeight;
    public final int gemstoneWeight;

    private TreasureChest(int goldDoubloonWeight, int gemstoneWeight) {
        if (goldDoubloonWeight < 0 || gemstoneWeight < 0)
            throw new IllegalArgumentException();

        this.goldDoubloonWeight = goldDoubloonWeight;
        this.gemstoneWeight = gemstoneWeight;

    }

    public static TreasureChest newInstance() {
        return new TreasureChest(0, 0);
    }

    public static TreasureChest newInstancewithgoldDoublonnWeight(int goldDoubloonWeight) {
        return new TreasureChest(goldDoubloonWeight, 0);
    }

    public static TreasureChest newInstancegemstoneWeight(int gemstoneWeight) {
        return new TreasureChest(0, gemstoneWeight);
    }

    public static TreasureChest newInstancewithgoldDoublonnWeightgemstoneWeight(int goldDoubloonWeight, int gemstoneWeight) {
        return new TreasureChest(goldDoubloonWeight, gemstoneWeight);
    }

}
