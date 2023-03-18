public class Main {
    public static void main(String[] args) {

        int[] number = {1,2,3};

        try{
            System.out.println(number[10]);
        }
        catch(Exception e){
            System.out.println("404 not found");
        }
        finally {
            System.out.println("Search for another index");
        }
    }
}