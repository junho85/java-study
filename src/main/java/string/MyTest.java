package string;

import lombok.ToString;

//@ToString
public class MyTest {
    public String name;
    public String nickname;

//        @Override
//        public String toString() {
//            return name;
//        }

    @Override
    public String toString() {
        return "MyTest{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

}