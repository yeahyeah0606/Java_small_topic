// 394. Decode String

class Solution {
    int ptr;
    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<String>();
        ptr = 0;

        while( ptr < s.length() ){
            char cur = s.charAt(ptr);
            if( Character.isDigit(cur) ){
                // 數字可能好幾位數
                String digits = getDigit(s);
                stk.addLast(digits);
            }else if( Character.isLetter(cur) || cur == '[' ){
                // 普通字元或左中括號
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            }else{
                // 遇到右中括號，要處理與最近的左中括號之間的字元
                ptr++;
                LinkedList<String> sub = new LinkedList<String>();
                while( !"[".equals(stk.peekLast()) ){
                    sub.addLast(stk.removeLast());
                }
                // 出來的順序要反轉
                Collections.reverse(sub);
                // 左括號出
                stk.removeLast();
                // 先在位置的值會是數字(幾次)
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                //建造出字串
                while( repTime-->0 ){
                    t.append(o);
                }
                // 放入Stack
                stk.addLast(t.toString());
            }
        }
        return getString(stk);   
    }        

    public String getDigit(String s){
        StringBuffer ret = new StringBuffer();
        while( Character.isDigit(s.charAt(ptr)) ){
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }

    public String getString(LinkedList<String> ss){
        StringBuffer ret = new StringBuffer();
        for(String s: ss){
            ret.append(s);
        }
        return ret.toString();
    }

}
