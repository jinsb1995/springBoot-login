package hello.login.web;

// 객체를 생성하지 않고 LOGIN_MEMBER만 가져다 쓸 거라서
// 객체를 생성하지 못하게 abstract나 interface로 만들어서 사용해도 된다.
public class SessionConst {
    public static final String LOGIN_MEMBER = "loginMember";
}

/**
 * public interface SessionConst {
 *     String LOGIN_MEMBER = "loginMember";
 * }
 * public abstract SessionConst {
 *     public static final String LOGIN_MEMBER = "loginMember";
 * }
 */
