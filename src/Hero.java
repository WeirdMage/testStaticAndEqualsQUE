public class Hero {
 private String name;

 public  Hero(String name) {
     this.name = name;
 }
 public String getHeroData(){
     return "hero with name "+ name + " data: " +  SharedData.URL;
 }
}
