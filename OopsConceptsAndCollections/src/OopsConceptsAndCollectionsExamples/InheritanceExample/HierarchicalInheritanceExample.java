package OopsConceptsAndCollectionsExamples.InheritanceExample;
//When two or more classes inherits a single class, it is known as hierarchical inheritance.
// In the example given below,
// Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.
class Movie {
    private String movieName = "VIKRAM";
    void movieDetails() {
        System.out.println("Movie name is "+movieName);

    }
}
class Hero extends Movie {
    private String heroName = "Kamal Hasan";
    void heroDeatils() {
        System.out.println("hero of the movie is "+heroName);
    }

}
class Director extends Movie {
    private String directorName = "Lokesh";
    void directorDeatils() {
        System.out.println("Director of the movie is "+directorName);
    }

}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.heroDeatils();
        h1.movieDetails();
      //  h1.directorDeatils(); C.T.Error
        Director d1 = new Director();
        d1.directorDeatils();
        d1.movieDetails();
       // d1.heroDeatils(); C.T.Error

    }
}
