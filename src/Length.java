public class Length{
    public static void main(String[] args){
        try{
        String str;
        str = null;
        System.out.println(str.length());
        }catch (java.lang.NullPointerException e) {
            System.out.println("例外NullPointerExceptionが発生しました。" + e.getMessage());
        }
    }
}