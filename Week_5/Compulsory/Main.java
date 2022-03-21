public class Main {
    /**
     * This is the main function
     * @param args
     */
    public static void main(String args[]) {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() {
        Catalog catalog = new Catalog("MyRefs");

        var book = new Item("article1");
        var article = new Item("book1");

        catalog.add(book);
        catalog.add(article);
    }

    private void testLoadView() {

    }
}