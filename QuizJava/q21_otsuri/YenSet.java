package otsuri;

final class YenSet {

    final int yen10;
    final int yen5;
    final int yen1;

    YenSet(int yen10, int yen5, int yen1) {
        this.yen10 = yen10;
        this.yen5 = yen5;
        this.yen1 = yen1;
    }

    static YenSet start() {
        return new YenSet(1, 2, 5);
    }

    @Override
    public String toString() {
        int total = yen10 * 10 + yen5 * 5 + yen1;
        return String.format("%d円(➉x%d ⑤x%d ①x%d)", total, yen10, yen5, yen1);
    }
}
