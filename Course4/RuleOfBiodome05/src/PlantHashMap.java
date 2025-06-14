// 제네릭 클래스: K(식물 이름), V(식물 특징)
class PlantHashMap<K, V> {
    private static final int SIZE = 16;
    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public PlantHashMap() {
        table = new Entry[SIZE];
    }

    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        table[index] = new Entry<>(key, value);
        System.out.println("'" + key + "' 추가: '" + value + "'");
    }

    public void get(K key) {
        int index = getIndex(key);
        Entry<K, V> entry = table[index];

        if (entry != null && entry.key.equals(key)) {
            System.out.println("'" + key + "' 검색: '" + entry.value + "'");
        } else {
            System.out.println("'" + key + "' 검색: 해당 식물이 존재하지 않습니다.");
        }
    }

    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> entry = table[index];

        if (entry != null && entry.key.equals(key)) {
            table[index] = null;
            System.out.println("'" + key + "' 삭제: '" + key + "'와 그 특징이 삭제되었습니다.");
        } else {
            System.out.println("'" + key + "' 삭제: 해당 식물이 존재하지 않습니다.");
        }
    }

    public int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }
}
