public class User {
    String name;
    int age;
    public User (String name, int age) {
        this.name = String.valueOf(name);
        this.age = age;
    }
    public static void main(String[] args){
        User michael = new User ("Michael", 20);
        User rebeca = new User ("Rebeca", 22);
        User matthew = new User ("Matthew", 33);
        User[] users= {michael, rebeca, matthew};
        users.checkAverageAge();
    }
}
public void checkAverageAge (){
    int result= 0;
    for (int i= 0; i< users.lenght; i++) {
        result = result + users[i] / 3 ;
    }
}