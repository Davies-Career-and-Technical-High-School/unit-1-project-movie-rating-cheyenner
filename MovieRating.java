import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);  
        System.out.println("please enter the movie name");
        String moviename= scan.nextLine();
        System.out.println("please enter the running time in minutes");
        int runtime = scan.nextInt();
        System.out.println("please enter ratings from the movie review website");
        int web2 = scan.nextInt();
        int web1 = scan.nextInt();int web3 = scan.nextInt();
        System.out.println("Please enter ratings from the focus group");
        double focus1 = scan.nextDouble();
        double focus2 = scan.nextDouble();
         System.out.println("Please enter the average movie critic rating");
         double average = scan.nextDouble();
         System.out.println("title: "+ moviename);
         int hours = runtime / 60;
         int minutes = runtime % 60;
         System.out.println("running time;" + hours +"h" + minutes);
         System.out.println("average movie rating"+ ((web1+web2+web3)/3));
         System.out.println("average focus rating"+((focus1+focus2)/2) );
         System.out.print("average movie critic rating"+ average);
         System.out.println("overall movie rating"+ (int)((((web1+web2+web3)/3)*0.2)+(((focus1+focus2)/2)*0.3)+(average *0.5)));
        



    }
}