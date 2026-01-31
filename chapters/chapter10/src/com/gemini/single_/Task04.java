package com.gemini.single_;

public class Task04 {
    public static void main(String[] args) {
        // GirlFriend g1 = new GirlFriend("小红"); // 这一行必须报错！
        GirlFriend g1 = GirlFriend.getInstance();
        System.out.println(g1);

        GirlFriend g2 = GirlFriend.getInstance();
        System.out.println(g2);

        // 验证 g1 和 g2 是不是同一个人 (比较地址)
        System.out.println(g1 == g2);
    }
}
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("小红");
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}