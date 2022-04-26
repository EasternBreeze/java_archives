package otsuri;

final class People {

    private YenSet wallet;
    final String name;

    private final int itemPrice;

    People(String name, int itemPrice) {
        this.wallet = YenSet.start();
        this.name = name;
        this.itemPrice = itemPrice;
    }

    boolean payTo(People to) {
        for (int i = wallet.yen10; i >= 0; i--) {
            if (i * 10 > to.itemPrice) {
                continue;
            }

            for (int j = wallet.yen5; j >= 0; j--) {
                if (i * 10 + j * 5 > to.itemPrice) {
                    continue;
                }

                for (int k = wallet.yen1; k >= 0; k--) {
                    if (i * 10 + j * 5 + k == to.itemPrice) {
                        decreaseMoney(i, j, k);
                        to.incraseMoney(i, j, k);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    void incraseMoney(int yen10, int yen5, int yen1) {
        wallet = new YenSet(wallet.yen10 + yen10, //
                wallet.yen5 + yen5, //
                wallet.yen1 + yen1);
    }

    void decreaseMoney(int yen10, int yen5, int yen1) {
        wallet = new YenSet(wallet.yen10 - yen10, //
                wallet.yen5 - yen5, //
                wallet.yen1 - yen1);
    }

    @Override
    public String toString() {
        return String.format("%s:%s", name, wallet);
    }
}
