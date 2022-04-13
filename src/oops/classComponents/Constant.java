package oops.classComponents;

public class Constant {
    static String username = "user";

    static class MysqlConstant {
       static String mysqlUsername ="mysql";
    }

    static class OracleConstant {
        static String oracleUsername ="oracle";
    }

    public static void main(String[] args) {
        System.out.println(Constant.username);
        System.out.println(Constant.MysqlConstant.mysqlUsername);
        System.out.println(OracleConstant.oracleUsername);
    }
}
