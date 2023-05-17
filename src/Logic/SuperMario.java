package Logic;

public class SuperMario {
    private String username;
    private String password;
    private String email;
    private int age;
    private int score;




//    public SuperMario(String username, String password, String email, int age, int score) {
//        setUsername(username);
//        setPassword(password);
//        setEmail(email);
//        setAge(age);
//        setScore(score);
//    }

    public int getScore() {
        return score;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
