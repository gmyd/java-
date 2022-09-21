public class Main
{
    public static void main(String[] args)
    {
        char grade='L';
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent:passed");
                break;
            case 'B':
                System.out.println("Perfect:passed");
                break;
            case 'C':
                System.out.println("Good:passed");
                break;
            case 'D':
                System.out.println("Not bad:passed");
                break;
            case 'F':
                System.out.println("Unfortunately:failed");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}