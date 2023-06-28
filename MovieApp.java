class Movie
{
String movieName;
String movieHero;
String movieHeroine;
int no_of_actors;
void movieMake()
{
System.out.println("Movie is making");
}
void movieWatch()
{
System.out.println("Movie is watching");
}
}
class MovieApp
{
public static void main(String[] args)
{
Movie m1=new Movie();
Movie m2=new Movie();

m1.movieMake();
m1.movieWatch();

m1.movieName="Kantara";
m1.movieHero="Rishab";
m1.movieHeroine="Saptami";
m1.no_of_actors=12;

System.out.println(m1.movieName);
System.out.println(m1.movieHero);
System.out.println(m1.movieHeroine);
System.out.println(m1.no_of_actors);
System.out.println("Pan india blockblaster movie made in karnataka in 2023");

System.out.println("====================================");

m2.movieMake();
m2.movieWatch();

m2.movieName="BangloreDays";
m2.movieHero="Nivin and Dulqur";
m2.movieHeroine="Nazriya";
m2.no_of_actors=10;

System.out.println(m2.movieName);
System.out.println(m2.movieHero);
System.out.println(m2.movieHeroine);
System.out.println(m2.no_of_actors);
System.out.println("Pan india blockblaster movie made in banglore");

}
}
