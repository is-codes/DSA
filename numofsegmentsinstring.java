package DSA;

public class numofsegmentsinstring {
    
    public int countSegments(String s) {
        if(s.trim().isEmpty()) return 0;
        String[] str = s.trim().split("\\s+");
        return str.length;
    }
}
