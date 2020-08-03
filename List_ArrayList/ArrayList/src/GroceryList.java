import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if (position >= 0) modifyGroceryItem(position, newItem);
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Item has been changed to " + newItem + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) removeGroceryItem(position);
        else System.out.println(item + " is not in the list");
    }

    private void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " has been removed");
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ") " + groceryList.get(i));
        }
    }
}
