public class main {
    public void main(String[] args){
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt = 0;
        float floatInt = 4.4f;
        boolean isCold = false;
        double seperation = '_';

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
        System.out.println(floatInt);
        System.out.println(isCold);
        System.out.println(seperation);

        int firstAndSecond = firstInt + secondInt;
        System.out.println(firstAndSecond);

        int firstAndThird = firstInt + thirdInt;
        System.out.println(firstAndThird);

        System.out.println(firstInt / secondInt);

        int modOneTwo = firstInt % secondInt;
        System.out.println(modOneTwo);

        int firstAndModTwo = firstInt + modOneTwo + 1;
        System.out.println(firstAndModTwo);

        int x = 30;
        boolean xEquals = x == 100;
        int y = 106;
        boolean xGreaterThanY = x > y;
        boolean yGreaterThanX = y > x;
        boolean xGreaterOrEqual = x >= y - 6;
        int z = 92;
        boolean xLessThany = x < y && y < z;
        boolean yLessThanZ = y < z && x >= y;
        boolean zGreaterThany = z > y + x || x - y < 1;

        System.out.println(x < y == !(x > y));

        anotherMethod();



    }
    public static void anotherMethod()
    {
        Integer f = 234;
        int newF = f / 2;
        String integer = "1000";
        if ((f.compareTo(newF)) == 1){
            System.out.println(f + "Big Value");
            System.out.println(newF + "is half a big value");
        }else{
            System.out.println(f + "Not a big value");
            System.out.println(newF + "is definitely small");
        }
    }
    public static void playWithStrings(){
        String firstName = "spaghetti";
        String lastName = new last("meatballs");

        System.out.println("Hello" + firstName.concat(lastName));
    }
    }