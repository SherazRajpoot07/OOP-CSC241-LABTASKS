
public class LibrarySection {
    private String sectionName;
    private LibraryItem[] items;
    private int count = 0;

    public LibrarySection(String sectionName) {
        this.sectionName = sectionName;
        this.items = new LibraryItem[4];
    }

    public void addItem(LibraryItem item) {
        if (count >= items.length) {
            System.out.println("Section is full.");
            return;
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                count++;
                return;
            }
        }
    }

    public void displayItems() {
        System.out.println("Section Name: " + sectionName);

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[i].displayInfo();
            }
        }
    }
}
