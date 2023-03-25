class BookSeat{

    int totalSeat=10;

    synchronized void bookSeat(int seats)
    {
        if(totalSeat>=seats)
        {
            System.out.println(seats + "seats are booked successfully!");
            totalSeat=totalSeat-seats;
            System.out.println("Seats Left: "+ totalSeat);
        }else{
            System.out.println("Sorry seats cannnot be booked!!");
            System.out.println("Seats Left: "+ totalSeat);
        }

    }
}


public class Example5 extends Thread {

    int seats;
    static BookSeat b;

    public void run()
    {
        b.bookSeat(seats);
    }


   public static void main(String[] args) {
    
        b = new BookSeat();
        Example5 parshwa = new Example5();
        parshwa.seats=7;
        parshwa.start();

        Example5 priyansh = new Example5();
        priyansh.seats=8;
        priyansh.start();
   } 
}
