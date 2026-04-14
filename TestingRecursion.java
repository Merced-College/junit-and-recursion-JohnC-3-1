// John Chiero
// 4/14/2026
// Testing Recursion

public class TestingRecursion {
    public static int count8(int n) {
        if(n == 0) {
            return 0;
        } else {
            if(n % 10 == 8) {
                if((n / 10) % 10 == 8) {
                    return 2 + count8(n / 10);
                } else {
                    return 1 + count8(n / 10);
                }
            } else {
                return 0 + count8(n / 10);
            }
        }
    }

    public static int countHi(String str) {
        if(str.isEmpty()) {
            return 0;
        } else {
            if(str.charAt(0) == 'h') {
                if(str.length() > 1) {
                    if(str.charAt(1) == 'i') {
                        return 1 + countHi(str.substring(2));
                    }
                } else {
                    return 0;
                }
            }
        }
        return 0 + countHi(str.substring(1));
    }

    public static int countHi2(String str) {
        if(str.isEmpty()) {
            return 0;
        } else {
            if(str.charAt(0) == 'x') {
                if(str.length() > 1) {
                    if(str.charAt(1) == 'h') {
                        return 0 + countHi2(str.substring(2));
                    }
                } else {
                    return 0;
                }
            } else {
                if(str.charAt(0) == 'h') {
                    if(str.length() > 1) {
                        if(str.charAt(1) == 'i') {
                            return 1 + countHi2(str.substring(2));
                        }
                    } else {
                        return 0;
                    }
                }
            }
        }
        return 0 + countHi2(str.substring(1));
    }

    public static int strCount(String str, String sub) {
        if(str.length() < sub.length()) {
            return 0;
        } else {
            if(str.substring(0, sub.length()).equals(sub)) {
                return 1 + strCount(str.substring(1), sub);
            }
        }
        return 0 + strCount(str.substring(1), sub);
    }

    public static  String stringClean(String str) {
        if(str.length() == 1) {
            return str.substring(0);
        } else {
            if(str.charAt(0) == str.charAt(1)) {
                return stringClean(str.substring(1));
            } else {
                return str.substring(0, 1) + stringClean(str.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));
    }
}