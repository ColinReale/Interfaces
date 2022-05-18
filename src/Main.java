public class Main {

    public static void main(String[] args) {
        // test your classes here

        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Murdock's Revenge", "The Unbelievable Misconceptions of a Chinese Poet", 2004));
        box.add(new CD("Dashboard Confessional", "The Swiss Army Romance", 2001));
        box.add(new CD("Jimmy Eat World", "Futures", 2004));

        System.out.println(box);
    }

}