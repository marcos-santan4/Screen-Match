public class Home {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.nameMovie = "O poderoso chefão";
        myMovie.releaseYear = 1970;
        myMovie.durationInMinutes = 180;

        myMovie.showInfo();
        myMovie.Evaluate(8);
        myMovie.Evaluate(5);
        myMovie.Evaluate(10);
        System.out.printf("Sum of Ratings: %.2f\n", myMovie.sumOfRating);
        System.out.printf("Total Ratings: %d\n", myMovie.totalRatings);
        System.out.printf("Rating average: %f", myMovie.ratingAverage());
    }
}
