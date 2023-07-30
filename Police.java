public class Police 
{
    Detective detectives [] = new Detective[1];    
    Item Adam [] = new Item[1];

    public Police (Detective[] detectives)
    {
        Adam[0] = new Item("Pistol", 1);
        this.detectives [0] = new Detective("Adam Palmer", "Adam", "Detective", 1944, Adam);
    }

    public boolean areCriminalsCaught ()
    {
        int n;
        int max = 100, min = 0;
        n = min + (int)(Math.random() * ((max - min) + 1));
        Detective.SUCCESS_PERCENTAGE = Detective.SUCCESS_PERCENTAGE + detectives.length;
        if (n < Detective.SUCCESS_PERCENTAGE)
            return true;
        else
            return false;
    }

    
}
