// Class que vai receber as informações de filmes
public class Movie {
    // definição de uma classe
    String nameMovie;
    int releaseYear;
    boolean includedPlan;
    double sumOfRating; // adicionar private
    int totalRatings; // adicionar private
    int durationInMinutes;

    void showInfo() {
        System.out.printf("Film's name: %s\n", nameMovie);
        System.out.printf("Release year: %d\n", releaseYear);
        System.out.println("Include in Plan: "+ includedPlan);
        System.out.printf("Total of ratings: %d\n", totalRatings);
        System.out.printf("Duration in minutes: %d\n", durationInMinutes);
    }

    void Evaluate(double nota) {
        sumOfRating += nota;
        totalRatings++;
    }

    double ratingAverage() {
        return sumOfRating/totalRatings;
    }
}
