public class Item {
    private String identifier;
    private String name;

    public Item (String _identifier, String _name) {
        this.identifier = _identifier;
        this.name = _name;
    }

    @Override
    public String toString() {
        return this.identifier+": "+this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Item)) {
            return false;
        }
        Item comparedItem = (Item) compared;
        if (!this.identifier.equals(comparedItem.identifier)) {
            return false;
        }
        return true;
    }

}
