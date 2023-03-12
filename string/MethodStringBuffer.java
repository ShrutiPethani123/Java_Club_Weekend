public class MethodStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Royal");
        System.out.println(sb);
        // sb.append(" Technosoft"); // Royal Technosoft
        // sb.insert(2,"Joy"); // RoJoyyal
        // sb.replace(2,4,"java"); //
        // sb.replace(3,4,"hello");
        // sb.delete(1,2);
        // char ch= sb.charAt(0);
        // // sb.reverse();
        // System.out.println(sb);
        // System.out.println(ch);
        // int i = sb.indexOf("y");
        // System.out.println(i);
        // sb.setCharAt(2,'t');
        // sb.append(6);
        // sb.append(8.9);
        // sb.deleteCharAt(3);
        String s = sb.substring(2,4);
        System.out.println(s);

    }
}

// String str="KIWI" --> IWIK
