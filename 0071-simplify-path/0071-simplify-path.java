class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] result = path.split("/");

        for (String str: result){
            if (str.equals("..") && !stack.isEmpty()){
               stack.pop(); 
            } else if (str.equals(".") || str.isEmpty()){
                continue;
            } else if (!str.equals("..")){
                stack.push(str);
            }
        }
        if (stack.isEmpty()){
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        for (String elem: stack){
            sb.append("/");
            sb.append(elem); 
        }

        return sb.toString();
    }
}